package base_de_datos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Pendiente;

public class BD_Pendiente {
	public BDPrincipal _bDPrincipal;
	public Vector<Pendiente> _pendiente = new Vector<Pendiente>();

	public void realizarCompra(Producto[] aProductos, UR aUsuario, int[] aUnidades) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		int contador = 0;
		
		Encargado_de_compras[] encargados = Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null, null);
		Transportista[] transportistas = TransportistaDAO.listTransportistaByQuery(null, null);
		
		Random rand = new Random();
		int randomNum = rand.nextInt((encargados.length));
		
		
		/*En que cola se va a asignar*/
		int randomCola = rand.nextInt(transportistas.length);
		
		
		/*Generamos un numero aleatorio que sera el encargado al que le toque*/
		Encargado_de_compras encargado = encargados[randomNum];
		
		Pendiente pendiente = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String fechaActualizacion = formatter.format(date);
		/*Paso 1. Insertar en Pendiente*/
		try {
			
			pendiente = PendienteDAO.createPendiente();
			pendiente.setORM__Encargado_de_compras(encargado);
			pendiente.setORM__Hace_compra(aUsuario);
			pendiente.setAsignado(false);
			pendiente.setId_cola(randomCola);
			
			pendiente.setFecha_estado(fechaActualizacion);
			
			PendienteDAO.save(pendiente);
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		
		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
		Producto_en_compra[] productos =  new Producto_en_compra[aProductos.length];
		int cont = 0;

		/*Paso 2. Crear el producto en compra y relacionar con pendiente*/
		try {
			for(Producto p : aProductos) {
				Producto_en_compra pec = Producto_en_compraDAO.createProducto_en_compra();
				productos[cont] = pec;
				cont++;
				
				pec.setORM__Producto(p);
				pec.setNum_unidades_producto(aUnidades[contador]);
				pec.setORM__Pendiente(pendiente);
				contador++;
				Producto_en_compraDAO.save(pec);
			}
			
			t2.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t2.rollback();
		}

		contador = 0;
		
		MDS2PersistentManager.instance().disposePersistentManager();
		/*Paso 3. Actualizar los datos de Producto*/
		PersistentTransaction t3 = MDS2PersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Producto p: aProductos) {
				p.setNum_Unidades_Restantes(p.getNum_Unidades_Restantes() - aUnidades[contador]);
				int numUnidadesVendidas = 0;
				if(p.getNum_Unidades_Vendidas() != null) {
					numUnidadesVendidas = Integer.parseInt(p.getNum_Unidades_Vendidas());
				} else {
				}
				p.setNum_Unidades_Vendidas("" + (numUnidadesVendidas + aUnidades[contador]));
				contador++;
				
				ProductoDAO.save(p);
			}
			
			t3.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t3.rollback();
		}		
	}

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException {
		Pendiente[] pendientes = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			pendientes = PendienteDAO.listPendienteByQuery(
					"Encargado_de_comprasEmpleadoIdEmpleado = " + aIdEncargado + " AND ASIGNADO = 0", null);
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		MDS2PersistentManager.instance().disposePersistentManager();

		return pendientes;
	}

	public Pendiente[] cargarPendientes() throws PersistentException {
		Pendiente[] pendientes = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			pendientes = PendienteDAO.listPendienteByQuery("Asignado = 0", null);
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		MDS2PersistentManager.instance().disposePersistentManager();

		return pendientes;
	}

	public boolean eliminarPendiente(Pendiente aPedidoPendiente, Enviado aEnviado) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {

			aPedidoPendiente.setAsignado(true);
			PendienteDAO.save(aPedidoPendiente);
			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}

		return true;
	}
	
	public Pendiente[] cargarPendientes(UR aUsuario) {
		Pendiente[] listaP = null;
		
		try {
			listaP = PendienteDAO.listPendienteByQuery("URUsuario_GeneralId_Usuario = " + aUsuario.getId_Usuario() + " AND asignado = 0", null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return listaP;

	}
	
	public boolean cancelarPedido(int aIdPedido) throws PersistentException {
		Pendiente p = PendienteDAO.getPendienteByORMID(aIdPedido);

		this._bDPrincipal = new BDPrincipal();
		this._bDPrincipal.eliminarProductosEnCompra(p);
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		
		try {
			PendienteDAO.delete(p);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}
		
		return true;

	}
}

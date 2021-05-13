package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Pendiente;

public class BD_Pendiente {
	public BDPrincipal _bDPrincipal;
	public Vector<Pendiente> _pendiente = new Vector<Pendiente>();

	public void realizarCompra(Producto[] aProductos, int aId_Usuario) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosPendientes(int aIdEncargado) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] cargarPedidosE(int aIdEncargado) throws PersistentException {
		Pendiente[] pendientes = null;
		
		try {
			pendientes = PendienteDAO.listPendienteByQuery("Encargado_de_comprasEmpleadoIdEmpleado = "+ aIdEncargado, null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return pendientes;
	}
	
	public Pendiente[] cargarPendientes() throws PersistentException {
		Pendiente[] pendientes = null;
		
		try {
			pendientes = PendienteDAO.listPendienteByQuery(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pendientes;
	}
	
	public boolean eliminarPendiente(Pendiente aPedidoPendiente) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			
			System.out.println(aPedidoPendiente.getCodigo());
			aPedidoPendiente.get_Encargado_de_compras()._Pendiente.remove(aPedidoPendiente);
			aPedidoPendiente.get_Hace_compra()._Compra.remove(aPedidoPendiente);
//			aPedidoPendiente._Producto_en_compra;
			
			PendienteDAO.delete(aPedidoPendiente);
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}

		return true;
	}
}
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
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			pendientes = PendienteDAO.listPendienteByQuery("Encargado_de_comprasEmpleadoIdEmpleado = "+ aIdEncargado, null);
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();

		return pendientes;
	}
	
	public Pendiente[] cargarPendientes() throws PersistentException {
		Pendiente[] pendientes = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			pendientes = PendienteDAO.listPendienteByQuery(null, null);
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();

		return pendientes;
	}
	
	public boolean eliminarPendiente(Pendiente aPedidoPendiente) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			
			aPedidoPendiente.setORM__Encargado_de_compras(null);
			aPedidoPendiente.setORM__Hace_compra(null);
			
//			for(Pendiente p : aPedidoPendiente.get_Encargado_de_compras()._Pendiente.toArray()) {
//				aPedidoPendiente.get_Encargado_de_compras()._Pendiente.remove(p);
//			}
//			
//			for(Pendiente p : aPedidoPendiente.get_Hace_compra()._Compra.toArray()) {
//				aPedidoPendiente.get_Hace_compra()._Compra.remove(p);
//			}
			
//			for(Producto_en_compra prc : aPedidoPendiente._Producto_en_compra.toArray()) {
//				 aPedidoPendiente._Producto_en_compra.remove(prc);
//			}
			
			this._bDPrincipal = new BDPrincipal();
			this._bDPrincipal._bD_Productos_en_compra.eliminarProductosEnCompra(aPedidoPendiente);
			
			PendienteDAO.delete(aPedidoPendiente);
			
			t.commit();
			
			HitoPersistentManager.instance().disposePersistentManager();

		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			
			HitoPersistentManager.instance().disposePersistentManager();

			return false;
		}

		return true;
	}
}
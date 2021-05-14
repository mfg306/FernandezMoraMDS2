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
			pendientes = PendienteDAO.listPendienteByQuery("Encargado_de_comprasEmpleadoIdEmpleado = "+ aIdEncargado
				+ " AND ASIGNADO = 0", null);
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
			
			aPedidoPendiente.setAsignado(true);
			PendienteDAO.save(aPedidoPendiente);
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
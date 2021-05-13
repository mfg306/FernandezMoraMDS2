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
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Pendiente[] pendientes = null;
		
		try {
			pendientes = PendienteDAO.listPendienteByQuery("Encargado_de_comprasEmpleadoIdEmpleado = "+ aIdEncargado, null);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		return pendientes;
	}
	
	public Pendiente[] cargarPendientes() throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Pendiente[] pendientes = null;
		
		try {
			pendientes = PendienteDAO.listPendienteByQuery(null, null);
			t.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		return pendientes;
	}
}
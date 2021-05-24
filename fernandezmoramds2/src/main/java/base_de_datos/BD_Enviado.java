package base_de_datos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Enviado {
	public BDPrincipal _bDPrincipal;
	public Vector<Enviado> _enviado = new Vector<Enviado>();

	public Enviado[] cargarPedidosT(Transportista aTransportista) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Enviado[] e = null;
		try {
			e = EnviadoDAO.listEnviadoByQuery("TransportistaEmpleadoIdEmpleado = " + aTransportista.getIdEmpleado() , null);
		} catch(Exception ex) {
			ex.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();
		
		return e;
	}

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Transportista aTransportista, Encargado_de_compras aEncargado) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		Enviado e = EnviadoDAO.createEnviado();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String fechaActualizacion = formatter.format(date);
		
		e.setORM__Procesa(aEncargado);
		e.setORM__Transportista(aTransportista);
		e.setFecha_estado(fechaActualizacion);
		e.setNum_total_unidades(aPedidoPendiente.getNum_total_unidades());
		e.setPrecio_total(aPedidoPendiente.getPrecio_total());
		
		try {
			EnviadoDAO.save(e);
			t.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			t.rollback();
		}
		
		this._bDPrincipal = new BDPrincipal();
		
		try {
			this._bDPrincipal.eliminarPendiente(aPedidoPendiente);
		} catch(Exception ex2) {
			ex2.printStackTrace();
		}
	}
	
	public Enviado[] cargarEnviados() throws PersistentException {
		Enviado[] enviados = null;
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			enviados = EnviadoDAO.listEnviadoByQuery(null, null);
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();

		return enviados;
		
	}
	
	public UR cargarClienteEnviado(Transportista aTransportista, Enviado aEnviado) throws PersistentException {
		Encargado_de_compras encargado = aEnviado.get_Procesa();
		
		Pendiente pendientes[] = PendienteDAO.listPendienteByQuery("Encargado_de_comprasEmpleadoIdEmpleado = " + encargado.getIdEmpleado(), null);
		
		for(Pendiente p : pendientes) {
			if(p.getId_cola() == aTransportista.getId_cola()) {
				return p.get_Hace_compra();
			}
		}
		return null;
	}
	
	public boolean eliminarEnviado(Enviado aEnviado) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			aEnviado.setEnviado(true);
			EnviadoDAO.save(aEnviado);
			t.commit();
		} catch(Exception e){
			e.printStackTrace();
			t.rollback();
			return false;
		}
		
		return true;
	}
	
	public Enviado[] cargarEnviados(UR aUsuario) {
		return null;
	}
}

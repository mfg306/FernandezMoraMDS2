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
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Enviado[] e = null;
		try {
			e = EnviadoDAO.listEnviadoByQuery("TransportistaEmpleadoIdEmpleado = " + aTransportista.getIdEmpleado(),
					null);
		} catch (Exception ex) {
			ex.printStackTrace();
			t.rollback();
		}

		return e;
	}

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Encargado_de_compras aEncargado) throws PersistentException {
		
		Transportista transportista = null;
		
		this._bDPrincipal = new BDPrincipal();
		transportista = this._bDPrincipal.buscarTransportistaCola(aPedidoPendiente.getId_cola());
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		Enviado e = EnviadoDAO.createEnviado();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String fechaActualizacion = formatter.format(date);

		e.setORM__Procesa(aEncargado);
		e.setCodigoPendiente(aPedidoPendiente.getCodigo());
		e.setORM__Transportista(transportista);
		e.setFecha_estado(fechaActualizacion);
		e.setNum_total_unidades(aPedidoPendiente.getNum_total_unidades());
		e.setPrecio_total(aPedidoPendiente.getPrecio_total());

		try {
			EnviadoDAO.save(e);
			t.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			t.rollback();
		}

		this._bDPrincipal = new BDPrincipal();

		try {
			this._bDPrincipal.eliminarPendiente(aPedidoPendiente, e);
		} catch (Exception ex2) {
			ex2.printStackTrace();
		}
		
	}

	public Enviado[] cargarEnviados() throws PersistentException {
		Enviado[] enviados = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			enviados = EnviadoDAO.listEnviadoByQuery(null, null);
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

		return enviados;

	}

	public UR cargarClienteEnviado(Transportista aTransportista, Enviado aEnviado) throws PersistentException {
		int codigoPendiente = aEnviado.getCodigoPendiente();
		Pendiente p = PendienteDAO.getPendienteByORMID(codigoPendiente);
		UR usuario = p.get_Hace_compra();
		
		return usuario;
		
	}

	public boolean eliminarEnviado(Enviado aEnviado) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			aEnviado.setEnviado(true);
			EnviadoDAO.save(aEnviado);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			MDS2PersistentManager.instance().disposePersistentManager();

			return false;
		}

		return true;
	}

	public Enviado[] cargarEnviados(UR aUsuario) throws PersistentException {

		int contador = 0;
		Pendiente listaPendientes[] = PendienteDAO.listPendienteByQuery(
				"URUsuario_GeneralId_Usuario = " + aUsuario.getId_Usuario() + " AND Asignado = 1", null);
		
		Enviado resultado[] = new Enviado[listaPendientes.length];
		
		for(int i=0; i<listaPendientes.length; i++) {
			Enviado[] e = EnviadoDAO.listEnviadoByQuery("CodigoPendiente = " + listaPendientes[i].getCodigo() + " "
					+ "AND ENVIADO = 0" , null);

			
			if(e != null && e.length > 0){
				resultado[contador] = e[0];
				contador++;	
			}

		}
		
		return resultado;
	}
}

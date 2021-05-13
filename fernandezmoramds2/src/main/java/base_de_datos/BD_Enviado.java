package base_de_datos;

import basededatos.BDPrincipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Enviado {
	public BDPrincipal _bDPrincipal;
	public Vector<Enviado> _enviado = new Vector<Enviado>();

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public void asignarPedidoTransportista(Pendiente aPedidoPendiente, Transportista aTransportista, Encargado_de_compras aEncargado) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		Enviado e = EnviadoDAO.createEnviado();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		formatter.format(date);
		
		e.set_Transportista(aTransportista);
		e.set_Procesa(aEncargado);
		e.setFecha_estado(date.toString());
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
		
		try {
			enviados = EnviadoDAO.listEnviadoByQuery(null, null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return enviados;
		
	}
}
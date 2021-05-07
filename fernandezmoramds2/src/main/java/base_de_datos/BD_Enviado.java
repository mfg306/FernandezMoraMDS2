package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Enviado;

public class BD_Enviado {
	public BDPrincipal _bDPrincipal;
	public Vector<Enviado> _enviado = new Vector<Enviado>();

	public Enviado[] cargarPedidosT(int aIdTransportista) {
		throw new UnsupportedOperationException();
	}

	public void asignarPedidoTransportista(int aIdPedidoPendiente, int aIdTransportista) {
		throw new UnsupportedOperationException();
	}
	
	public Enviado[] cargarEnviados() throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Enviado[] enviados = null;
		
		try {
			enviados = EnviadoDAO.listEnviadoByQuery(null, null);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		return enviados;
		
	}
}
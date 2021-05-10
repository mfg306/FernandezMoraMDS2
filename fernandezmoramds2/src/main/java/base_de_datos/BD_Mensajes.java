package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Mensaje;

public class BD_Mensajes {
	public BDPrincipal _bDPrincipal;
	public Vector<Mensaje> _mensaje = new Vector<Mensaje>();

	public Mensaje[] cargarMensajesEnviados(Usuario_General aUsuario) throws PersistentException {
		Mensaje[] mensajes = MensajeDAO.listMensajeByQuery("correo_receptor = '" + aUsuario.getCorreo_electronico()+ "'", null);
		
		return mensajes;
	}

	public Mensaje[] cargarMensajesRecibidos(Usuario_General aUsuario) throws PersistentException {
		Mensaje[] mensajes = MensajeDAO.listMensajeByQuery("correo_receptor = '" + aUsuario.getCorreo_electronico()+ "'", null);
		
		return mensajes;
		
	}

	public void enviarMensaje(String aCorreoReceptor, String aMensaje, String aAsunto, Usuario_General aEmisor) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Mensaje m = MensajeDAO.createMensaje();
			if(aEmisor instanceof base_de_datos.Administrador) {
				m.set_Enviado_por_Admin((base_de_datos.Administrador)aEmisor);
			}
			
			if(aEmisor instanceof base_de_datos.UR) {
				m.set_Enviado_por_UR((base_de_datos.UR)aEmisor);
			}
			
			/*Si el usuario receptor no existe, entonces no mandar el mensaje ==> modificar el diagrama de secuencias*/
			m.setCorreo_receptor(aCorreoReceptor);
			m.setMensaje(aMensaje);
			m.setCorreo_emisor(aEmisor.getCorreo_electronico());
			
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
	}
}
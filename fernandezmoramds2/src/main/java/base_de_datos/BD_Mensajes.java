package base_de_datos;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUR;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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
			this._bDPrincipal = new BDPrincipal();
			if(aEmisor instanceof base_de_datos.Administrador) {
				iUR user = this._bDPrincipal;
				UR usuarioReceptor = user.buscarUsuarioPorCorreo(aCorreoReceptor);
				m.set_Enviado_por_Admin((base_de_datos.Administrador)aEmisor);
				m.set_Enviado_por_UR(usuarioReceptor);
			}
			
			if(aEmisor instanceof base_de_datos.UR) {
				iAdministrador iadmin = this._bDPrincipal;
				Administrador admin = iadmin.buscarAdmin(aCorreoReceptor);
				m.set_Enviado_por_UR((base_de_datos.UR)aEmisor);
				m.set_Enviado_por_Admin(admin);
			}
			
			m.setCorreo_receptor(aCorreoReceptor);
			m.setMensaje(aMensaje);
			m.setCorreo_emisor(aEmisor.getCorreo_electronico());
			m.setAsunto(aAsunto);
						
			MensajeDAO.save(m);
					
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();

	}
	
	public boolean responderMensaje(String aCorreoReceptor, String aMensaje, Usuario_General aEmisor, Mensaje mensajeHilo) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Mensaje m = MensajeDAO.createMensaje();
			this._bDPrincipal = new BDPrincipal();

			if(aEmisor instanceof base_de_datos.Administrador) {
				iUR user = this._bDPrincipal;
				UR usuarioReceptor = user.buscarUsuarioPorCorreo(aCorreoReceptor);
				m.set_Enviado_por_Admin((base_de_datos.Administrador)aEmisor);
				m.set_Enviado_por_UR(usuarioReceptor);
			}
			
			if(aEmisor instanceof base_de_datos.UR) {
				iAdministrador iadmin = this._bDPrincipal;
				Administrador admin = iadmin.buscarAdmin(aCorreoReceptor);
				m.set_Enviado_por_UR((base_de_datos.UR)aEmisor);
				m.set_Enviado_por_Admin(admin);
			}
			
			m.setCorreo_receptor(aCorreoReceptor);
			m.setMensaje(aMensaje);
			m.setCorreo_emisor(aEmisor.getCorreo_electronico());
			m.set_Responder_a(mensajeHilo);
			m.setAsunto("Re : " + mensajeHilo.getAsunto());
						
			MensajeDAO.save(m);
					
			t.commit();
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		HitoPersistentManager.instance().disposePersistentManager();

		return false;
	}
}
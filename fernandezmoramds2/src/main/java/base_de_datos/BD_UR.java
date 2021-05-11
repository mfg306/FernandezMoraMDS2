package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.UR;

public class BD_UR {
	public BDPrincipal _bDPrincipal;
	public Vector<UR> _uNR = new Vector<UR>();

	public boolean registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario,
			String aContrasenia, String aContraseniaRepeticion) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {

			UR usuario = URDAO.createUR();

			usuario.setNombre(aNombre);
			usuario.setCorreo_electronico(aCorreo);
			usuario.setPrimer_apellido(aApellidos);
			usuario.setContrasenia(aContrasenia);
			usuario.setNombre_usuario(aNombreUsuario);

			boolean hayDigitos = false, mayorDe8Caracteres = false, hayMayuscula = false, hayCaracteres = false;

			if (usuario.getContrasenia().length() > 8)
				mayorDe8Caracteres = true;
			if (mayorDe8Caracteres)
				return false;

			for (Character c : usuario.getContrasenia().toCharArray()) {
				if (Character.isDigit(c))
					hayDigitos = true;
				if (Character.isLetter(c)) {
					hayCaracteres = true;
					if (Character.isUpperCase(c))
						hayMayuscula = true;
				}
			}

			if (!hayDigitos || !hayMayuscula || !hayCaracteres) {
				return false;
			}

			UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

			if (usuariosCorreo.length == 0) {
				URDAO.save(usuario);
			}

			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}

		return true;
	}

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		UR usuario = URDAO.createUR();

		usuario.setCorreo_electronico(aCorreo);
		usuario.setContrasenia(aContrasenia);

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");

		if (usuariosCorreo.length == 0)
			return null;
		if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())
				&& usuariosCorreo[0].getContrasenia().equals(usuario.getContrasenia()))
			return usuariosCorreo[0];

		return null;
	}

	public UR buscarUsuarioPorCorreo(String aCorreo) throws PersistentException {

		UR usuario = URDAO.createUR();
		usuario.setCorreo_electronico(aCorreo);
		base_de_datos.UR usuarioEncontrado = null;

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");
		try {
			if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
				usuarioEncontrado = usuariosCorreo[0];
			}
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
		return usuarioEncontrado;
	}
	
		public void cambiarContraseniaUsuario(String aCorreo, String aContrasenia) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		UR usuario = URDAO.createUR();
		usuario.setCorreo_electronico(aCorreo);
		base_de_datos.UR usuarioEncontrado = null;

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");
		try {
			if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
				usuarioEncontrado = usuariosCorreo[0];
				usuarioEncontrado.setContrasenia(aContrasenia);
				URDAO.save(usuarioEncontrado);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
			e.getStackTrace();
			
		}
		
	}

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago) {
		throw new UnsupportedOperationException();
	}

	public UR[] cargarFichaCliente() {
		throw new UnsupportedOperationException();
	}
	
	public UR[] cargarClientes() throws PersistentException{
		UR[] usuarios = URDAO.listURByQuery(null, null);
		return usuarios;

	}
	
	public void actualizarContrasenia(String aContraseniaActual,String aNuevaContrasenia, String aConfirmacionNuevaContrasenia) {
		
	}
	
	public void cambiarDatosUsuario(String aNombreUsuario, String aNombre, String aApellidos, String aCorreo, String aDireccion, String aMetodoDePago) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		UR usuario = URDAO.createUR();
		usuario.setCorreo_electronico(aCorreo);
		base_de_datos.UR usuarioEncontrado = null;

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");
		try {
			if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
				usuarioEncontrado = usuariosCorreo[0];
				usuarioEncontrado.setNombre_usuario(aNombreUsuario);
				usuarioEncontrado.setNombre(aNombre);
				usuarioEncontrado.setPrimer_apellido(aApellidos);
				usuarioEncontrado.setDireccion_envio(aDireccion);
				usuarioEncontrado.setMetodo_pago(aMetodoDePago);
				URDAO.save(usuarioEncontrado);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
			e.getStackTrace();
			
		}
	}
	
	public void eliminarUsuario(String aCorreo) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		UR usuario = URDAO.createUR();
		usuario.setCorreo_electronico(aCorreo);
		base_de_datos.UR usuarioEncontrado = null;

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");
		try {
			if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
				usuarioEncontrado = usuariosCorreo[0];
				usuarioEncontrado.setEsta_operativo(false);
				URDAO.save(usuarioEncontrado);
				t.commit();
			}
		} catch (Exception e) {
			t.rollback();
			e.getStackTrace();
			
		}
	}

}

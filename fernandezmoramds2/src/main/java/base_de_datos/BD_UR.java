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

	public int registrarse(String aNombre, String aPrimerApellido, String aSegundoApellido, String aCorreo, String aNombreUsuario,
			String aContrasenia, String aContraseniaRepeticion) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {

			UR usuario = URDAO.createUR();

			usuario.setNombre(aNombre);
			usuario.setCorreo_electronico(aCorreo);
			usuario.setPrimer_apellido(aPrimerApellido);
			usuario.setSegundo_apellido(aSegundoApellido);
			usuario.setContrasenia(aContrasenia);
			usuario.setNombre_usuario(aNombreUsuario);
			usuario.setEsta_operativo(true);

			boolean hayDigitos = false, mayorDe8Caracteres = false, hayMayuscula = false, hayCaracteres = false;

			if (usuario.getContrasenia().length() > 8)
				mayorDe8Caracteres = true;
			if (mayorDe8Caracteres)
				return 1;

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
				return 1;
			}

			UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

			if (usuariosCorreo.length == 0) {
				URDAO.save(usuario);
			} else {
				return 2;
			}

			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return 3;
		}

		return 0;
	}

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		UR usuario = URDAO.createUR();

		usuario.setCorreo_electronico(aCorreo);
		usuario.setContrasenia(aContrasenia);

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");

		if (usuariosCorreo.length == 0) {
			return null;
		}
		
		if (!usuariosCorreo[0].getEsta_operativo()) {
			return null;
		}
		
		if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())
				&& usuariosCorreo[0].getContrasenia().equals(usuario.getContrasenia())) {
			return usuariosCorreo[0];
		}

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
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
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

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago, UR aUsuario)
			throws PersistentException {
		
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			aUsuario.setDireccion_envio(aDireccionEnvio);
			aUsuario.setMetodo_pago(aMetodoPago);
			URDAO.save(aUsuario);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		} finally {
		}

	}

	public UR[] cargarClientes() throws PersistentException {
		UR[] usuarios = URDAO.listURByQuery(null, null);
		return usuarios;
	}

	public void actualizarContrasenia(UR ur, String aNuevaContrasenia) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			ur.setContrasenia(aNuevaContrasenia);
			URDAO.save(ur);
			t.commit();
		} catch (PersistentException e) {

			e.printStackTrace();
		}

	}

	public void cambiarDatosUsuario(String aNombreUsuario, String aNombre, String aPrimerApellido, String aSegundoApellido, String aCorreo,
			String aDireccion, String aMetodoDePago, String aRutaFoto) throws PersistentException {

		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Imagen i = null;
		
		if(aRutaFoto != null) {
			try {
				i = ImagenDAO.createImagen();
				i.setRuta(aRutaFoto);

				ImagenDAO.save(i);
				t.commit();
			} catch (Exception e) {
				e.printStackTrace();
				t.rollback();
			}
		}

		PersistentTransaction t2 = MDS2PersistentManager.instance().getSession().beginTransaction();
		UR usuario = URDAO.createUR();
		usuario.setCorreo_electronico(aCorreo);
		base_de_datos.UR usuarioEncontrado = null;

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");
		try {
			if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) {
				usuarioEncontrado = usuariosCorreo[0];
				usuarioEncontrado.setNombre_usuario(aNombreUsuario);
				usuarioEncontrado.setNombre(aNombre);
				usuarioEncontrado.setPrimer_apellido(aPrimerApellido);
				usuarioEncontrado.setSegundo_apellido(aSegundoApellido);
				usuarioEncontrado.setDireccion_envio(aDireccion);
				usuarioEncontrado.setMetodo_pago(aMetodoDePago);

				if (i != null)
					usuarioEncontrado.setImagen(i);

				URDAO.save(usuarioEncontrado);
				t2.commit();
			}
		} catch (Exception e) {
			t2.rollback();
			e.getStackTrace();

		}
	}

	public void eliminarUsuario(String aCorreo) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
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

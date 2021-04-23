package base_de_datos;

import basededatos.BDPrincipal;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import java.util.Vector;
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
			
			UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

			if (usuariosCorreo.length == 0 && usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) return true;
			if (usuariosCorreo.length == 0 && usuariosCorreo[0].getNombre_usuario().equals(usuario.getNombre_usuario())) return true;


			URDAO.save(usuario);

			t.commit();

		} catch (Exception e) {
			t.rollback();
			return false;
		}

		return true;
	}

	public boolean iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {

		UR usuario = URDAO.createUR();

		usuario.setCorreo_electronico(aCorreo);
		usuario.setContrasenia(aContrasenia);

		UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

		if(usuariosCorreo.length == 0) return false;
		if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico())) return true;

		return false;

	}

	public boolean buscarUsuarioPorCorreo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago) {
		throw new UnsupportedOperationException();
	}

	public UR[] cargarFichaCliente() {
		throw new UnsupportedOperationException();
	}
}
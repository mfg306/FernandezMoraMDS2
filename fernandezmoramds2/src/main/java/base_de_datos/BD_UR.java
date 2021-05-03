package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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
			
			boolean hayDigitos = false, mayorDe8Caracteres = true, hayMayuscula = false, hayCaracteres = false;
			
			if(usuario.getContrasenia().length() > 8) mayorDe8Caracteres = false;
			if(!mayorDe8Caracteres) return false;
			
			for(Character c : usuario.getContrasenia().toCharArray()) {
				if(Character.isDigit(c)) hayDigitos = true;
				if(Character.isLetter(c)) {
					hayCaracteres = true;
					if(Character.isUpperCase(c)) hayMayuscula = true;
				}
			}
			
			if(!hayDigitos || !hayMayuscula || !hayCaracteres) return false;
			


			 UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

			  if (usuariosCorreo.length == 0) return true; 
			 

			URDAO.save(usuario);

			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}

		return true;
	}

	public int iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		UR usuario = URDAO.createUR();

		usuario.setCorreo_electronico(aCorreo);
		usuario.setContrasenia(aContrasenia);

		UR[] usuariosCorreo = URDAO.listURByQuery("Correo_electronico = '" + aCorreo + "'", "Correo_electronico");

		if (usuariosCorreo.length == 0)
			return 0;
		if (usuariosCorreo[0].getCorreo_electronico().equals(usuario.getCorreo_electronico()))
			return 1;

		return 0;
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
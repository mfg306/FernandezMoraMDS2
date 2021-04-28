package base_de_datos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.BDPrincipal;

public class BD_Administrador {
	public BDPrincipal _bDPrincipal;
	public Administrador _administrador;

	public int iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {

			Administrador admin = AdministradorDAO.createAdministrador();

			admin.setCorreo_electronico(aCorreo);
			admin.setContrasenia(aContrasenia);

			// UR[] usuariosCorreo = URDAO.listURByQuery("correo_electronico = '" + aCorreo
			// + "'", "correo_electronico");

			/*
			 * if (usuariosCorreo.length == 0 &&
			 * usuariosCorreo[0].getCorreo_electronico().equals(usuario.
			 * getCorreo_electronico())) return true; if (usuariosCorreo.length == 0 &&
			 * usuariosCorreo[0].getNombre_usuario().equals(usuario.getNombre_usuario()))
			 * return true;
			 */

			AdministradorDAO.save(admin);

			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return 0;
		}

		return 2;
	}
}
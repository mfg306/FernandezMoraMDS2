package base_de_datos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.BDPrincipal;

public class BD_Administrador {
	public BDPrincipal _bDPrincipal;
	public Administrador _administrador;

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {

		Administrador admin = AdministradorDAO.createAdministrador();

		admin.setCorreo_electronico(aCorreo);
		admin.setContrasenia(aContrasenia);
		
		Administrador[] administradores = AdministradorDAO
				.listAdministradorByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

		if (administradores.length == 0) return null;
		if (administradores[0].getCorreo_electronico().equals(admin.getCorreo_electronico())) return administradores[0];

		return null;

	}
	
	public Administrador buscarAdmin(String aCorreo) throws PersistentException {
		Administrador[] admin = AdministradorDAO.listAdministradorByQuery("correo_electronico = '" + aCorreo + "'", null);
		return admin[0];
	}
}
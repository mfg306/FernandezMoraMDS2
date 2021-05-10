package base_de_datos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.BDPrincipal;

public class BD_Administrador {
	public BDPrincipal _bDPrincipal;
	public Administrador _administrador;

	public int iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException {

		Administrador admin = AdministradorDAO.createAdministrador();

		admin.setCorreo_electronico(aCorreo);
		admin.setContrasenia(aContrasenia);
		
		Administrador[] administradores = AdministradorDAO
				.listAdministradorByQuery("correo_electronico = '" + aCorreo + "'", "correo_electronico");

		if (administradores.length == 0) return 0;
		if (administradores[0].getCorreo_electronico().equals(admin.getCorreo_electronico())) return 2;

		return 0;

	}
	
	public Administrador buscarAdministradorPorCorreo(String aCorreo) throws PersistentException {
		Administrador[] admin = AdministradorDAO.listAdministradorByQuery("correo_electronico = '" + aCorreo +"'", "correo_electronico");
		return admin[0];
	}

}
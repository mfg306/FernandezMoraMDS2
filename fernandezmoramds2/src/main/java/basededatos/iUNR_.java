package basededatos;

import org.orm.PersistentException;

public interface iUNR_ extends iUR_UNR {

	public boolean registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario, String aContrasenia, Object aContraseniaRepeticion) throws PersistentException;

	public boolean iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException;
}
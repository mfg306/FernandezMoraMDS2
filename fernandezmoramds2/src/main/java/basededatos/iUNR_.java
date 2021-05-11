package basededatos;

import org.orm.PersistentException;

import base_de_datos.Usuario_General;

public interface iUNR_ extends iUR_UNR {

	public boolean registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario, String aContrasenia, Object aContraseniaRepeticion) throws PersistentException;

	public Usuario_General iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException;
}
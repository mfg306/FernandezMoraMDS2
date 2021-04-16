/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package Base_de_Datos;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;
import org.hibernate.boot.MetadataSources;

public class HitoPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "Hito";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private HitoPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	protected void configureMetadataSources(MetadataSources aMetadataSources) {
		super.configureMetadataSources(aMetadataSources);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Usuario_General.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.UR.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Administrador.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Categoria.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Producto.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Imagen.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Oferta.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Producto_Rebajado.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Empleado.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Transportista.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Encargado_de_compras.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Comentario.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Compra.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Producto_en_compra.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Valoracion.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Pendiente.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Enviado.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Recibido.class);
		aMetadataSources.addAnnotatedClass(Base_de_Datos.Mensaje.class);
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new HitoPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}

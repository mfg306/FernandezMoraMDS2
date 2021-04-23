package basededatos;

import base_de_datos.Oferta;
import base_de_datos.Producto;
import base_de_datos.Mensaje;

import org.orm.PersistentException;

import base_de_datos.Imagen;

public interface iAdministrador {

	public Oferta[] cargarOfertas();

	public Producto[] cargarProductos(String aProducto);

	public Mensaje[] cargarMensajesEnviados(String aCorreoEmisor);

	public Mensaje[] cargarMensajesRecibidos(String aCorreoReceptor);

	public void enviarMensaje(String aCorreoEmisor, String aCorreoReceptor, String aCodigo, String aMensaje);

	public boolean iniciarSesion(String aCorreo, String aContrasenia) throws PersistentException;

	public void guardarImagenesProducto(int aIdProducto, Imagen[] aImagenes);

	public void insertarProducto(String aNombreProducto, String aDescripcion);
}
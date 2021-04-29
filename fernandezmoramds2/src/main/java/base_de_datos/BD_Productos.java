package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;

import base_de_datos.Producto;

public class BD_Productos {
	public BDPrincipal _bDPrincipal;
	public Vector<Producto> _producto = new Vector<Producto>();

	public Producto[] cargarProductosMasVendidos(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto cargarProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductos() {
		throw new UnsupportedOperationException();
	}

	public void eliminarProductoAdministrador(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductos(String aProducto) throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void insertarProducto(String aNombreProducto, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosListado() throws PersistentException {
		return ProductoDAO.listProductoByQuery(null,null);
		
	}

	public void VerZonaProductosAnadidos() {
		throw new UnsupportedOperationException();
	}

	public void VerZonaProductos() {
		throw new UnsupportedOperationException();
	}

	public void actualizarProducto(String aNombreProducto, String aDescripcion) {
		throw new UnsupportedOperationException();
	}
	
	public Producto[] cargarProductosBusquedaZonaProductos(String aProducto) throws PersistentException{	
		return ProductoDAO.listProductoByQuery("Nombre LIKE '%" + aProducto + "%'", "nombre");
	}
}
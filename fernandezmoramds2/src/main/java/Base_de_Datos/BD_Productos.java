package Base_de_Datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import Base_de_Datos.Producto;

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

	public Producto[] cargarProductos(String aProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void insertarProducto(String aNombreProducto, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargarProductosListado() {
		throw new UnsupportedOperationException();
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
}
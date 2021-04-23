package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Categoria;

public class BD_Categorias {
	public BDPrincipal _bDPrincipal;
	public Vector<Categoria> _categoria = new Vector<Categoria>();

	public Categoria[] cargarCategorias() {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategoria(int aIdCategoria) {
		throw new UnsupportedOperationException();
	}

	public void insertarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaRegistro) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargarCategoriasAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void actualizarCategoria(String aNombreCategoria, Producto[] aListaProductos, String aFechaActualizacion) {
		throw new UnsupportedOperationException();
	}
}
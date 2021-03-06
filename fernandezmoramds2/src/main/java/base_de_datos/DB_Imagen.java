package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Imagen;

public class DB_Imagen {
	public BDPrincipal _bDPrincipal;
	public Vector<Imagen> _imagen = new Vector<Imagen>();

	public void guardarImagenesProducto(String aImagenes, Producto aProducto, boolean aEsPrincipal) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		Imagen imagen = ImagenDAO.createImagen();
		imagen.setRuta(aImagenes);
		imagen.set_Producto(aProducto);
		
		if(aEsPrincipal) imagen.setPrincipal(true);
		else imagen.setPrincipal(false);
		
		try {
			ImagenDAO.save(imagen);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}

	}
	
	public boolean eliminarImagenProducto(Producto aProducto) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Imagen[] imagenes = null;
		
		try {
			imagenes = ImagenDAO.listImagenByQuery("ProductoId_Producto = " + aProducto.getId_Producto(), null);
			for(Imagen i : imagenes) {
				ImagenDAO.deleteAndDissociate(i);
			}
			t.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}
		

	}
}
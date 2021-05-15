package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Imagen;

public class DB_Imagen {
	public BDPrincipal _bDPrincipal;
	public Vector<Imagen> _imagen = new Vector<Imagen>();

	public void guardarImagenesProducto(String aImagenes, Producto aProducto) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		Imagen imagen = ImagenDAO.createImagen();
		imagen.setRuta(aImagenes);
		imagen.set_Producto(aProducto);
		
		System.out.println("La ruta : " +  aImagenes);
		
		try {
			
			ImagenDAO.save(imagen);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}

	}
	
	public boolean eliminarImagenProducto(Producto aProducto) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Imagen[] imagenes = null;
		
		try {
			imagenes = ImagenDAO.listImagenByQuery("ProductoId_Producto = " + aProducto.getId_Producto(), null);
			for(Imagen i : imagenes) {
				System.out.println(i.getRuta());
				ImagenDAO.deleteAndDissociate(i);
			}
			t.commit();
			HitoPersistentManager.instance().disposePersistentManager();
			return true;
		} catch(Exception e) {
//			e.printStackTrace();
			t.rollback();
			HitoPersistentManager.instance().disposePersistentManager();
			return false;
		}
		

	}
}
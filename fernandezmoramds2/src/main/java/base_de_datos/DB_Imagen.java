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
		imagen.setRuta("samsung.png");
		imagen.set_Producto(aProducto);
		
		try {
			
			ImagenDAO.save(imagen);
			System.out.println("EJECUTANDO ESTO");
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}

	}
}
package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.Valoracion;

public class BD_Valoracion {
	public BDPrincipal _bDPrincipal;
	public Vector<Valoracion> _valoracion = new Vector<Valoracion>();

	public boolean valorar(int aIdProducto, int aIdUsuario, String aValoracion) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);

			UR usuario = URDAO.getURByORMID(aIdUsuario);
			Valoracion valoracion = ValoracionDAO.createValoracion();

			valoracion.set_Valorado(producto);
			valoracion.set_Valorado_por(usuario);
			valoracion.setORM__Valorado(producto);
			valoracion.setORM__Valorado_por(usuario);
			valoracion.setValoracion(Integer.parseInt(aValoracion));

			ValoracionDAO.save(valoracion);

			t.commit();

		} catch (Exception e) {
			Notification.show("Debes seleccionar una valoración");
			t.rollback();
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Valoracion[] cargarValoraciones(int aIdProducto) throws PersistentException {
		Valoracion[] v = null;

		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			v = ValoracionDAO.listValoracionByQuery("ProductoId_Producto LIKE '%" + aIdProducto + "%'", null);

		} catch (Exception e) {
			t.rollback();
		}
		return v;
	}

	public boolean eliminarValoracionesProducto(Producto aProducto) throws PersistentException {
		Valoracion valoraciones[] = ValoracionDAO
				.listValoracionByQuery("ProductoId_Producto = " + aProducto.getId_Producto(), null);
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();

		try {
			for (Valoracion v : valoraciones) {
				ValoracionDAO.deleteAndDissociate(v);
			}
			t.commit();

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}
		return true;
	}
}
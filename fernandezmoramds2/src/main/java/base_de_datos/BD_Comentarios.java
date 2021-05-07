package base_de_datos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.Comentario;

public class BD_Comentarios {
	public BDPrincipal _bDPrincipal;
	public Vector<Comentario> _comentario = new Vector<Comentario>();

	public boolean comentar(String aComentario, int aIdProducto, int aIdUsuario) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {

			Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);

			UR usuario = URDAO.getURByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.createComentario();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();

			formatter.format(date);
			comentario.set_Tiene(producto);
			comentario.set_Realiza(usuario);
			comentario.setComentario(aComentario);
			comentario.setFecha(date.toString());

			comentario.setORM__Realiza(usuario);
			comentario.setORM__Tiene(producto);

			ComentarioDAO.save(comentario);
			t.commit();

		} catch (Exception e) {
			t.rollback();
			return false;
		}

		return true;
	}

}
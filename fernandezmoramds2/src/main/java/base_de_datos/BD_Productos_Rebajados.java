package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import base_de_datos.Producto_Rebajado;

public class BD_Productos_Rebajados {
	public BDPrincipal _bDPrincipal;
	public Vector<Producto_Rebajado> _producto_Rebajado = new Vector<Producto_Rebajado>();
	
	public void eliminarProductosRebajados(int aIdProducto) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			
			System.out.println("ID : " + aIdProducto);
			Producto_Rebajado[] productosRebajados = Producto_RebajadoDAO.listProducto_RebajadoByQuery("ProductoId_Producto = " + aIdProducto,  null);	
			
			for(Producto_Rebajado pr : productosRebajados){
				System.out.println("Eliminando el producto rebajado : " + pr.getId_Producto());
				Producto_RebajadoDAO.delete(pr);
			}
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
	}
	
	public Producto_Rebajado[] cargarProductos(Oferta aOferta) throws PersistentException {
		Producto_Rebajado[] poferta = null;
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Oferta oferta = OfertaDAO.loadOfertaByQuery("Id_Oferta = " + aOferta.getId_Oferta(), null);
		poferta = oferta._Pertenece_a.toArray();
		
		return poferta;
	}
	
	public Producto_Rebajado cargarProductoRebajado(Producto aProducto) throws PersistentException {
		
		try {
			Producto_Rebajado pr = Producto_RebajadoDAO.listProducto_RebajadoByQuery("ProductoId_Producto = " + aProducto.getId_Producto(), null)[0];
			return pr;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
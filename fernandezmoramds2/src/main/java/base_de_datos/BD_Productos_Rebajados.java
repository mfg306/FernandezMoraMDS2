package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Producto_Rebajado;

public class BD_Productos_Rebajados {
	public BDPrincipal _bDPrincipal;
	public Vector<Producto_Rebajado> _producto_Rebajado = new Vector<Producto_Rebajado>();
	
	public void eliminarProductosRebajados(int aIdProducto) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			Producto_Rebajado[] productosRebajados = Producto_RebajadoDAO.listProducto_RebajadoByQuery("ProductoId_Producto = " + aIdProducto,  null);	
			
			for(Producto_Rebajado pr : productosRebajados){
				Producto_RebajadoDAO.deleteAndDissociate(pr);
			}
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
	}
	
	public Producto_Rebajado[] cargarProductos(Oferta aOferta) {
		return null;
	}
}
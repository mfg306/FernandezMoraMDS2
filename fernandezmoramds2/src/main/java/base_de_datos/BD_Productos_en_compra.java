package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Producto_en_compra;

public class BD_Productos_en_compra {
	public BDPrincipal _bDPrincipal;
	public Vector<Producto_en_compra> _producto_en_compra = new Vector<Producto_en_compra>();
	
	public boolean eliminarProductosEnCompra(Pendiente aPendiente) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
		Producto_en_compra[] listaPen = Producto_en_compraDAO.listProducto_en_compraByQuery("PendienteCompraCodigo = " + aPendiente.getCodigo(), null);
		if(listaPen.length == 0) return false;
		
		try{
			for(Producto_en_compra p : listaPen) {
				Producto_en_compraDAO.deleteAndDissociate(p);
			}
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();

			return false;
		}
		
		return true;
	}
	
	public boolean eliminarProductoEnCompra(Producto aProducto) throws PersistentException {
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		try {
			Producto_en_compra[] pen = Producto_en_compraDAO.listProducto_en_compraByQuery("ProductoId_Producto = " + aProducto.getId_Producto(), null);
			
			for(Producto_en_compra p : pen) {
				Producto_en_compraDAO.deleteAndDissociate(p);
			}
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}
		
		return true;
	}
	
	public Producto_en_compra[] cargarProductosEnCompra(int aIdEnviado) throws PersistentException {
		return  Producto_en_compraDAO.listProducto_en_compraByQuery("PendienteCompraCodigo = " + aIdEnviado, null);
	}
}
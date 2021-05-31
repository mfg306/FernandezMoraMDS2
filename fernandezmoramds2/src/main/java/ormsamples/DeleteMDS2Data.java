/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General lbase_de_datosUsuario_General = base_de_datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Usuario_GeneralDAO.delete(lbase_de_datosUsuario_General);
			base_de_datos.UR lbase_de_datosUR = base_de_datos.URDAO.loadURByQuery(null, null);
			// Delete the persistent object
			base_de_datos.URDAO.delete(lbase_de_datosUR);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			base_de_datos.AdministradorDAO.delete(lbase_de_datosAdministrador);
			base_de_datos.Categoria lbase_de_datosCategoria = base_de_datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.CategoriaDAO.delete(lbase_de_datosCategoria);
			base_de_datos.Producto lbase_de_datosProducto = base_de_datos.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ProductoDAO.delete(lbase_de_datosProducto);
			base_de_datos.Imagen lbase_de_datosImagen = base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ImagenDAO.delete(lbase_de_datosImagen);
			base_de_datos.Oferta lbase_de_datosOferta = base_de_datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.OfertaDAO.delete(lbase_de_datosOferta);
			base_de_datos.Producto_Rebajado lbase_de_datosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Producto_RebajadoDAO.delete(lbase_de_datosProducto_Rebajado);
			base_de_datos.Empleado lbase_de_datosEmpleado = base_de_datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.EmpleadoDAO.delete(lbase_de_datosEmpleado);
			base_de_datos.Transportista lbase_de_datosTransportista = base_de_datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.TransportistaDAO.delete(lbase_de_datosTransportista);
			base_de_datos.Encargado_de_compras lbase_de_datosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Encargado_de_comprasDAO.delete(lbase_de_datosEncargado_de_compras);
			base_de_datos.Comentario lbase_de_datosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ComentarioDAO.delete(lbase_de_datosComentario);
			base_de_datos.Compra lbase_de_datosCompra = base_de_datos.CompraDAO.loadCompraByQuery(null, null);
			// Delete the persistent object
			base_de_datos.CompraDAO.delete(lbase_de_datosCompra);
			base_de_datos.Producto_en_compra lbase_de_datosProducto_en_compra = base_de_datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Producto_en_compraDAO.delete(lbase_de_datosProducto_en_compra);
			base_de_datos.Valoracion lbase_de_datosValoracion = base_de_datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ValoracionDAO.delete(lbase_de_datosValoracion);
			base_de_datos.Pendiente lbase_de_datosPendiente = base_de_datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Delete the persistent object
			base_de_datos.PendienteDAO.delete(lbase_de_datosPendiente);
			base_de_datos.Enviado lbase_de_datosEnviado = base_de_datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.EnviadoDAO.delete(lbase_de_datosEnviado);
			base_de_datos.Recibido lbase_de_datosRecibido = base_de_datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.RecibidoDAO.delete(lbase_de_datosRecibido);
			base_de_datos.Mensaje lbase_de_datosMensaje = base_de_datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			base_de_datos.MensajeDAO.delete(lbase_de_datosMensaje);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS2Data deleteMDS2Data = new DeleteMDS2Data();
			try {
				deleteMDS2Data.deleteTestData();
			}
			finally {
				base_de_datos.MDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

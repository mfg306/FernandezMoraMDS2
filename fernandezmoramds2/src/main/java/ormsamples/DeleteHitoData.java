/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteHitoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General base_de_DatosUsuario_General = base_de_datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Usuario_GeneralDAO.delete(base_de_DatosUsuario_General);
			base_de_datos.UR base_de_DatosUR = base_de_datos.URDAO.loadURByQuery(null, null);
			// Delete the persistent object
			base_de_datos.URDAO.delete(base_de_DatosUR);
			base_de_datos.Administrador base_de_DatosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			base_de_datos.AdministradorDAO.delete(base_de_DatosAdministrador);
			base_de_datos.Categoria base_de_DatosCategoria = base_de_datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.CategoriaDAO.delete(base_de_DatosCategoria);
			base_de_datos.Producto base_de_DatosProducto = base_de_datos.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ProductoDAO.delete(base_de_DatosProducto);
			base_de_datos.Imagen base_de_DatosImagen = base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ImagenDAO.delete(base_de_DatosImagen);
			base_de_datos.Oferta base_de_DatosOferta = base_de_datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.OfertaDAO.delete(base_de_DatosOferta);
			base_de_datos.Producto_Rebajado base_de_DatosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Producto_RebajadoDAO.delete(base_de_DatosProducto_Rebajado);
			base_de_datos.Transportista base_de_DatosTransportista = base_de_datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.TransportistaDAO.delete(base_de_DatosTransportista);
			base_de_datos.Encargado_de_compras base_de_DatosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Encargado_de_comprasDAO.delete(base_de_DatosEncargado_de_compras);
			base_de_datos.Comentario base_de_DatosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ComentarioDAO.delete(base_de_DatosComentario);
			base_de_datos.Compra base_de_DatosCompra = base_de_datos.CompraDAO.loadCompraByQuery(null, null);
			// Delete the persistent object
			base_de_datos.CompraDAO.delete(base_de_DatosCompra);
			base_de_datos.Producto_en_compra base_de_DatosProducto_en_compra = base_de_datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Delete the persistent object
			base_de_datos.Producto_en_compraDAO.delete(base_de_DatosProducto_en_compra);
			base_de_datos.Valoracion base_de_DatosValoracion = base_de_datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ValoracionDAO.delete(base_de_DatosValoracion);
			base_de_datos.Pendiente base_de_DatosPendiente = base_de_datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Delete the persistent object
			base_de_datos.PendienteDAO.delete(base_de_DatosPendiente);
			base_de_datos.Enviado base_de_DatosEnviado = base_de_datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.EnviadoDAO.delete(base_de_DatosEnviado);
			base_de_datos.Recibido base_de_DatosRecibido = base_de_datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.RecibidoDAO.delete(base_de_DatosRecibido);
			base_de_datos.Mensaje base_de_DatosMensaje = base_de_datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			base_de_datos.MensajeDAO.delete(base_de_DatosMensaje);
			base_de_datos.Empleado base_de_DatosEmpleado = base_de_datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.EmpleadoDAO.delete(base_de_DatosEmpleado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteHitoData deleteHitoData = new DeleteHitoData();
			try {
				deleteHitoData.deleteTestData();
			}
			finally {
				base_de_datos.HitoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

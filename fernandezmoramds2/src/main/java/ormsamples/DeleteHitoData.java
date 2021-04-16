/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteHitoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = Base_de_Datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			Base_de_Datos.Usuario_General Base_de_DatosUsuario_General = Base_de_Datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.Usuario_GeneralDAO.delete(Base_de_DatosUsuario_General);
			Base_de_Datos.UR Base_de_DatosUR = Base_de_Datos.URDAO.loadURByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.URDAO.delete(Base_de_DatosUR);
			Base_de_Datos.Administrador Base_de_DatosAdministrador = Base_de_Datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.AdministradorDAO.delete(Base_de_DatosAdministrador);
			Base_de_Datos.Categoria Base_de_DatosCategoria = Base_de_Datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.CategoriaDAO.delete(Base_de_DatosCategoria);
			Base_de_Datos.Producto Base_de_DatosProducto = Base_de_Datos.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.ProductoDAO.delete(Base_de_DatosProducto);
			Base_de_Datos.Imagen Base_de_DatosImagen = Base_de_Datos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.ImagenDAO.delete(Base_de_DatosImagen);
			Base_de_Datos.Oferta Base_de_DatosOferta = Base_de_Datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.OfertaDAO.delete(Base_de_DatosOferta);
			Base_de_Datos.Producto_Rebajado Base_de_DatosProducto_Rebajado = Base_de_Datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.Producto_RebajadoDAO.delete(Base_de_DatosProducto_Rebajado);
			Base_de_Datos.Empleado Base_de_DatosEmpleado = Base_de_Datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.EmpleadoDAO.delete(Base_de_DatosEmpleado);
			Base_de_Datos.Transportista Base_de_DatosTransportista = Base_de_Datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.TransportistaDAO.delete(Base_de_DatosTransportista);
			Base_de_Datos.Encargado_de_compras Base_de_DatosEncargado_de_compras = Base_de_Datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.Encargado_de_comprasDAO.delete(Base_de_DatosEncargado_de_compras);
			Base_de_Datos.Comentario Base_de_DatosComentario = Base_de_Datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.ComentarioDAO.delete(Base_de_DatosComentario);
			Base_de_Datos.Compra Base_de_DatosCompra = Base_de_Datos.CompraDAO.loadCompraByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.CompraDAO.delete(Base_de_DatosCompra);
			Base_de_Datos.Producto_en_compra Base_de_DatosProducto_en_compra = Base_de_Datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.Producto_en_compraDAO.delete(Base_de_DatosProducto_en_compra);
			Base_de_Datos.Valoracion Base_de_DatosValoracion = Base_de_Datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.ValoracionDAO.delete(Base_de_DatosValoracion);
			Base_de_Datos.Pendiente Base_de_DatosPendiente = Base_de_Datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.PendienteDAO.delete(Base_de_DatosPendiente);
			Base_de_Datos.Enviado Base_de_DatosEnviado = Base_de_Datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.EnviadoDAO.delete(Base_de_DatosEnviado);
			Base_de_Datos.Recibido Base_de_DatosRecibido = Base_de_Datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.RecibidoDAO.delete(Base_de_DatosRecibido);
			Base_de_Datos.Mensaje Base_de_DatosMensaje = Base_de_Datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			Base_de_Datos.MensajeDAO.delete(Base_de_DatosMensaje);
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
				Base_de_Datos.HitoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

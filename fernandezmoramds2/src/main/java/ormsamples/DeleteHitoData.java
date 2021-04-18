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
			base_de_datos.Usuario_General base_de_DatosUsuario_General = base_de_datos.Usuario_General.loadUsuario_GeneralByQuery(null, null);
			base_de_DatosUsuario_General.delete();
			base_de_datos.UR base_de_DatosUR = base_de_datos.UR.loadURByQuery(null, null);
			base_de_DatosUR.delete();
			base_de_datos.Administrador base_de_DatosAdministrador = base_de_datos.Administrador.loadAdministradorByQuery(null, null);
			base_de_DatosAdministrador.delete();
			base_de_datos.Categoria base_de_DatosCategoria = base_de_datos.Categoria.loadCategoriaByQuery(null, null);
			base_de_DatosCategoria.delete();
			base_de_datos.Producto base_de_DatosProducto = base_de_datos.Producto.loadProductoByQuery(null, null);
			base_de_DatosProducto.delete();
			base_de_datos.Imagen base_de_DatosImagen = base_de_datos.Imagen.loadImagenByQuery(null, null);
			base_de_DatosImagen.delete();
			base_de_datos.Oferta base_de_DatosOferta = base_de_datos.Oferta.loadOfertaByQuery(null, null);
			base_de_DatosOferta.delete();
			base_de_datos.Producto_Rebajado base_de_DatosProducto_Rebajado = base_de_datos.Producto_Rebajado.loadProducto_RebajadoByQuery(null, null);
			base_de_DatosProducto_Rebajado.delete();
			base_de_datos.Empleado base_de_DatosEmpleado = base_de_datos.Empleado.loadEmpleadoByQuery(null, null);
			base_de_DatosEmpleado.delete();
			base_de_datos.Transportista base_de_DatosTransportista = base_de_datos.Transportista.loadTransportistaByQuery(null, null);
			base_de_DatosTransportista.delete();
			base_de_datos.Encargado_de_compras base_de_DatosEncargado_de_compras = base_de_datos.Encargado_de_compras.loadEncargado_de_comprasByQuery(null, null);
			base_de_DatosEncargado_de_compras.delete();
			base_de_datos.Comentario base_de_DatosComentario = base_de_datos.Comentario.loadComentarioByQuery(null, null);
			base_de_DatosComentario.delete();
			base_de_datos.Compra base_de_DatosCompra = base_de_datos.Compra.loadCompraByQuery(null, null);
			base_de_DatosCompra.delete();
			base_de_datos.Producto_en_compra base_de_DatosProducto_en_compra = base_de_datos.Producto_en_compra.loadProducto_en_compraByQuery(null, null);
			base_de_DatosProducto_en_compra.delete();
			base_de_datos.Valoracion base_de_DatosValoracion = base_de_datos.Valoracion.loadValoracionByQuery(null, null);
			base_de_DatosValoracion.delete();
			base_de_datos.Pendiente base_de_DatosPendiente = base_de_datos.Pendiente.loadPendienteByQuery(null, null);
			base_de_DatosPendiente.delete();
			base_de_datos.Enviado base_de_DatosEnviado = base_de_datos.Enviado.loadEnviadoByQuery(null, null);
			base_de_DatosEnviado.delete();
			base_de_datos.Recibido base_de_DatosRecibido = base_de_datos.Recibido.loadRecibidoByQuery(null, null);
			base_de_DatosRecibido.delete();
			base_de_datos.Mensaje base_de_DatosMensaje = base_de_datos.Mensaje.loadMensajeByQuery(null, null);
			base_de_DatosMensaje.delete();
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

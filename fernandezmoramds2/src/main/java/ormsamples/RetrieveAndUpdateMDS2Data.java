/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General lbase_de_datosUsuario_General = base_de_datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Usuario_GeneralDAO.save(lbase_de_datosUsuario_General);
			base_de_datos.UR lbase_de_datosUR = base_de_datos.URDAO.loadURByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.URDAO.save(lbase_de_datosUR);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.AdministradorDAO.save(lbase_de_datosAdministrador);
			base_de_datos.Categoria lbase_de_datosCategoria = base_de_datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.CategoriaDAO.save(lbase_de_datosCategoria);
			base_de_datos.Producto lbase_de_datosProducto = base_de_datos.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ProductoDAO.save(lbase_de_datosProducto);
			base_de_datos.Imagen lbase_de_datosImagen = base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ImagenDAO.save(lbase_de_datosImagen);
			base_de_datos.Oferta lbase_de_datosOferta = base_de_datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.OfertaDAO.save(lbase_de_datosOferta);
			base_de_datos.Producto_Rebajado lbase_de_datosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Producto_RebajadoDAO.save(lbase_de_datosProducto_Rebajado);
			base_de_datos.Empleado lbase_de_datosEmpleado = base_de_datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.EmpleadoDAO.save(lbase_de_datosEmpleado);
			base_de_datos.Transportista lbase_de_datosTransportista = base_de_datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.TransportistaDAO.save(lbase_de_datosTransportista);
			base_de_datos.Encargado_de_compras lbase_de_datosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Encargado_de_comprasDAO.save(lbase_de_datosEncargado_de_compras);
			base_de_datos.Comentario lbase_de_datosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ComentarioDAO.save(lbase_de_datosComentario);
			base_de_datos.Compra lbase_de_datosCompra = base_de_datos.CompraDAO.loadCompraByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.CompraDAO.save(lbase_de_datosCompra);
			base_de_datos.Producto_en_compra lbase_de_datosProducto_en_compra = base_de_datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Producto_en_compraDAO.save(lbase_de_datosProducto_en_compra);
			base_de_datos.Valoracion lbase_de_datosValoracion = base_de_datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ValoracionDAO.save(lbase_de_datosValoracion);
			base_de_datos.Pendiente lbase_de_datosPendiente = base_de_datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.PendienteDAO.save(lbase_de_datosPendiente);
			base_de_datos.Enviado lbase_de_datosEnviado = base_de_datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.EnviadoDAO.save(lbase_de_datosEnviado);
			base_de_datos.Recibido lbase_de_datosRecibido = base_de_datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.RecibidoDAO.save(lbase_de_datosRecibido);
			base_de_datos.Mensaje lbase_de_datosMensaje = base_de_datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.MensajeDAO.save(lbase_de_datosMensaje);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario_General by Usuario_GeneralCriteria");
		base_de_datos.Usuario_GeneralCriteria lbase_de_datosUsuario_GeneralCriteria = new base_de_datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosUsuario_GeneralCriteria.id_Usuario.eq();
		System.out.println(lbase_de_datosUsuario_GeneralCriteria.uniqueUsuario_General());
		
		System.out.println("Retrieving UR by URCriteria");
		base_de_datos.URCriteria lbase_de_datosURCriteria = new base_de_datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosURCriteria.id_Usuario.eq();
		System.out.println(lbase_de_datosURCriteria.uniqueUR());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		base_de_datos.AdministradorCriteria lbase_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosAdministradorCriteria.id_Usuario.eq();
		System.out.println(lbase_de_datosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		base_de_datos.CategoriaCriteria lbase_de_datosCategoriaCriteria = new base_de_datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosCategoriaCriteria.id_Categoria.eq();
		System.out.println(lbase_de_datosCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		base_de_datos.ProductoCriteria lbase_de_datosProductoCriteria = new base_de_datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosProductoCriteria.id_Producto.eq();
		System.out.println(lbase_de_datosProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		base_de_datos.ImagenCriteria lbase_de_datosImagenCriteria = new base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosImagenCriteria.ID.eq();
		System.out.println(lbase_de_datosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		base_de_datos.OfertaCriteria lbase_de_datosOfertaCriteria = new base_de_datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosOfertaCriteria.id_Oferta.eq();
		System.out.println(lbase_de_datosOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Producto_Rebajado by Producto_RebajadoCriteria");
		base_de_datos.Producto_RebajadoCriteria lbase_de_datosProducto_RebajadoCriteria = new base_de_datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosProducto_RebajadoCriteria.id_Producto.eq();
		System.out.println(lbase_de_datosProducto_RebajadoCriteria.uniqueProducto_Rebajado());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		base_de_datos.EmpleadoCriteria lbase_de_datosEmpleadoCriteria = new base_de_datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosEmpleadoCriteria.idEmpleado.eq();
		System.out.println(lbase_de_datosEmpleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		base_de_datos.TransportistaCriteria lbase_de_datosTransportistaCriteria = new base_de_datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosTransportistaCriteria.idEmpleado.eq();
		System.out.println(lbase_de_datosTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Encargado_de_compras by Encargado_de_comprasCriteria");
		base_de_datos.Encargado_de_comprasCriteria lbase_de_datosEncargado_de_comprasCriteria = new base_de_datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosEncargado_de_comprasCriteria.idEmpleado.eq();
		System.out.println(lbase_de_datosEncargado_de_comprasCriteria.uniqueEncargado_de_compras());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		base_de_datos.ComentarioCriteria lbase_de_datosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosComentarioCriteria.id_Comentario.eq();
		System.out.println(lbase_de_datosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Compra by CompraCriteria");
		base_de_datos.CompraCriteria lbase_de_datosCompraCriteria = new base_de_datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosCompraCriteria.codigo.eq();
		System.out.println(lbase_de_datosCompraCriteria.uniqueCompra());
		
		System.out.println("Retrieving Producto_en_compra by Producto_en_compraCriteria");
		base_de_datos.Producto_en_compraCriteria lbase_de_datosProducto_en_compraCriteria = new base_de_datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosProducto_en_compraCriteria.codigo.eq();
		System.out.println(lbase_de_datosProducto_en_compraCriteria.uniqueProducto_en_compra());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		base_de_datos.ValoracionCriteria lbase_de_datosValoracionCriteria = new base_de_datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosValoracionCriteria.id_valoracion.eq();
		System.out.println(lbase_de_datosValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		base_de_datos.PendienteCriteria lbase_de_datosPendienteCriteria = new base_de_datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosPendienteCriteria.codigo.eq();
		System.out.println(lbase_de_datosPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		base_de_datos.EnviadoCriteria lbase_de_datosEnviadoCriteria = new base_de_datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosEnviadoCriteria.codigo.eq();
		System.out.println(lbase_de_datosEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Recibido by RecibidoCriteria");
		base_de_datos.RecibidoCriteria lbase_de_datosRecibidoCriteria = new base_de_datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosRecibidoCriteria.codigo.eq();
		System.out.println(lbase_de_datosRecibidoCriteria.uniqueRecibido());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		base_de_datos.MensajeCriteria lbase_de_datosMensajeCriteria = new base_de_datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosMensajeCriteria.id_Mensaje.eq();
		System.out.println(lbase_de_datosMensajeCriteria.uniqueMensaje());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS2Data retrieveAndUpdateMDS2Data = new RetrieveAndUpdateMDS2Data();
			try {
				retrieveAndUpdateMDS2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS2Data.retrieveByCriteria();
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

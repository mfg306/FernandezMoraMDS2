/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateHitoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General base_de_DatosUsuario_General = base_de_datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Usuario_GeneralDAO.save(base_de_DatosUsuario_General);
			base_de_datos.UR base_de_DatosUR = base_de_datos.URDAO.loadURByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.URDAO.save(base_de_DatosUR);
			base_de_datos.Administrador base_de_DatosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.AdministradorDAO.save(base_de_DatosAdministrador);
			base_de_datos.Categoria base_de_DatosCategoria = base_de_datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.CategoriaDAO.save(base_de_DatosCategoria);
			base_de_datos.Producto base_de_DatosProducto = base_de_datos.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ProductoDAO.save(base_de_DatosProducto);
			base_de_datos.Imagen base_de_DatosImagen = base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ImagenDAO.save(base_de_DatosImagen);
			base_de_datos.Oferta base_de_DatosOferta = base_de_datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.OfertaDAO.save(base_de_DatosOferta);
			base_de_datos.Producto_Rebajado base_de_DatosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Producto_RebajadoDAO.save(base_de_DatosProducto_Rebajado);
			base_de_datos.Empleado base_de_DatosEmpleado = base_de_datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.EmpleadoDAO.save(base_de_DatosEmpleado);
			base_de_datos.Transportista base_de_DatosTransportista = base_de_datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.TransportistaDAO.save(base_de_DatosTransportista);
			base_de_datos.Encargado_de_compras base_de_DatosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Encargado_de_comprasDAO.save(base_de_DatosEncargado_de_compras);
			base_de_datos.Comentario base_de_DatosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ComentarioDAO.save(base_de_DatosComentario);
			base_de_datos.Compra base_de_DatosCompra = base_de_datos.CompraDAO.loadCompraByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.CompraDAO.save(base_de_DatosCompra);
			base_de_datos.Producto_en_compra base_de_DatosProducto_en_compra = base_de_datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.Producto_en_compraDAO.save(base_de_DatosProducto_en_compra);
			base_de_datos.Valoracion base_de_DatosValoracion = base_de_datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ValoracionDAO.save(base_de_DatosValoracion);
			base_de_datos.Pendiente base_de_DatosPendiente = base_de_datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.PendienteDAO.save(base_de_DatosPendiente);
			base_de_datos.Enviado base_de_DatosEnviado = base_de_datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.EnviadoDAO.save(base_de_DatosEnviado);
			base_de_datos.Recibido base_de_DatosRecibido = base_de_datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.RecibidoDAO.save(base_de_DatosRecibido);
			base_de_datos.Mensaje base_de_DatosMensaje = base_de_datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.MensajeDAO.save(base_de_DatosMensaje);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario_General by Usuario_GeneralCriteria");
		base_de_datos.Usuario_GeneralCriteria base_de_DatosUsuario_GeneralCriteria = new base_de_datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosUsuario_GeneralCriteria.id_Usuario.eq();
		System.out.println(base_de_DatosUsuario_GeneralCriteria.uniqueUsuario_General());
		
		System.out.println("Retrieving UR by URCriteria");
		base_de_datos.URCriteria base_de_DatosURCriteria = new base_de_datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosURCriteria.id_Usuario.eq();
		System.out.println(base_de_DatosURCriteria.uniqueUR());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		base_de_datos.AdministradorCriteria base_de_DatosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosAdministradorCriteria.id_Usuario.eq();
		System.out.println(base_de_DatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		base_de_datos.CategoriaCriteria base_de_DatosCategoriaCriteria = new base_de_datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosCategoriaCriteria.id_Categoria.eq();
		System.out.println(base_de_DatosCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		base_de_datos.ProductoCriteria base_de_DatosProductoCriteria = new base_de_datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosProductoCriteria.id_Producto.eq();
		System.out.println(base_de_DatosProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		base_de_datos.ImagenCriteria base_de_DatosImagenCriteria = new base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosImagenCriteria.ID.eq();
		System.out.println(base_de_DatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		base_de_datos.OfertaCriteria base_de_DatosOfertaCriteria = new base_de_datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosOfertaCriteria.id_Oferta.eq();
		System.out.println(base_de_DatosOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Producto_Rebajado by Producto_RebajadoCriteria");
		base_de_datos.Producto_RebajadoCriteria base_de_DatosProducto_RebajadoCriteria = new base_de_datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosProducto_RebajadoCriteria.id_Producto.eq();
		System.out.println(base_de_DatosProducto_RebajadoCriteria.uniqueProducto_Rebajado());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		base_de_datos.EmpleadoCriteria base_de_DatosEmpleadoCriteria = new base_de_datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosEmpleadoCriteria.idEmpleado.eq();
		System.out.println(base_de_DatosEmpleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		base_de_datos.TransportistaCriteria base_de_DatosTransportistaCriteria = new base_de_datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosTransportistaCriteria.idEmpleado.eq();
		System.out.println(base_de_DatosTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Encargado_de_compras by Encargado_de_comprasCriteria");
		base_de_datos.Encargado_de_comprasCriteria base_de_DatosEncargado_de_comprasCriteria = new base_de_datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosEncargado_de_comprasCriteria.idEmpleado.eq();
		System.out.println(base_de_DatosEncargado_de_comprasCriteria.uniqueEncargado_de_compras());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		base_de_datos.ComentarioCriteria base_de_DatosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosComentarioCriteria.id_Comentario.eq();
		System.out.println(base_de_DatosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Compra by CompraCriteria");
		base_de_datos.CompraCriteria base_de_DatosCompraCriteria = new base_de_datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosCompraCriteria.codigo.eq();
		System.out.println(base_de_DatosCompraCriteria.uniqueCompra());
		
		System.out.println("Retrieving Producto_en_compra by Producto_en_compraCriteria");
		base_de_datos.Producto_en_compraCriteria base_de_DatosProducto_en_compraCriteria = new base_de_datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosProducto_en_compraCriteria.codigo.eq();
		System.out.println(base_de_DatosProducto_en_compraCriteria.uniqueProducto_en_compra());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		base_de_datos.ValoracionCriteria base_de_DatosValoracionCriteria = new base_de_datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosValoracionCriteria.id_valoracion.eq();
		System.out.println(base_de_DatosValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		base_de_datos.PendienteCriteria base_de_DatosPendienteCriteria = new base_de_datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosPendienteCriteria.codigo.eq();
		System.out.println(base_de_DatosPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		base_de_datos.EnviadoCriteria base_de_DatosEnviadoCriteria = new base_de_datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosEnviadoCriteria.codigo.eq();
		System.out.println(base_de_DatosEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Recibido by RecibidoCriteria");
		base_de_datos.RecibidoCriteria base_de_DatosRecibidoCriteria = new base_de_datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosRecibidoCriteria.codigo.eq();
		System.out.println(base_de_DatosRecibidoCriteria.uniqueRecibido());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		base_de_datos.MensajeCriteria base_de_DatosMensajeCriteria = new base_de_datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_DatosMensajeCriteria.id_Mensaje.eq();
		System.out.println(base_de_DatosMensajeCriteria.uniqueMensaje());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateHitoData retrieveAndUpdateHitoData = new RetrieveAndUpdateHitoData();
			try {
				retrieveAndUpdateHitoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateHitoData.retrieveByCriteria();
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

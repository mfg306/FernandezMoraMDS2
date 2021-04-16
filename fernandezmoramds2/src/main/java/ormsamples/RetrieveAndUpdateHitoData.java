/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateHitoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = Base_de_Datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			Base_de_Datos.Usuario_General Base_de_DatosUsuario_General = Base_de_Datos.Usuario_GeneralDAO.loadUsuario_GeneralByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.Usuario_GeneralDAO.save(Base_de_DatosUsuario_General);
			Base_de_Datos.UR Base_de_DatosUR = Base_de_Datos.URDAO.loadURByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.URDAO.save(Base_de_DatosUR);
			Base_de_Datos.Administrador Base_de_DatosAdministrador = Base_de_Datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.AdministradorDAO.save(Base_de_DatosAdministrador);
			Base_de_Datos.Categoria Base_de_DatosCategoria = Base_de_Datos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.CategoriaDAO.save(Base_de_DatosCategoria);
			Base_de_Datos.Producto Base_de_DatosProducto = Base_de_Datos.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.ProductoDAO.save(Base_de_DatosProducto);
			Base_de_Datos.Imagen Base_de_DatosImagen = Base_de_Datos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.ImagenDAO.save(Base_de_DatosImagen);
			Base_de_Datos.Oferta Base_de_DatosOferta = Base_de_Datos.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.OfertaDAO.save(Base_de_DatosOferta);
			Base_de_Datos.Producto_Rebajado Base_de_DatosProducto_Rebajado = Base_de_Datos.Producto_RebajadoDAO.loadProducto_RebajadoByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.Producto_RebajadoDAO.save(Base_de_DatosProducto_Rebajado);
			Base_de_Datos.Empleado Base_de_DatosEmpleado = Base_de_Datos.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.EmpleadoDAO.save(Base_de_DatosEmpleado);
			Base_de_Datos.Transportista Base_de_DatosTransportista = Base_de_Datos.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.TransportistaDAO.save(Base_de_DatosTransportista);
			Base_de_Datos.Encargado_de_compras Base_de_DatosEncargado_de_compras = Base_de_Datos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.Encargado_de_comprasDAO.save(Base_de_DatosEncargado_de_compras);
			Base_de_Datos.Comentario Base_de_DatosComentario = Base_de_Datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.ComentarioDAO.save(Base_de_DatosComentario);
			Base_de_Datos.Compra Base_de_DatosCompra = Base_de_Datos.CompraDAO.loadCompraByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.CompraDAO.save(Base_de_DatosCompra);
			Base_de_Datos.Producto_en_compra Base_de_DatosProducto_en_compra = Base_de_Datos.Producto_en_compraDAO.loadProducto_en_compraByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.Producto_en_compraDAO.save(Base_de_DatosProducto_en_compra);
			Base_de_Datos.Valoracion Base_de_DatosValoracion = Base_de_Datos.ValoracionDAO.loadValoracionByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.ValoracionDAO.save(Base_de_DatosValoracion);
			Base_de_Datos.Pendiente Base_de_DatosPendiente = Base_de_Datos.PendienteDAO.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.PendienteDAO.save(Base_de_DatosPendiente);
			Base_de_Datos.Enviado Base_de_DatosEnviado = Base_de_Datos.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.EnviadoDAO.save(Base_de_DatosEnviado);
			Base_de_Datos.Recibido Base_de_DatosRecibido = Base_de_Datos.RecibidoDAO.loadRecibidoByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.RecibidoDAO.save(Base_de_DatosRecibido);
			Base_de_Datos.Mensaje Base_de_DatosMensaje = Base_de_Datos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			Base_de_Datos.MensajeDAO.save(Base_de_DatosMensaje);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario_General by Usuario_GeneralCriteria");
		Base_de_Datos.Usuario_GeneralCriteria Base_de_DatosUsuario_GeneralCriteria = new Base_de_Datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosUsuario_GeneralCriteria.id_Usuario.eq();
		System.out.println(Base_de_DatosUsuario_GeneralCriteria.uniqueUsuario_General());
		
		System.out.println("Retrieving UR by URCriteria");
		Base_de_Datos.URCriteria Base_de_DatosURCriteria = new Base_de_Datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosURCriteria.id_Usuario.eq();
		System.out.println(Base_de_DatosURCriteria.uniqueUR());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		Base_de_Datos.AdministradorCriteria Base_de_DatosAdministradorCriteria = new Base_de_Datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosAdministradorCriteria.id_Usuario.eq();
		System.out.println(Base_de_DatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		Base_de_Datos.CategoriaCriteria Base_de_DatosCategoriaCriteria = new Base_de_Datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosCategoriaCriteria.id_Categoria.eq();
		System.out.println(Base_de_DatosCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		Base_de_Datos.ProductoCriteria Base_de_DatosProductoCriteria = new Base_de_Datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosProductoCriteria.id_Producto.eq();
		System.out.println(Base_de_DatosProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		Base_de_Datos.ImagenCriteria Base_de_DatosImagenCriteria = new Base_de_Datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosImagenCriteria.ID.eq();
		System.out.println(Base_de_DatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		Base_de_Datos.OfertaCriteria Base_de_DatosOfertaCriteria = new Base_de_Datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosOfertaCriteria.id_Oferta.eq();
		System.out.println(Base_de_DatosOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Producto_Rebajado by Producto_RebajadoCriteria");
		Base_de_Datos.Producto_RebajadoCriteria Base_de_DatosProducto_RebajadoCriteria = new Base_de_Datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosProducto_RebajadoCriteria.id_Producto.eq();
		System.out.println(Base_de_DatosProducto_RebajadoCriteria.uniqueProducto_Rebajado());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		Base_de_Datos.EmpleadoCriteria Base_de_DatosEmpleadoCriteria = new Base_de_Datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosEmpleadoCriteria.idEmpleado.eq();
		System.out.println(Base_de_DatosEmpleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		Base_de_Datos.TransportistaCriteria Base_de_DatosTransportistaCriteria = new Base_de_Datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosTransportistaCriteria.idEmpleado.eq();
		System.out.println(Base_de_DatosTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Encargado_de_compras by Encargado_de_comprasCriteria");
		Base_de_Datos.Encargado_de_comprasCriteria Base_de_DatosEncargado_de_comprasCriteria = new Base_de_Datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosEncargado_de_comprasCriteria.idEmpleado.eq();
		System.out.println(Base_de_DatosEncargado_de_comprasCriteria.uniqueEncargado_de_compras());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		Base_de_Datos.ComentarioCriteria Base_de_DatosComentarioCriteria = new Base_de_Datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosComentarioCriteria.id_Comentario.eq();
		System.out.println(Base_de_DatosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Compra by CompraCriteria");
		Base_de_Datos.CompraCriteria Base_de_DatosCompraCriteria = new Base_de_Datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosCompraCriteria.codigo.eq();
		System.out.println(Base_de_DatosCompraCriteria.uniqueCompra());
		
		System.out.println("Retrieving Producto_en_compra by Producto_en_compraCriteria");
		Base_de_Datos.Producto_en_compraCriteria Base_de_DatosProducto_en_compraCriteria = new Base_de_Datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosProducto_en_compraCriteria.id_Producto_en_compra.eq();
		System.out.println(Base_de_DatosProducto_en_compraCriteria.uniqueProducto_en_compra());
		
		System.out.println("Retrieving Valoracion by ValoracionCriteria");
		Base_de_Datos.ValoracionCriteria Base_de_DatosValoracionCriteria = new Base_de_Datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosValoracionCriteria.id_valoracion.eq();
		System.out.println(Base_de_DatosValoracionCriteria.uniqueValoracion());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		Base_de_Datos.PendienteCriteria Base_de_DatosPendienteCriteria = new Base_de_Datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosPendienteCriteria.codigo.eq();
		System.out.println(Base_de_DatosPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		Base_de_Datos.EnviadoCriteria Base_de_DatosEnviadoCriteria = new Base_de_Datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosEnviadoCriteria.codigo.eq();
		System.out.println(Base_de_DatosEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Recibido by RecibidoCriteria");
		Base_de_Datos.RecibidoCriteria Base_de_DatosRecibidoCriteria = new Base_de_Datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosRecibidoCriteria.codigo.eq();
		System.out.println(Base_de_DatosRecibidoCriteria.uniqueRecibido());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		Base_de_Datos.MensajeCriteria Base_de_DatosMensajeCriteria = new Base_de_Datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//Base_de_DatosMensajeCriteria.id_Mensaje.eq();
		System.out.println(Base_de_DatosMensajeCriteria.uniqueMensaje());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateHitoData retrieveAndUpdateHitoData = new RetrieveAndUpdateHitoData();
			try {
				retrieveAndUpdateHitoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateHitoData.retrieveByCriteria();
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

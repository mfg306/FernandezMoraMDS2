/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListHitoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_General...");
		base_de_datos.Usuario_General[] base_de_DatosUsuario_Generals = base_de_datos.Usuario_GeneralDAO.listUsuario_GeneralByQuery(null, null);
		int length = Math.min(base_de_DatosUsuario_Generals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosUsuario_Generals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UR...");
		base_de_datos.UR[] base_de_DatosURs = base_de_datos.URDAO.listURByQuery(null, null);
		length = Math.min(base_de_DatosURs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosURs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		base_de_datos.Administrador[] base_de_DatosAdministradors = base_de_datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(base_de_DatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		base_de_datos.Categoria[] base_de_DatosCategorias = base_de_datos.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(base_de_DatosCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		base_de_datos.Producto[] base_de_DatosProductos = base_de_datos.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(base_de_DatosProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		base_de_datos.Imagen[] base_de_DatosImagens = base_de_datos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(base_de_DatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		base_de_datos.Oferta[] base_de_DatosOfertas = base_de_datos.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(base_de_DatosOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_Rebajado...");
		base_de_datos.Producto_Rebajado[] base_de_DatosProducto_Rebajados = base_de_datos.Producto_RebajadoDAO.listProducto_RebajadoByQuery(null, null);
		length = Math.min(base_de_DatosProducto_Rebajados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosProducto_Rebajados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		base_de_datos.Transportista[] base_de_DatosTransportistas = base_de_datos.TransportistaDAO.listTransportistaByQuery(null, null);
		length = Math.min(base_de_DatosTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado_de_compras...");
		base_de_datos.Encargado_de_compras[] base_de_DatosEncargado_de_comprases = base_de_datos.Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null, null);
		length = Math.min(base_de_DatosEncargado_de_comprases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		base_de_datos.Comentario[] base_de_DatosComentarios = base_de_datos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(base_de_DatosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra...");
		base_de_datos.Compra[] base_de_DatosCompras = base_de_datos.CompraDAO.listCompraByQuery(null, null);
		length = Math.min(base_de_DatosCompras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosCompras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_en_compra...");
		base_de_datos.Producto_en_compra[] base_de_DatosProducto_en_compras = base_de_datos.Producto_en_compraDAO.listProducto_en_compraByQuery(null, null);
		length = Math.min(base_de_DatosProducto_en_compras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosProducto_en_compras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		base_de_datos.Valoracion[] base_de_DatosValoracions = base_de_datos.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(base_de_DatosValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		base_de_datos.Pendiente[] base_de_DatosPendientes = base_de_datos.PendienteDAO.listPendienteByQuery(null, null);
		length = Math.min(base_de_DatosPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		base_de_datos.Enviado[] base_de_DatosEnviados = base_de_datos.EnviadoDAO.listEnviadoByQuery(null, null);
		length = Math.min(base_de_DatosEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Recibido...");
		base_de_datos.Recibido[] base_de_DatosRecibidos = base_de_datos.RecibidoDAO.listRecibidoByQuery(null, null);
		length = Math.min(base_de_DatosRecibidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosRecibidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		base_de_datos.Mensaje[] base_de_DatosMensajes = base_de_datos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(base_de_DatosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		base_de_datos.Empleado[] base_de_DatosEmpleados = base_de_datos.EmpleadoDAO.listEmpleadoByQuery(null, null);
		length = Math.min(base_de_DatosEmpleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_DatosEmpleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario_General by Criteria...");
		base_de_datos.Usuario_GeneralCriteria base_de_DatosUsuario_GeneralCriteria = new base_de_datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosUsuario_GeneralCriteria.id_Usuario.eq();
		base_de_DatosUsuario_GeneralCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Usuario_General[] base_de_DatosUsuario_Generals = base_de_DatosUsuario_GeneralCriteria.listUsuario_General();
		int length =base_de_DatosUsuario_Generals== null ? 0 : Math.min(base_de_DatosUsuario_Generals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosUsuario_Generals[i]);
		}
		System.out.println(length + " Usuario_General record(s) retrieved."); 
		
		System.out.println("Listing UR by Criteria...");
		base_de_datos.URCriteria base_de_DatosURCriteria = new base_de_datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosURCriteria.id_Usuario.eq();
		base_de_DatosURCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.UR[] base_de_DatosURs = base_de_DatosURCriteria.listUR();
		length =base_de_DatosURs== null ? 0 : Math.min(base_de_DatosURs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosURs[i]);
		}
		System.out.println(length + " UR record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		base_de_datos.AdministradorCriteria base_de_DatosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosAdministradorCriteria.id_Usuario.eq();
		base_de_DatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Administrador[] base_de_DatosAdministradors = base_de_DatosAdministradorCriteria.listAdministrador();
		length =base_de_DatosAdministradors== null ? 0 : Math.min(base_de_DatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		base_de_datos.CategoriaCriteria base_de_DatosCategoriaCriteria = new base_de_datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosCategoriaCriteria.id_Categoria.eq();
		base_de_DatosCategoriaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Categoria[] base_de_DatosCategorias = base_de_DatosCategoriaCriteria.listCategoria();
		length =base_de_DatosCategorias== null ? 0 : Math.min(base_de_DatosCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		base_de_datos.ProductoCriteria base_de_DatosProductoCriteria = new base_de_datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosProductoCriteria.id_Producto.eq();
		base_de_DatosProductoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto[] base_de_DatosProductos = base_de_DatosProductoCriteria.listProducto();
		length =base_de_DatosProductos== null ? 0 : Math.min(base_de_DatosProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		base_de_datos.ImagenCriteria base_de_DatosImagenCriteria = new base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosImagenCriteria.ID.eq();
		base_de_DatosImagenCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Imagen[] base_de_DatosImagens = base_de_DatosImagenCriteria.listImagen();
		length =base_de_DatosImagens== null ? 0 : Math.min(base_de_DatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		base_de_datos.OfertaCriteria base_de_DatosOfertaCriteria = new base_de_datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosOfertaCriteria.id_Oferta.eq();
		base_de_DatosOfertaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Oferta[] base_de_DatosOfertas = base_de_DatosOfertaCriteria.listOferta();
		length =base_de_DatosOfertas== null ? 0 : Math.min(base_de_DatosOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Producto_Rebajado by Criteria...");
		base_de_datos.Producto_RebajadoCriteria base_de_DatosProducto_RebajadoCriteria = new base_de_datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosProducto_RebajadoCriteria.id_Producto.eq();
		base_de_DatosProducto_RebajadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto_Rebajado[] base_de_DatosProducto_Rebajados = base_de_DatosProducto_RebajadoCriteria.listProducto_Rebajado();
		length =base_de_DatosProducto_Rebajados== null ? 0 : Math.min(base_de_DatosProducto_Rebajados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosProducto_Rebajados[i]);
		}
		System.out.println(length + " Producto_Rebajado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		base_de_datos.TransportistaCriteria base_de_DatosTransportistaCriteria = new base_de_datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosTransportistaCriteria.id_Transportista.eq();
		base_de_DatosTransportistaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Transportista[] base_de_DatosTransportistas = base_de_DatosTransportistaCriteria.listTransportista();
		length =base_de_DatosTransportistas== null ? 0 : Math.min(base_de_DatosTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Encargado_de_compras by Criteria...");
		base_de_datos.Encargado_de_comprasCriteria base_de_DatosEncargado_de_comprasCriteria = new base_de_datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosEncargado_de_comprasCriteria.id_Encargado.eq();
		base_de_DatosEncargado_de_comprasCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Encargado_de_compras[] base_de_DatosEncargado_de_comprases = base_de_DatosEncargado_de_comprasCriteria.listEncargado_de_compras();
		length =base_de_DatosEncargado_de_comprases== null ? 0 : Math.min(base_de_DatosEncargado_de_comprases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " Encargado_de_compras record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		base_de_datos.ComentarioCriteria base_de_DatosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosComentarioCriteria.id_Comentario.eq();
		base_de_DatosComentarioCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Comentario[] base_de_DatosComentarios = base_de_DatosComentarioCriteria.listComentario();
		length =base_de_DatosComentarios== null ? 0 : Math.min(base_de_DatosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Compra by Criteria...");
		base_de_datos.CompraCriteria base_de_DatosCompraCriteria = new base_de_datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosCompraCriteria.codigo.eq();
		base_de_DatosCompraCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Compra[] base_de_DatosCompras = base_de_DatosCompraCriteria.listCompra();
		length =base_de_DatosCompras== null ? 0 : Math.min(base_de_DatosCompras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosCompras[i]);
		}
		System.out.println(length + " Compra record(s) retrieved."); 
		
		System.out.println("Listing Producto_en_compra by Criteria...");
		base_de_datos.Producto_en_compraCriteria base_de_DatosProducto_en_compraCriteria = new base_de_datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosProducto_en_compraCriteria.id_Producto_en_compra.eq();
		base_de_DatosProducto_en_compraCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto_en_compra[] base_de_DatosProducto_en_compras = base_de_DatosProducto_en_compraCriteria.listProducto_en_compra();
		length =base_de_DatosProducto_en_compras== null ? 0 : Math.min(base_de_DatosProducto_en_compras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosProducto_en_compras[i]);
		}
		System.out.println(length + " Producto_en_compra record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		base_de_datos.ValoracionCriteria base_de_DatosValoracionCriteria = new base_de_datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosValoracionCriteria.id_valoracion.eq();
		base_de_DatosValoracionCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Valoracion[] base_de_DatosValoracions = base_de_DatosValoracionCriteria.listValoracion();
		length =base_de_DatosValoracions== null ? 0 : Math.min(base_de_DatosValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		base_de_datos.PendienteCriteria base_de_DatosPendienteCriteria = new base_de_datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosPendienteCriteria.codigo.eq();
		base_de_DatosPendienteCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Pendiente[] base_de_DatosPendientes = base_de_DatosPendienteCriteria.listPendiente();
		length =base_de_DatosPendientes== null ? 0 : Math.min(base_de_DatosPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		base_de_datos.EnviadoCriteria base_de_DatosEnviadoCriteria = new base_de_datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosEnviadoCriteria.codigo.eq();
		base_de_DatosEnviadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Enviado[] base_de_DatosEnviados = base_de_DatosEnviadoCriteria.listEnviado();
		length =base_de_DatosEnviados== null ? 0 : Math.min(base_de_DatosEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Recibido by Criteria...");
		base_de_datos.RecibidoCriteria base_de_DatosRecibidoCriteria = new base_de_datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosRecibidoCriteria.codigo.eq();
		base_de_DatosRecibidoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Recibido[] base_de_DatosRecibidos = base_de_DatosRecibidoCriteria.listRecibido();
		length =base_de_DatosRecibidos== null ? 0 : Math.min(base_de_DatosRecibidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosRecibidos[i]);
		}
		System.out.println(length + " Recibido record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		base_de_datos.MensajeCriteria base_de_DatosMensajeCriteria = new base_de_datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosMensajeCriteria.id_Mensaje.eq();
		base_de_DatosMensajeCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Mensaje[] base_de_DatosMensajes = base_de_DatosMensajeCriteria.listMensaje();
		length =base_de_DatosMensajes== null ? 0 : Math.min(base_de_DatosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		base_de_datos.EmpleadoCriteria base_de_DatosEmpleadoCriteria = new base_de_datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_DatosEmpleadoCriteria.idEmpleado.eq();
		base_de_DatosEmpleadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Empleado[] base_de_DatosEmpleados = base_de_DatosEmpleadoCriteria.listEmpleado();
		length =base_de_DatosEmpleados== null ? 0 : Math.min(base_de_DatosEmpleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_DatosEmpleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListHitoData listHitoData = new ListHitoData();
			try {
				listHitoData.listTestData();
				//listHitoData.listByCriteria();
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

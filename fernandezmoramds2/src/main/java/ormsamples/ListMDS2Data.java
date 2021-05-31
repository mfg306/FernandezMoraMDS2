/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_General...");
		base_de_datos.Usuario_General[] base_de_datosUsuario_Generals = base_de_datos.Usuario_GeneralDAO.listUsuario_GeneralByQuery(null, null);
		int length = Math.min(base_de_datosUsuario_Generals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosUsuario_Generals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UR...");
		base_de_datos.UR[] base_de_datosURs = base_de_datos.URDAO.listURByQuery(null, null);
		length = Math.min(base_de_datosURs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosURs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		base_de_datos.Administrador[] base_de_datosAdministradors = base_de_datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(base_de_datosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		base_de_datos.Categoria[] base_de_datosCategorias = base_de_datos.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(base_de_datosCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		base_de_datos.Producto[] base_de_datosProductos = base_de_datos.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(base_de_datosProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		base_de_datos.Imagen[] base_de_datosImagens = base_de_datos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(base_de_datosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		base_de_datos.Oferta[] base_de_datosOfertas = base_de_datos.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(base_de_datosOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_Rebajado...");
		base_de_datos.Producto_Rebajado[] base_de_datosProducto_Rebajados = base_de_datos.Producto_RebajadoDAO.listProducto_RebajadoByQuery(null, null);
		length = Math.min(base_de_datosProducto_Rebajados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosProducto_Rebajados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		base_de_datos.Empleado[] base_de_datosEmpleados = base_de_datos.EmpleadoDAO.listEmpleadoByQuery(null, null);
		length = Math.min(base_de_datosEmpleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosEmpleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		base_de_datos.Transportista[] base_de_datosTransportistas = base_de_datos.TransportistaDAO.listTransportistaByQuery(null, null);
		length = Math.min(base_de_datosTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado_de_compras...");
		base_de_datos.Encargado_de_compras[] base_de_datosEncargado_de_comprases = base_de_datos.Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null, null);
		length = Math.min(base_de_datosEncargado_de_comprases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosEncargado_de_comprases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		base_de_datos.Comentario[] base_de_datosComentarios = base_de_datos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(base_de_datosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra...");
		base_de_datos.Compra[] base_de_datosCompras = base_de_datos.CompraDAO.listCompraByQuery(null, null);
		length = Math.min(base_de_datosCompras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosCompras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_en_compra...");
		base_de_datos.Producto_en_compra[] base_de_datosProducto_en_compras = base_de_datos.Producto_en_compraDAO.listProducto_en_compraByQuery(null, null);
		length = Math.min(base_de_datosProducto_en_compras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosProducto_en_compras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		base_de_datos.Valoracion[] base_de_datosValoracions = base_de_datos.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(base_de_datosValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		base_de_datos.Pendiente[] base_de_datosPendientes = base_de_datos.PendienteDAO.listPendienteByQuery(null, null);
		length = Math.min(base_de_datosPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		base_de_datos.Enviado[] base_de_datosEnviados = base_de_datos.EnviadoDAO.listEnviadoByQuery(null, null);
		length = Math.min(base_de_datosEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Recibido...");
		base_de_datos.Recibido[] base_de_datosRecibidos = base_de_datos.RecibidoDAO.listRecibidoByQuery(null, null);
		length = Math.min(base_de_datosRecibidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosRecibidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		base_de_datos.Mensaje[] base_de_datosMensajes = base_de_datos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(base_de_datosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario_General by Criteria...");
		base_de_datos.Usuario_GeneralCriteria lbase_de_datosUsuario_GeneralCriteria = new base_de_datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosUsuario_GeneralCriteria.id_Usuario.eq();
		lbase_de_datosUsuario_GeneralCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Usuario_General[] base_de_datosUsuario_Generals = lbase_de_datosUsuario_GeneralCriteria.listUsuario_General();
		int length =base_de_datosUsuario_Generals== null ? 0 : Math.min(base_de_datosUsuario_Generals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosUsuario_Generals[i]);
		}
		System.out.println(length + " Usuario_General record(s) retrieved."); 
		
		System.out.println("Listing UR by Criteria...");
		base_de_datos.URCriteria lbase_de_datosURCriteria = new base_de_datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosURCriteria.id_Usuario.eq();
		lbase_de_datosURCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.UR[] base_de_datosURs = lbase_de_datosURCriteria.listUR();
		length =base_de_datosURs== null ? 0 : Math.min(base_de_datosURs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosURs[i]);
		}
		System.out.println(length + " UR record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		base_de_datos.AdministradorCriteria lbase_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosAdministradorCriteria.id_Usuario.eq();
		lbase_de_datosAdministradorCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Administrador[] base_de_datosAdministradors = lbase_de_datosAdministradorCriteria.listAdministrador();
		length =base_de_datosAdministradors== null ? 0 : Math.min(base_de_datosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		base_de_datos.CategoriaCriteria lbase_de_datosCategoriaCriteria = new base_de_datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosCategoriaCriteria.id_Categoria.eq();
		lbase_de_datosCategoriaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Categoria[] base_de_datosCategorias = lbase_de_datosCategoriaCriteria.listCategoria();
		length =base_de_datosCategorias== null ? 0 : Math.min(base_de_datosCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		base_de_datos.ProductoCriteria lbase_de_datosProductoCriteria = new base_de_datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosProductoCriteria.id_Producto.eq();
		lbase_de_datosProductoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto[] base_de_datosProductos = lbase_de_datosProductoCriteria.listProducto();
		length =base_de_datosProductos== null ? 0 : Math.min(base_de_datosProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		base_de_datos.ImagenCriteria lbase_de_datosImagenCriteria = new base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosImagenCriteria.ID.eq();
		lbase_de_datosImagenCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Imagen[] base_de_datosImagens = lbase_de_datosImagenCriteria.listImagen();
		length =base_de_datosImagens== null ? 0 : Math.min(base_de_datosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		base_de_datos.OfertaCriteria lbase_de_datosOfertaCriteria = new base_de_datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosOfertaCriteria.id_Oferta.eq();
		lbase_de_datosOfertaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Oferta[] base_de_datosOfertas = lbase_de_datosOfertaCriteria.listOferta();
		length =base_de_datosOfertas== null ? 0 : Math.min(base_de_datosOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Producto_Rebajado by Criteria...");
		base_de_datos.Producto_RebajadoCriteria lbase_de_datosProducto_RebajadoCriteria = new base_de_datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosProducto_RebajadoCriteria.id_Producto.eq();
		lbase_de_datosProducto_RebajadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto_Rebajado[] base_de_datosProducto_Rebajados = lbase_de_datosProducto_RebajadoCriteria.listProducto_Rebajado();
		length =base_de_datosProducto_Rebajados== null ? 0 : Math.min(base_de_datosProducto_Rebajados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosProducto_Rebajados[i]);
		}
		System.out.println(length + " Producto_Rebajado record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		base_de_datos.EmpleadoCriteria lbase_de_datosEmpleadoCriteria = new base_de_datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosEmpleadoCriteria.idEmpleado.eq();
		lbase_de_datosEmpleadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Empleado[] base_de_datosEmpleados = lbase_de_datosEmpleadoCriteria.listEmpleado();
		length =base_de_datosEmpleados== null ? 0 : Math.min(base_de_datosEmpleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosEmpleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		base_de_datos.TransportistaCriteria lbase_de_datosTransportistaCriteria = new base_de_datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosTransportistaCriteria.idEmpleado.eq();
		lbase_de_datosTransportistaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Transportista[] base_de_datosTransportistas = lbase_de_datosTransportistaCriteria.listTransportista();
		length =base_de_datosTransportistas== null ? 0 : Math.min(base_de_datosTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Encargado_de_compras by Criteria...");
		base_de_datos.Encargado_de_comprasCriteria lbase_de_datosEncargado_de_comprasCriteria = new base_de_datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosEncargado_de_comprasCriteria.idEmpleado.eq();
		lbase_de_datosEncargado_de_comprasCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Encargado_de_compras[] base_de_datosEncargado_de_comprases = lbase_de_datosEncargado_de_comprasCriteria.listEncargado_de_compras();
		length =base_de_datosEncargado_de_comprases== null ? 0 : Math.min(base_de_datosEncargado_de_comprases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosEncargado_de_comprases[i]);
		}
		System.out.println(length + " Encargado_de_compras record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		base_de_datos.ComentarioCriteria lbase_de_datosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosComentarioCriteria.id_Comentario.eq();
		lbase_de_datosComentarioCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Comentario[] base_de_datosComentarios = lbase_de_datosComentarioCriteria.listComentario();
		length =base_de_datosComentarios== null ? 0 : Math.min(base_de_datosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Compra by Criteria...");
		base_de_datos.CompraCriteria lbase_de_datosCompraCriteria = new base_de_datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosCompraCriteria.codigo.eq();
		lbase_de_datosCompraCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Compra[] base_de_datosCompras = lbase_de_datosCompraCriteria.listCompra();
		length =base_de_datosCompras== null ? 0 : Math.min(base_de_datosCompras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosCompras[i]);
		}
		System.out.println(length + " Compra record(s) retrieved."); 
		
		System.out.println("Listing Producto_en_compra by Criteria...");
		base_de_datos.Producto_en_compraCriteria lbase_de_datosProducto_en_compraCriteria = new base_de_datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosProducto_en_compraCriteria.codigo.eq();
		lbase_de_datosProducto_en_compraCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Producto_en_compra[] base_de_datosProducto_en_compras = lbase_de_datosProducto_en_compraCriteria.listProducto_en_compra();
		length =base_de_datosProducto_en_compras== null ? 0 : Math.min(base_de_datosProducto_en_compras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosProducto_en_compras[i]);
		}
		System.out.println(length + " Producto_en_compra record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		base_de_datos.ValoracionCriteria lbase_de_datosValoracionCriteria = new base_de_datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosValoracionCriteria.id_valoracion.eq();
		lbase_de_datosValoracionCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Valoracion[] base_de_datosValoracions = lbase_de_datosValoracionCriteria.listValoracion();
		length =base_de_datosValoracions== null ? 0 : Math.min(base_de_datosValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		base_de_datos.PendienteCriteria lbase_de_datosPendienteCriteria = new base_de_datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosPendienteCriteria.codigo.eq();
		lbase_de_datosPendienteCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Pendiente[] base_de_datosPendientes = lbase_de_datosPendienteCriteria.listPendiente();
		length =base_de_datosPendientes== null ? 0 : Math.min(base_de_datosPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		base_de_datos.EnviadoCriteria lbase_de_datosEnviadoCriteria = new base_de_datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosEnviadoCriteria.codigo.eq();
		lbase_de_datosEnviadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Enviado[] base_de_datosEnviados = lbase_de_datosEnviadoCriteria.listEnviado();
		length =base_de_datosEnviados== null ? 0 : Math.min(base_de_datosEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Recibido by Criteria...");
		base_de_datos.RecibidoCriteria lbase_de_datosRecibidoCriteria = new base_de_datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosRecibidoCriteria.codigo.eq();
		lbase_de_datosRecibidoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Recibido[] base_de_datosRecibidos = lbase_de_datosRecibidoCriteria.listRecibido();
		length =base_de_datosRecibidos== null ? 0 : Math.min(base_de_datosRecibidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosRecibidos[i]);
		}
		System.out.println(length + " Recibido record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		base_de_datos.MensajeCriteria lbase_de_datosMensajeCriteria = new base_de_datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosMensajeCriteria.id_Mensaje.eq();
		lbase_de_datosMensajeCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Mensaje[] base_de_datosMensajes = lbase_de_datosMensajeCriteria.listMensaje();
		length =base_de_datosMensajes== null ? 0 : Math.min(base_de_datosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS2Data listMDS2Data = new ListMDS2Data();
			try {
				listMDS2Data.listTestData();
				//listMDS2Data.listByCriteria();
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

/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListHitoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_General...");
		Base_de_Datos.Usuario_General[] Base_de_DatosUsuario_Generals = Base_de_Datos.Usuario_GeneralDAO.listUsuario_GeneralByQuery(null, null);
		int length = Math.min(Base_de_DatosUsuario_Generals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosUsuario_Generals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UR...");
		Base_de_Datos.UR[] Base_de_DatosURs = Base_de_Datos.URDAO.listURByQuery(null, null);
		length = Math.min(Base_de_DatosURs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosURs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		Base_de_Datos.Administrador[] Base_de_DatosAdministradors = Base_de_Datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(Base_de_DatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		Base_de_Datos.Categoria[] Base_de_DatosCategorias = Base_de_Datos.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(Base_de_DatosCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		Base_de_Datos.Producto[] Base_de_DatosProductos = Base_de_Datos.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(Base_de_DatosProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		Base_de_Datos.Imagen[] Base_de_DatosImagens = Base_de_Datos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(Base_de_DatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		Base_de_Datos.Oferta[] Base_de_DatosOfertas = Base_de_Datos.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(Base_de_DatosOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_Rebajado...");
		Base_de_Datos.Producto_Rebajado[] Base_de_DatosProducto_Rebajados = Base_de_Datos.Producto_RebajadoDAO.listProducto_RebajadoByQuery(null, null);
		length = Math.min(Base_de_DatosProducto_Rebajados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosProducto_Rebajados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		Base_de_Datos.Empleado[] Base_de_DatosEmpleados = Base_de_Datos.EmpleadoDAO.listEmpleadoByQuery(null, null);
		length = Math.min(Base_de_DatosEmpleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosEmpleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		Base_de_Datos.Transportista[] Base_de_DatosTransportistas = Base_de_Datos.TransportistaDAO.listTransportistaByQuery(null, null);
		length = Math.min(Base_de_DatosTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado_de_compras...");
		Base_de_Datos.Encargado_de_compras[] Base_de_DatosEncargado_de_comprases = Base_de_Datos.Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null, null);
		length = Math.min(Base_de_DatosEncargado_de_comprases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		Base_de_Datos.Comentario[] Base_de_DatosComentarios = Base_de_Datos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(Base_de_DatosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra...");
		Base_de_Datos.Compra[] Base_de_DatosCompras = Base_de_Datos.CompraDAO.listCompraByQuery(null, null);
		length = Math.min(Base_de_DatosCompras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosCompras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_en_compra...");
		Base_de_Datos.Producto_en_compra[] Base_de_DatosProducto_en_compras = Base_de_Datos.Producto_en_compraDAO.listProducto_en_compraByQuery(null, null);
		length = Math.min(Base_de_DatosProducto_en_compras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosProducto_en_compras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Valoracion...");
		Base_de_Datos.Valoracion[] Base_de_DatosValoracions = Base_de_Datos.ValoracionDAO.listValoracionByQuery(null, null);
		length = Math.min(Base_de_DatosValoracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosValoracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		Base_de_Datos.Pendiente[] Base_de_DatosPendientes = Base_de_Datos.PendienteDAO.listPendienteByQuery(null, null);
		length = Math.min(Base_de_DatosPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		Base_de_Datos.Enviado[] Base_de_DatosEnviados = Base_de_Datos.EnviadoDAO.listEnviadoByQuery(null, null);
		length = Math.min(Base_de_DatosEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Recibido...");
		Base_de_Datos.Recibido[] Base_de_DatosRecibidos = Base_de_Datos.RecibidoDAO.listRecibidoByQuery(null, null);
		length = Math.min(Base_de_DatosRecibidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosRecibidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		Base_de_Datos.Mensaje[] Base_de_DatosMensajes = Base_de_Datos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(Base_de_DatosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(Base_de_DatosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario_General by Criteria...");
		Base_de_Datos.Usuario_GeneralCriteria Base_de_DatosUsuario_GeneralCriteria = new Base_de_Datos.Usuario_GeneralCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosUsuario_GeneralCriteria.id_Usuario.eq();
		Base_de_DatosUsuario_GeneralCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Usuario_General[] Base_de_DatosUsuario_Generals = Base_de_DatosUsuario_GeneralCriteria.listUsuario_General();
		int length =Base_de_DatosUsuario_Generals== null ? 0 : Math.min(Base_de_DatosUsuario_Generals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosUsuario_Generals[i]);
		}
		System.out.println(length + " Usuario_General record(s) retrieved."); 
		
		System.out.println("Listing UR by Criteria...");
		Base_de_Datos.URCriteria Base_de_DatosURCriteria = new Base_de_Datos.URCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosURCriteria.id_Usuario.eq();
		Base_de_DatosURCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.UR[] Base_de_DatosURs = Base_de_DatosURCriteria.listUR();
		length =Base_de_DatosURs== null ? 0 : Math.min(Base_de_DatosURs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosURs[i]);
		}
		System.out.println(length + " UR record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		Base_de_Datos.AdministradorCriteria Base_de_DatosAdministradorCriteria = new Base_de_Datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosAdministradorCriteria.id_Usuario.eq();
		Base_de_DatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Administrador[] Base_de_DatosAdministradors = Base_de_DatosAdministradorCriteria.listAdministrador();
		length =Base_de_DatosAdministradors== null ? 0 : Math.min(Base_de_DatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		Base_de_Datos.CategoriaCriteria Base_de_DatosCategoriaCriteria = new Base_de_Datos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosCategoriaCriteria.id_Categoria.eq();
		Base_de_DatosCategoriaCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Categoria[] Base_de_DatosCategorias = Base_de_DatosCategoriaCriteria.listCategoria();
		length =Base_de_DatosCategorias== null ? 0 : Math.min(Base_de_DatosCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		Base_de_Datos.ProductoCriteria Base_de_DatosProductoCriteria = new Base_de_Datos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosProductoCriteria.id_Producto.eq();
		Base_de_DatosProductoCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Producto[] Base_de_DatosProductos = Base_de_DatosProductoCriteria.listProducto();
		length =Base_de_DatosProductos== null ? 0 : Math.min(Base_de_DatosProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		Base_de_Datos.ImagenCriteria Base_de_DatosImagenCriteria = new Base_de_Datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosImagenCriteria.ID.eq();
		Base_de_DatosImagenCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Imagen[] Base_de_DatosImagens = Base_de_DatosImagenCriteria.listImagen();
		length =Base_de_DatosImagens== null ? 0 : Math.min(Base_de_DatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		Base_de_Datos.OfertaCriteria Base_de_DatosOfertaCriteria = new Base_de_Datos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosOfertaCriteria.id_Oferta.eq();
		Base_de_DatosOfertaCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Oferta[] Base_de_DatosOfertas = Base_de_DatosOfertaCriteria.listOferta();
		length =Base_de_DatosOfertas== null ? 0 : Math.min(Base_de_DatosOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Producto_Rebajado by Criteria...");
		Base_de_Datos.Producto_RebajadoCriteria Base_de_DatosProducto_RebajadoCriteria = new Base_de_Datos.Producto_RebajadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosProducto_RebajadoCriteria.id_Producto.eq();
		Base_de_DatosProducto_RebajadoCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Producto_Rebajado[] Base_de_DatosProducto_Rebajados = Base_de_DatosProducto_RebajadoCriteria.listProducto_Rebajado();
		length =Base_de_DatosProducto_Rebajados== null ? 0 : Math.min(Base_de_DatosProducto_Rebajados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosProducto_Rebajados[i]);
		}
		System.out.println(length + " Producto_Rebajado record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		Base_de_Datos.EmpleadoCriteria Base_de_DatosEmpleadoCriteria = new Base_de_Datos.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosEmpleadoCriteria.idEmpleado.eq();
		Base_de_DatosEmpleadoCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Empleado[] Base_de_DatosEmpleados = Base_de_DatosEmpleadoCriteria.listEmpleado();
		length =Base_de_DatosEmpleados== null ? 0 : Math.min(Base_de_DatosEmpleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosEmpleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		Base_de_Datos.TransportistaCriteria Base_de_DatosTransportistaCriteria = new Base_de_Datos.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosTransportistaCriteria.idEmpleado.eq();
		Base_de_DatosTransportistaCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Transportista[] Base_de_DatosTransportistas = Base_de_DatosTransportistaCriteria.listTransportista();
		length =Base_de_DatosTransportistas== null ? 0 : Math.min(Base_de_DatosTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Encargado_de_compras by Criteria...");
		Base_de_Datos.Encargado_de_comprasCriteria Base_de_DatosEncargado_de_comprasCriteria = new Base_de_Datos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosEncargado_de_comprasCriteria.idEmpleado.eq();
		Base_de_DatosEncargado_de_comprasCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Encargado_de_compras[] Base_de_DatosEncargado_de_comprases = Base_de_DatosEncargado_de_comprasCriteria.listEncargado_de_compras();
		length =Base_de_DatosEncargado_de_comprases== null ? 0 : Math.min(Base_de_DatosEncargado_de_comprases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " Encargado_de_compras record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		Base_de_Datos.ComentarioCriteria Base_de_DatosComentarioCriteria = new Base_de_Datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosComentarioCriteria.id_Comentario.eq();
		Base_de_DatosComentarioCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Comentario[] Base_de_DatosComentarios = Base_de_DatosComentarioCriteria.listComentario();
		length =Base_de_DatosComentarios== null ? 0 : Math.min(Base_de_DatosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Compra by Criteria...");
		Base_de_Datos.CompraCriteria Base_de_DatosCompraCriteria = new Base_de_Datos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosCompraCriteria.codigo.eq();
		Base_de_DatosCompraCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Compra[] Base_de_DatosCompras = Base_de_DatosCompraCriteria.listCompra();
		length =Base_de_DatosCompras== null ? 0 : Math.min(Base_de_DatosCompras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosCompras[i]);
		}
		System.out.println(length + " Compra record(s) retrieved."); 
		
		System.out.println("Listing Producto_en_compra by Criteria...");
		Base_de_Datos.Producto_en_compraCriteria Base_de_DatosProducto_en_compraCriteria = new Base_de_Datos.Producto_en_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosProducto_en_compraCriteria.id_Producto_en_compra.eq();
		Base_de_DatosProducto_en_compraCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Producto_en_compra[] Base_de_DatosProducto_en_compras = Base_de_DatosProducto_en_compraCriteria.listProducto_en_compra();
		length =Base_de_DatosProducto_en_compras== null ? 0 : Math.min(Base_de_DatosProducto_en_compras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosProducto_en_compras[i]);
		}
		System.out.println(length + " Producto_en_compra record(s) retrieved."); 
		
		System.out.println("Listing Valoracion by Criteria...");
		Base_de_Datos.ValoracionCriteria Base_de_DatosValoracionCriteria = new Base_de_Datos.ValoracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosValoracionCriteria.id_valoracion.eq();
		Base_de_DatosValoracionCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Valoracion[] Base_de_DatosValoracions = Base_de_DatosValoracionCriteria.listValoracion();
		length =Base_de_DatosValoracions== null ? 0 : Math.min(Base_de_DatosValoracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosValoracions[i]);
		}
		System.out.println(length + " Valoracion record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		Base_de_Datos.PendienteCriteria Base_de_DatosPendienteCriteria = new Base_de_Datos.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosPendienteCriteria.codigo.eq();
		Base_de_DatosPendienteCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Pendiente[] Base_de_DatosPendientes = Base_de_DatosPendienteCriteria.listPendiente();
		length =Base_de_DatosPendientes== null ? 0 : Math.min(Base_de_DatosPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		Base_de_Datos.EnviadoCriteria Base_de_DatosEnviadoCriteria = new Base_de_Datos.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosEnviadoCriteria.codigo.eq();
		Base_de_DatosEnviadoCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Enviado[] Base_de_DatosEnviados = Base_de_DatosEnviadoCriteria.listEnviado();
		length =Base_de_DatosEnviados== null ? 0 : Math.min(Base_de_DatosEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Recibido by Criteria...");
		Base_de_Datos.RecibidoCriteria Base_de_DatosRecibidoCriteria = new Base_de_Datos.RecibidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosRecibidoCriteria.codigo.eq();
		Base_de_DatosRecibidoCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Recibido[] Base_de_DatosRecibidos = Base_de_DatosRecibidoCriteria.listRecibido();
		length =Base_de_DatosRecibidos== null ? 0 : Math.min(Base_de_DatosRecibidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosRecibidos[i]);
		}
		System.out.println(length + " Recibido record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		Base_de_Datos.MensajeCriteria Base_de_DatosMensajeCriteria = new Base_de_Datos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//Base_de_DatosMensajeCriteria.id_Mensaje.eq();
		Base_de_DatosMensajeCriteria.setMaxResults(ROW_COUNT);
		Base_de_Datos.Mensaje[] Base_de_DatosMensajes = Base_de_DatosMensajeCriteria.listMensaje();
		length =Base_de_DatosMensajes== null ? 0 : Math.min(Base_de_DatosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(Base_de_DatosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListHitoData listHitoData = new ListHitoData();
			try {
				listHitoData.listTestData();
				//listHitoData.listByCriteria();
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

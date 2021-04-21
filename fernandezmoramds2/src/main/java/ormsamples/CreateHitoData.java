/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateHitoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General base_de_DatosUsuario_General = base_de_datos.Usuario_GeneralDAO.createUsuario_General();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_administrador
			base_de_datos.Usuario_GeneralDAO.save(base_de_DatosUsuario_General);
			base_de_datos.UR base_de_DatosUR = base_de_datos.URDAO.createUR();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valora, _Envia, _Es_de_un
			base_de_datos.URDAO.save(base_de_DatosUR);
			base_de_datos.Administrador base_de_DatosAdministrador = base_de_datos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Envia
			base_de_datos.AdministradorDAO.save(base_de_DatosAdministrador);
			base_de_datos.Categoria base_de_DatosCategoria = base_de_datos.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto
			base_de_datos.CategoriaDAO.save(base_de_DatosCategoria);
			base_de_datos.Producto base_de_DatosProducto = base_de_datos.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Imagen, _Pertenece_a, _Producto_en_compra, num_Unidades_Restantes, precio_producto, _Categoria, _Valorado_por
			base_de_datos.ProductoDAO.save(base_de_DatosProducto);
			base_de_datos.Imagen base_de_DatosImagen = base_de_datos.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : principal, _Producto
			base_de_datos.ImagenDAO.save(base_de_DatosImagen);
			base_de_datos.Oferta base_de_DatosOferta = base_de_datos.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pertenece_a
			base_de_datos.OfertaDAO.save(base_de_DatosOferta);
			base_de_datos.Producto_Rebajado base_de_DatosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.createProducto_Rebajado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene
			base_de_datos.Producto_RebajadoDAO.save(base_de_DatosProducto_Rebajado);
			base_de_datos.Transportista base_de_DatosTransportista = base_de_datos.TransportistaDAO.createTransportista();
			// Initialize the properties of the persistent object here
			base_de_datos.TransportistaDAO.save(base_de_DatosTransportista);
			base_de_datos.Encargado_de_compras base_de_DatosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.createEncargado_de_compras();
			// Initialize the properties of the persistent object here
			base_de_datos.Encargado_de_comprasDAO.save(base_de_DatosEncargado_de_compras);
			base_de_datos.Comentario base_de_DatosComentario = base_de_datos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, _Realiza
			base_de_datos.ComentarioDAO.save(base_de_DatosComentario);
			base_de_datos.Compra base_de_DatosCompra = base_de_datos.CompraDAO.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio_total, num_total_unidades
			base_de_datos.CompraDAO.save(base_de_DatosCompra);
			base_de_datos.Producto_en_compra base_de_DatosProducto_en_compra = base_de_datos.Producto_en_compraDAO.createProducto_en_compra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pendiente, _Producto, num_unidades_producto
			base_de_datos.Producto_en_compraDAO.save(base_de_DatosProducto_en_compra);
			base_de_datos.Valoracion base_de_DatosValoracion = base_de_datos.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valorado, valoracion, _Valorado_por
			base_de_datos.ValoracionDAO.save(base_de_DatosValoracion);
			base_de_datos.Pendiente base_de_DatosPendiente = base_de_datos.PendienteDAO.createPendiente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto_en_compra
			base_de_datos.PendienteDAO.save(base_de_DatosPendiente);
			base_de_datos.Enviado base_de_DatosEnviado = base_de_datos.EnviadoDAO.createEnviado();
			// Initialize the properties of the persistent object here
			base_de_datos.EnviadoDAO.save(base_de_DatosEnviado);
			base_de_datos.Recibido base_de_DatosRecibido = base_de_datos.RecibidoDAO.createRecibido();
			// Initialize the properties of the persistent object here
			base_de_datos.RecibidoDAO.save(base_de_DatosRecibido);
			base_de_datos.Mensaje base_de_DatosMensaje = base_de_datos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Mensaje, _Responder_a, _Enviado_por_UR, _Enviado_por_Admin
			base_de_datos.MensajeDAO.save(base_de_DatosMensaje);
			base_de_datos.Empleado base_de_DatosEmpleado = base_de_datos.EmpleadoDAO.createEmpleado();
			// Initialize the properties of the persistent object here
			base_de_datos.EmpleadoDAO.save(base_de_DatosEmpleado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateHitoData createHitoData = new CreateHitoData();
			try {
				createHitoData.createTestData();
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

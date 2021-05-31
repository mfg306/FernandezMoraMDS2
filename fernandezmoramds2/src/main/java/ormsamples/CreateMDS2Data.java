/**
 * Licensee: martafernandez(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario_General lbase_de_datosUsuario_General = base_de_datos.Usuario_GeneralDAO.createUsuario_General();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_administrador
			base_de_datos.Usuario_GeneralDAO.save(lbase_de_datosUsuario_General);
			base_de_datos.UR lbase_de_datosUR = base_de_datos.URDAO.createUR();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valora, _Envia, _recibido, _Compra, _Es_de_un, esta_operativo
			base_de_datos.URDAO.save(lbase_de_datosUR);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Envia
			base_de_datos.AdministradorDAO.save(lbase_de_datosAdministrador);
			base_de_datos.Categoria lbase_de_datosCategoria = base_de_datos.CategoriaDAO.createCategoria();
			// Initialize the properties of the persistent object here
			base_de_datos.CategoriaDAO.save(lbase_de_datosCategoria);
			base_de_datos.Producto lbase_de_datosProducto = base_de_datos.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valorado_por, _Pertenece_a, _Producto_en_compra, num_Unidades_Restantes, precio_producto
			base_de_datos.ProductoDAO.save(lbase_de_datosProducto);
			base_de_datos.Imagen lbase_de_datosImagen = base_de_datos.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : principal
			base_de_datos.ImagenDAO.save(lbase_de_datosImagen);
			base_de_datos.Oferta lbase_de_datosOferta = base_de_datos.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pertenece_a
			base_de_datos.OfertaDAO.save(lbase_de_datosOferta);
			base_de_datos.Producto_Rebajado lbase_de_datosProducto_Rebajado = base_de_datos.Producto_RebajadoDAO.createProducto_Rebajado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, precio_rebajado
			base_de_datos.Producto_RebajadoDAO.save(lbase_de_datosProducto_Rebajado);
			base_de_datos.Empleado lbase_de_datosEmpleado = base_de_datos.EmpleadoDAO.createEmpleado();
			// Initialize the properties of the persistent object here
			base_de_datos.EmpleadoDAO.save(lbase_de_datosEmpleado);
			base_de_datos.Transportista lbase_de_datosTransportista = base_de_datos.TransportistaDAO.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Enviado, _Recibido
			base_de_datos.TransportistaDAO.save(lbase_de_datosTransportista);
			base_de_datos.Encargado_de_compras lbase_de_datosEncargado_de_compras = base_de_datos.Encargado_de_comprasDAO.createEncargado_de_compras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pedido_enviado, _Pendiente
			base_de_datos.Encargado_de_comprasDAO.save(lbase_de_datosEncargado_de_compras);
			base_de_datos.Comentario lbase_de_datosComentario = base_de_datos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, _Realiza
			base_de_datos.ComentarioDAO.save(lbase_de_datosComentario);
			base_de_datos.Compra lbase_de_datosCompra = base_de_datos.CompraDAO.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio_total, num_total_unidades
			base_de_datos.CompraDAO.save(lbase_de_datosCompra);
			base_de_datos.Producto_en_compra lbase_de_datosProducto_en_compra = base_de_datos.Producto_en_compraDAO.createProducto_en_compra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : num_unidades_producto, _Producto, _Pendiente
			base_de_datos.Producto_en_compraDAO.save(lbase_de_datosProducto_en_compra);
			base_de_datos.Valoracion lbase_de_datosValoracion = base_de_datos.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion, _Valorado_por, _Valorado
			base_de_datos.ValoracionDAO.save(lbase_de_datosValoracion);
			base_de_datos.Pendiente lbase_de_datosPendiente = base_de_datos.PendienteDAO.createPendiente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto_en_compra, _Hace_compra, _Encargado_de_compras, id_cola, asignado
			base_de_datos.PendienteDAO.save(lbase_de_datosPendiente);
			base_de_datos.Enviado lbase_de_datosEnviado = base_de_datos.EnviadoDAO.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Procesa, _Transportista, codigoPendiente, enviado
			base_de_datos.EnviadoDAO.save(lbase_de_datosEnviado);
			base_de_datos.Recibido lbase_de_datosRecibido = base_de_datos.RecibidoDAO.createRecibido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Recoge, _recibe, recibido
			base_de_datos.RecibidoDAO.save(lbase_de_datosRecibido);
			base_de_datos.Mensaje lbase_de_datosMensaje = base_de_datos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Enviado_por_UR, _Enviado_por_Admin
			base_de_datos.MensajeDAO.save(lbase_de_datosMensaje);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS2Data createMDS2Data = new CreateMDS2Data();
			try {
				createMDS2Data.createTestData();
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

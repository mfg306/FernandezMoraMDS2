/**
 * Licensee: jorge(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateHitoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = Base_de_Datos.HitoPersistentManager.instance().getSession().beginTransaction();
		try {
			Base_de_Datos.Usuario_General Base_de_DatosUsuario_General = Base_de_Datos.Usuario_GeneralDAO.createUsuario_General();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_administrador
			Base_de_Datos.Usuario_GeneralDAO.save(Base_de_DatosUsuario_General);
			Base_de_Datos.UR Base_de_DatosUR = Base_de_Datos.URDAO.createUR();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valora, _Envia, _recibido, _Compra, _Es_de_un, esta_operativo
			Base_de_Datos.URDAO.save(Base_de_DatosUR);
			Base_de_Datos.Administrador Base_de_DatosAdministrador = Base_de_Datos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Envia
			Base_de_Datos.AdministradorDAO.save(Base_de_DatosAdministrador);
			Base_de_Datos.Categoria Base_de_DatosCategoria = Base_de_Datos.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto
			Base_de_Datos.CategoriaDAO.save(Base_de_DatosCategoria);
			Base_de_Datos.Producto Base_de_DatosProducto = Base_de_Datos.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Imagen, _Pertenece_a, _Producto_en_compra, num_Unidades_Restantes, precio_producto, _Categoria, _Valorado_por
			Base_de_Datos.ProductoDAO.save(Base_de_DatosProducto);
			Base_de_Datos.Imagen Base_de_DatosImagen = Base_de_Datos.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : principal, _Producto
			Base_de_Datos.ImagenDAO.save(Base_de_DatosImagen);
			Base_de_Datos.Oferta Base_de_DatosOferta = Base_de_Datos.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pertenece_a
			Base_de_Datos.OfertaDAO.save(Base_de_DatosOferta);
			Base_de_Datos.Producto_Rebajado Base_de_DatosProducto_Rebajado = Base_de_Datos.Producto_RebajadoDAO.createProducto_Rebajado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, precio_rebajado
			Base_de_Datos.Producto_RebajadoDAO.save(Base_de_DatosProducto_Rebajado);
			Base_de_Datos.Empleado Base_de_DatosEmpleado = Base_de_Datos.EmpleadoDAO.createEmpleado();
			// Initialize the properties of the persistent object here
			Base_de_Datos.EmpleadoDAO.save(Base_de_DatosEmpleado);
			Base_de_Datos.Transportista Base_de_DatosTransportista = Base_de_Datos.TransportistaDAO.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Enviado, _Recibido, id_Transportista
			Base_de_Datos.TransportistaDAO.save(Base_de_DatosTransportista);
			Base_de_Datos.Encargado_de_compras Base_de_DatosEncargado_de_compras = Base_de_Datos.Encargado_de_comprasDAO.createEncargado_de_compras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pedido_enviado, _Pendiente, id_Encargado
			Base_de_Datos.Encargado_de_comprasDAO.save(Base_de_DatosEncargado_de_compras);
			Base_de_Datos.Comentario Base_de_DatosComentario = Base_de_Datos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, _Realiza
			Base_de_Datos.ComentarioDAO.save(Base_de_DatosComentario);
			Base_de_Datos.Compra Base_de_DatosCompra = Base_de_Datos.CompraDAO.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio_total, num_total_unidades
			Base_de_Datos.CompraDAO.save(Base_de_DatosCompra);
			Base_de_Datos.Producto_en_compra Base_de_DatosProducto_en_compra = Base_de_Datos.Producto_en_compraDAO.createProducto_en_compra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pendiente, _Producto, num_unidades_producto
			Base_de_Datos.Producto_en_compraDAO.save(Base_de_DatosProducto_en_compra);
			Base_de_Datos.Valoracion Base_de_DatosValoracion = Base_de_Datos.ValoracionDAO.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valorado, valoracion, _Valorado_por
			Base_de_Datos.ValoracionDAO.save(Base_de_DatosValoracion);
			Base_de_Datos.Pendiente Base_de_DatosPendiente = Base_de_Datos.PendienteDAO.createPendiente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto_en_compra, _Hace_compra, _Encargado_de_compras
			Base_de_Datos.PendienteDAO.save(Base_de_DatosPendiente);
			Base_de_Datos.Enviado Base_de_DatosEnviado = Base_de_Datos.EnviadoDAO.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Procesa, _Transportista, id_Cola
			Base_de_Datos.EnviadoDAO.save(Base_de_DatosEnviado);
			Base_de_Datos.Recibido Base_de_DatosRecibido = Base_de_Datos.RecibidoDAO.createRecibido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Recoge, _recibe
			Base_de_Datos.RecibidoDAO.save(Base_de_DatosRecibido);
			Base_de_Datos.Mensaje Base_de_DatosMensaje = Base_de_Datos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Mensaje, _Responder_a, _Enviado_por_UR, _Enviado_por_Admin
			Base_de_Datos.MensajeDAO.save(Base_de_DatosMensaje);
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
				Base_de_Datos.HitoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

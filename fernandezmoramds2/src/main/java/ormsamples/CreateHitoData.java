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
			base_de_datos.Usuario_General base_de_datosUsuario_General = base_de_datos.Usuario_General.createUsuario_General();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_administrador
			base_de_datosUsuario_General.save();
			base_de_datos.UR base_de_datosUR = base_de_datos.UR.createUR();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valora, _Envia, _recibido, _Compra, _Es_de_un, esta_operativo
			base_de_datosUR.save();
			base_de_datos.Administrador base_de_datosAdministrador = base_de_datos.Administrador.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Envia
			base_de_datosAdministrador.save();
			base_de_datos.Categoria base_de_datosCategoria = base_de_datos.Categoria.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto
			base_de_datosCategoria.save();
			base_de_datos.Producto base_de_datosProducto = base_de_datos.Producto.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Imagen, _Pertenece_a, _Producto_en_compra, num_Unidades_Restantes, precio_producto, _Categoria, _Valorado_por
			base_de_datosProducto.save();
			base_de_datos.Imagen base_de_datosImagen = base_de_datos.Imagen.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : principal, _Producto
			base_de_datosImagen.save();
			base_de_datos.Oferta base_de_datosOferta = base_de_datos.Oferta.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pertenece_a
			base_de_datosOferta.save();
			base_de_datos.Producto_Rebajado base_de_datosProducto_Rebajado = base_de_datos.Producto_Rebajado.createProducto_Rebajado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, precio_rebajado
			base_de_datosProducto_Rebajado.save();
			base_de_datos.Empleado base_de_datosEmpleado = base_de_datos.Empleado.createEmpleado();
			// Initialize the properties of the persistent object here
			base_de_datosEmpleado.save();
			base_de_datos.Transportista base_de_datosTransportista = base_de_datos.Transportista.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Enviado, _Recibido, id_Transportista
			base_de_datosTransportista.save();
			base_de_datos.Encargado_de_compras base_de_datosEncargado_de_compras = base_de_datos.Encargado_de_compras.createEncargado_de_compras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pedido_enviado, _Pendiente, id_Encargado
			base_de_datosEncargado_de_compras.save();
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.Comentario.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Tiene, _Realiza
			base_de_datosComentario.save();
			base_de_datos.Compra base_de_datosCompra = base_de_datos.Compra.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio_total, num_total_unidades
			base_de_datosCompra.save();
			base_de_datos.Producto_en_compra base_de_datosProducto_en_compra = base_de_datos.Producto_en_compra.createProducto_en_compra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Pendiente, _Producto, num_unidades_producto
			base_de_datosProducto_en_compra.save();
			base_de_datos.Valoracion base_de_datosValoracion = base_de_datos.Valoracion.createValoracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Valorado, valoracion, _Valorado_por
			base_de_datosValoracion.save();
			base_de_datos.Pendiente base_de_datosPendiente = base_de_datos.Pendiente.createPendiente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Producto_en_compra, _Hace_compra, _Encargado_de_compras
			base_de_datosPendiente.save();
			base_de_datos.Enviado base_de_datosEnviado = base_de_datos.Enviado.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Procesa, _Transportista, id_Cola
			base_de_datosEnviado.save();
			base_de_datos.Recibido base_de_datosRecibido = base_de_datos.Recibido.createRecibido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Recoge, _recibe
			base_de_datosRecibido.save();
			base_de_datos.Mensaje base_de_datosMensaje = base_de_datos.Mensaje.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _Mensaje, _Responder_a, _Enviado_por_UR, _Enviado_por_Admin
			base_de_datosMensaje.save();
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

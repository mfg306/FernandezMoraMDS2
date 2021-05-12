package fernandezmora.interfaz;

import vistas.VistaMensaje_recibido;

public class Mensaje_recibido extends VistaMensaje_recibido {
	public Mensajes_recibidos _mensajes_recibidos;
	public Crear_mensaje _crear_mensaje;
	base_de_datos.Mensaje mensaje;
	base_de_datos.Usuario_General general;

	
	public Mensaje_recibido(base_de_datos.Usuario_General general, base_de_datos.Mensaje mensaje, Mensajes_recibidos mensajesR) {
		this.mensaje = mensaje;
		this.general = general;
		this._mensajes_recibidos = mensajesR;
		this.getSpan1().setText(this.mensaje.getMensaje());
		this.getSpan().setText(this.mensaje.getCorreo_emisor());
		
		abrir_Crear_Mensaje_Responder(); //No lo abre bien
	}	
	
	
	public void limpiar_interfaz() {
		this._mensajes_recibidos._ver_bandeja_de_entrada.layout.remove(this._crear_mensaje);
	}
	
	
	public void abrir_Crear_Mensaje_Responder() {
			this.getResponder().addClickListener(event ->{
				this._crear_mensaje = new Crear_mensaje(general, mensaje);
				this._mensajes_recibidos.limpiar_interfaz();
				this._mensajes_recibidos._ver_bandeja_de_entrada.limpiar_interfaz();
				this._mensajes_recibidos._ver_bandeja_de_entrada.layout.add(this._crear_mensaje);
				
				/*Cerrar el de otro mensaje si estaba abierto*/
				for(Mensaje_recibido mr : this._mensajes_recibidos._list_Mensaje_recibido){
					if(mr._crear_mensaje != null) {
						System.out.println("Ya habia uno abierto y se va a cerrar");
						mr.limpiar_interfaz();
					}
				}

			});
		}
}
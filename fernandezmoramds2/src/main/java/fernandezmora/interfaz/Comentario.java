package fernandezmora.interfaz;

import vistas.VistaComentario;

public class Comentario extends VistaComentario {
	public Comentarios _comentarios;
	public base_de_datos.Comentario comentario;
	public base_de_datos.UR usuario;
	
	public Comentario(base_de_datos.Comentario co, base_de_datos.UR u, Comentarios c) {
		this.comentario = co;
		this._comentarios = c;
		this.usuario = u;
		this.getNombreComentarioUsuario().setText(this.comentario.get_Realiza().getNombre());
		this.getComentarioProducto().setText(this.comentario.getComentario());
	}
}
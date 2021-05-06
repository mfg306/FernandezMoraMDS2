package fernandezmora.interfaz;

import vistas.VistaComentario;

public class Comentario extends VistaComentario {
	public Comentarios _comentarios;
	public base_de_datos.Comentario comentario;
	
	public Comentario(base_de_datos.Comentario co, Comentarios c) {
		this.comentario = co;
		this._comentarios = c;
	}
}
package fernandezmora.interfaz;

public class Ver_mensajes_enviados extends Ver_bandeja_de_entrada {
	public Mensajes_recibidos _mensajes_recibidos;
	public Mensajes_enviados _mensajes_enviados;
	//public VerticalLayout layoutMensajesEnviados;

	public Ver_mensajes_enviados() {
		this.inicializarMensajesEnviados();
	}

	public void inicializarMensajesEnviados() {
		this._mensajes_enviados = new Mensajes_enviados();
		this.getVaadinVerticalLayout().setVisible(false); // El menu se oculta

		//layoutMensajesEnviados = this.getHuecoMensajes().as(VerticalLayout.class);

		this.getSpan().setVisible(false);
		this.getVaadinVerticalLayout1().setVisible(false);

		layout.add(this._mensajes_enviados);
	}

}

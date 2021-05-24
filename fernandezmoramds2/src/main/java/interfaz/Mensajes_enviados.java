package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;

public class Mensajes_enviados extends Mensajes_recibidos {
	public Ver_mensajes_enviados _ver_mensajes_enviados;
	public Vector<Mensaje_enviado> _list_Mensaje_enviado = new Vector<Mensaje_enviado>();
	public Crear_mensaje _crear_mensaje;
	public VerticalLayout layoutEnviados;
	base_de_datos.Usuario_General general;

	private int mensajesPorPaginaE = 2;
	private int numeroTotalRegistrosE = 0;
	private int numeroTotalPaginasE = 0;
	int paginaActualE = 0;
	
	int contador = 0;

	public Mensajes_enviados(base_de_datos.Usuario_General general, Ver_mensajes_enviados vme) {
		super(general, vme);
		this.general = general;
		
		inicializarEnviados(this.paginaActualE);
		
	}

	public void inicializarEnviados(int paginaActual) {
		this._list_Mensaje_enviado = new Vector<Mensaje_enviado>();
		this.layoutEnviados = this.getHueco_mensajes_recibidos().as(VerticalLayout.class);
		this.layout.removeAll(); // Vaciamos los mensajes recibidos que hubiese

		numeroTotalRegistrosE = 0;
		numeroTotalPaginasE = 0;
		verMensajesEnviados();
		
		/*Cuando contador = 0 quiere decir que estamos leyendo primero el constructor de Mensajes_recibidos
		 * porque estamos heredando dicho constructor con el super. Entonces, no queremos repetir estas dos lineas,
		 * unicamente cuando accedamos a inicializarEnviados porque haya que refrescar, es decir, cuando contador > 0 */
		if(contador  > 0 ) {
			this.Ver_mensajes_anteriores();
			this.Ver_mensajes_siguientes();
		}
		
		contador ++;
	}

	public void add_mensaje_enviado(base_de_datos.Mensaje mensaje) {
		Mensaje_enviado me = new Mensaje_enviado(this.general, mensaje, this);
		boolean encontrado = false;

		for (int i = 0; i < this._list_Mensaje_enviado.size(); i++) {
			if (this._list_Mensaje_enviado.get(i).mensaje.getId_Mensaje() == mensaje.getId_Mensaje()) {
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			this._list_Mensaje_enviado.add(me);
			this.numeroTotalRegistrosE++;
		}

		this.mostrar_MensajesEnviados_Paginados();

	}

	public void mostrar_MensajesEnviados_Paginados() {
		this.layout.removeAll();

		if (numeroTotalRegistrosE % mensajesPorPaginaE == 0) {
			numeroTotalPaginasE = numeroTotalRegistrosE / mensajesPorPaginaE;
		} else {
			numeroTotalPaginasE = (int) Math.round(((numeroTotalRegistrosE + 1) / mensajesPorPaginaE));
		}

		this.getPaginaActual().setText("" + (paginaActualE + 1));
		this.getTotalPaginas().setText("" + numeroTotalPaginasE);

		for (int i = (paginaActualE * mensajesPorPaginaE); i < this._list_Mensaje_enviado.size(); i++) {
			if (i > paginaActualE * mensajesPorPaginaE + mensajesPorPaginaE - 1) break;
			layout.add(this._list_Mensaje_enviado.get(i));
		}
	}

	public void verMensajesEnviados() {
		base_de_datos.Mensaje mensajes[] = null;
		if (this.general instanceof base_de_datos.Administrador) {
			basededatos.iAdministrador iadmin = new BDPrincipal();
			try {
				mensajes = iadmin.cargarMensajesEnviados(this.general);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}

		if (this.general instanceof base_de_datos.UR) {
			basededatos.iUR ur = new BDPrincipal();
			try {
				mensajes = ur.cargarMensajesEnviados(this.general);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}

		for (base_de_datos.Mensaje m : mensajes) {
			this.add_mensaje_enviado(m);
		}
	}

	@Override
	public void Ver_mensajes_anteriores() {
		if(this.getBoton_pagina_anterior().isEnabled()) {
			this.getBoton_pagina_anterior().addClickListener(event -> {
				if (paginaActualE > 0) {
					this.paginaActualE--;
				}
				
				if(this.paginaActualE == 0) {
					this.getBoton_pagina_anterior().setEnabled(false);
				}
				
				this.getBoton_pagina_siguiente().setEnabled(true);
				
				this.inicializarEnviados(paginaActualE);

			});
		}

	}

	@Override
	public void Ver_mensajes_siguientes() {
		if(this.getBoton_pagina_siguiente().isEnabled()) {
			this.getBoton_pagina_siguiente().addClickListener(event -> {
				if ((paginaActualE + 1) < numeroTotalPaginasE) {
					this.paginaActualE++;
				}
				
				this.getBoton_pagina_anterior().setEnabled(true);
				
				if(this.paginaActualE + 1 == numeroTotalPaginasE) {
					this.getBoton_pagina_siguiente().setEnabled(false);
				}
				
				this.inicializarEnviados(paginaActualE);
			});
		}
	}
	
	
	@Override
	public void abrir_Crear_Mensaje() {
		this.getBoton_crear_mensaje().addClickListener(event ->{
			this._ver_bandeja_de_entrada.limpiar_mensajes();
			this.limpiar_interfaz();
			this._crear_mensaje = new Crear_mensaje(this.general, this);
			this.layout.removeAll();
			this._ver_bandeja_de_entrada.getHuecoMensajes().as(VerticalLayout.class).add(this._crear_mensaje);
		});
	}
}
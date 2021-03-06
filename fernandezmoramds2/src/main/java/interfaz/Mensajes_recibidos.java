package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaMensajes_recibidos;


public class Mensajes_recibidos extends VistaMensajes_recibidos {

	public Ver_bandeja_de_entrada _ver_bandeja_de_entrada;
	public Ver_mensajes_enviados _list_Ver_mensajes_enviados;
	public Vector<Mensaje_recibido> _list_Mensaje_recibido = new Vector<Mensaje_recibido>();
	public Crear_mensaje _crear_mensaje;
	public VerticalLayout layout;
	base_de_datos.Usuario_General general;
	
	private int mensajesPorPagina = 2;
	private int numeroTotalRegistros = 0;
	private int numeroTotalPaginas = 0;
	int paginaActual = 0;
	
	public Mensajes_recibidos(base_de_datos.Usuario_General general, Ver_bandeja_de_entrada vb) {
		this.getBoton_pagina_anterior().setEnabled(false);

		this.getPaginaActual().setText("" + 0);
		this.getTotalPaginas().setText(""  + 0);
		
		this.general = general;
		this._ver_bandeja_de_entrada = vb;
		inicializar(this.paginaActual);
	}
	
	public void inicializar(int paginaActual) {
		
		this.getSpan().setVisible(true);
		this.getPaginaActual().setVisible(true);
		this.getNumero_de_pagina().setVisible(true);
		this.getBoton_pagina_anterior().setVisible(true);
		this.getBoton_pagina_siguiente().setVisible(true);
		this.getTotalPaginas().setVisible(true);
		
		this._list_Mensaje_recibido = new Vector<Mensaje_recibido>();
		this.layout = this.getHueco_mensajes_recibidos().as(VerticalLayout.class);
		this.layout.removeAll();
		
		numeroTotalRegistros = 0;
		numeroTotalPaginas = 0;
		
		abrir_Crear_Mensaje();
		this.Ver_mensajes_anteriores();
		this.Ver_mensajes_siguientes();
		verMensajesRecibidos();
	}
	
	public void add_mensaje_recibido(base_de_datos.Mensaje mensaje) {
		Mensaje_recibido mr = new Mensaje_recibido(general,mensaje,this);
		boolean encontrado = false;
		
		for(int i=0; i<this._list_Mensaje_recibido.size(); i++) {
			if(this._list_Mensaje_recibido.get(i).mensaje.getId_Mensaje() == mensaje.getId_Mensaje()) {
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			this._list_Mensaje_recibido.add(mr);
			this.numeroTotalRegistros++;
		}
		
		this.mostrar_Mensajes_Paginados();
	}
	
	public void mostrar_Mensajes_Paginados()
	{
		this.layout.removeAll();
		
		if(numeroTotalRegistros % mensajesPorPagina == 0) {
			numeroTotalPaginas = numeroTotalRegistros/mensajesPorPagina;
		} else {
			numeroTotalPaginas = (int)Math.round(((numeroTotalRegistros+1)/mensajesPorPagina));
		}
		
		this.getPaginaActual().setText("" + (paginaActual + 1));
		this.getTotalPaginas().setText(""  + numeroTotalPaginas);
		
		for(int i=(paginaActual*mensajesPorPagina); i<this._list_Mensaje_recibido.size(); i++) {
			if(i>paginaActual*mensajesPorPagina + mensajesPorPagina-1) break;
			layout.add(this._list_Mensaje_recibido.get(i));
		}
	}
	
	
	public void limpiar_interfaz() {
		this.getBoton_crear_mensaje().setVisible(false);
		this.getBoton_pagina_anterior().setVisible(false);
		this.getBoton_pagina_siguiente().setVisible(false);
		this.getNumero_de_pagina().setVisible(false);
		
		this.getPaginaActual().setVisible(false);
		this.getTotalPaginas().setVisible(false);
		this.getSpan().setVisible(false);
	}
	
	public void abrir_Crear_Mensaje() {
		this.getBoton_crear_mensaje().addClickListener(event ->{
			limpiar_interfaz();
			this._crear_mensaje = new Crear_mensaje(this.general, this);
			this._ver_bandeja_de_entrada.limpiar_interfaz();
			this.layout.removeAll();
			this._ver_bandeja_de_entrada.layout.add(this._crear_mensaje);
		});
	}
	
	public void verMensajesRecibidos() {
		base_de_datos.Mensaje mensajes[] = null;
		
		if(this.general instanceof base_de_datos.Administrador) {
			basededatos.iAdministrador iadmin = new BDPrincipal();
			try {
				mensajes = iadmin.cargarMensajesRecibidos(this.general);		
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
				
		if(this.general instanceof base_de_datos.UR) {
			basededatos.iUR ur = new BDPrincipal();
			try {
				mensajes = ur.cargarMensajesRecibidos(this.general);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		}
		
		if(mensajes != null & mensajes.length > 0 ) {
			for(base_de_datos.Mensaje m : mensajes) {
				this.add_mensaje_recibido(m);
			}
		}  else {
			H1 aviso = new H1();
			aviso.setText("No ha recibido ningun mensaje.");
			this.getHueco_mensajes_recibidos().as(VerticalLayout.class).add(aviso);
			
			this.getSpan().setVisible(false);
			this.getPaginaActual().setVisible(false);
			this.getTotalPaginas().setVisible(false);
			this.getNumero_de_pagina().setVisible(false);
			this.getBoton_pagina_anterior().setVisible(false);
			this.getBoton_pagina_siguiente().setVisible(false);
		}

	}
	
	public void Ver_mensajes_anteriores() {
		
		if(this.getBoton_pagina_anterior().isEnabled()) {
			this.getBoton_pagina_anterior().addClickListener(event ->{

				if(paginaActual > 0) {
					this.paginaActual--;
				}
				
				if(this.paginaActual == 0) {
					this.getBoton_pagina_anterior().setEnabled(false);
				}
				
				this.getBoton_pagina_siguiente().setEnabled(true);
				this.inicializar(paginaActual);
			});
		}

	}

	public void Ver_mensajes_siguientes() {
		
		if(this.getBoton_pagina_siguiente().isEnabled()) {
			this.getBoton_pagina_siguiente().addClickListener(event ->{
				if((paginaActual + 1) < numeroTotalPaginas) {
					this.paginaActual++;
				}
				
				this.getBoton_pagina_anterior().setEnabled(true);
				
				if(this.paginaActual + 1 == numeroTotalPaginas) {
					this.getBoton_pagina_siguiente().setEnabled(false);
				}
				
				this.inicializar(paginaActual);	
			});
		}

	}
}
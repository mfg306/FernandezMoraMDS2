package interfaz;

import java.util.Vector;

import org.orm.PersistentException;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dialog.Dialog;
import base_de_datos.Producto;
import basededatos.BDPrincipal;
import basededatos.iUR;
import vistas.VistaIntroducir_datos_compra;

public class Introducir_datos_compra extends VistaIntroducir_datos_compra {

	public Ver_carrito_UR _ver_carrito_UR;
	public Recibir_cargo _recibir_cargo;
	public Gestor_Banco _unnamed_Gestor_Banco_;

	public Introducir_datos_compra(Ver_carrito_UR cur) {
		inicializar(cur);
	}

	public void inicializar(Ver_carrito_UR cur) {
		this._ver_carrito_UR = cur;
		realizarCompra();
	}

	public void realizarCompra() {
		this.getBoton_continuar().addClickListener(event -> {
			iUR iur = new BDPrincipal();
			
			try {
				Producto[] lista = new Producto[this._ver_carrito_UR._menu_UR._uR.listaAux.size()];
				int[] numUnidades = new int[lista.length];

				for (int i = 0; i < lista.length; i++) {
					lista[i] = this._ver_carrito_UR._menu_UR._uR.listaAux.get(i).producto;
					numUnidades[i] = this._ver_carrito_UR._menu_UR._uR.listaAux.get(i).cantidad;
				}

				iur.realizarCompra(lista, this._ver_carrito_UR._menu_UR._uR.UR, numUnidades);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				iur.actualizarDatosCompra(this.getDireccion_envio().getValue(), this.getMetodo_pago().getValue(),
						this._ver_carrito_UR._menu_UR._uR.UR);
			} catch (PersistentException e) {
				e.printStackTrace();
			}

			Dialog dialog = new Dialog();
			dialog.add(new Text("Compra realizada con éxito."));

			dialog.setWidth("400px");
			dialog.setHeight("150px");

			dialog.open();
			
			this._ver_carrito_UR._menu_UR._uR.actualizarMiListado(new Vector<Producto_carrito>());
			this._ver_carrito_UR.layout.remove(this);
			this._ver_carrito_UR.inicializar();
			this._ver_carrito_UR.getVaadinHorizontalLayout().setVisible(true);
			
		});
	}

	public void Recibir_cargo() {
		throw new UnsupportedOperationException();
	}
}
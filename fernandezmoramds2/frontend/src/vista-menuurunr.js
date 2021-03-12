import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import './vista-buscador.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaMenu_urunr extends PolymerElement {

     static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="justify-content: center; align-items: center;" id="menu">
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; align-self: center;" id="vaadinHorizontalLayout">
  <img style="width: 100%;" id="logo_tienda">
  <vaadin-select value="Item one" id="clasificar_categoria">
   <vaadin-list-box selected="0" id="vaadinListBox">
    <vaadin-item selected id="vaadinItem">
      Categoría 1 
    </vaadin-item>
    <vaadin-item id="vaadinItem1">
      Categoría 2 
    </vaadin-item>
    <vaadin-item id="vaadinItem2">
      Categoría 3 
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-select>
  <vista-buscador style="width: 100%;" id="buscador_productos"></vista-buscador>
  <vaadin-select value="Item one" id="datos_cuenta">
   <vaadin-list-box selected="0" id="vaadinListBox1">
    <vaadin-item selected id="vaadinItem3">
      Mi Perfil 
    </vaadin-item>
    <vaadin-item id="vaadinItem4">
      Mis pedidos 
    </vaadin-item>
    <vaadin-item id="vaadinItem5">
      Mis correos 
    </vaadin-item>
    <vaadin-item id="vaadinItem6">
      Configuración de perfil 
    </vaadin-item>
    <vaadin-item id="vaadinItem7">
      Cerrar sesión 
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-select>
  <vaadin-button theme="primary" id="boton_iniciar_sesion">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-button theme="primary" id="boton_carrito">
    Carrito 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-menuurunr';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMenu_urunr.is, VistaMenu_urunr);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-buscador.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaMenu_urunr extends PolymerElement {

     static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="justify-content: center; align-items: center;" id="menu">
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; align-self: center;" id="vaadinHorizontalLayout">
  <img style="width: 100%;" id="logo_tienda">
  <vaadin-horizontal-layout theme="spacing" id="seleccionarCategoria"></vaadin-horizontal-layout>
  <vista-buscador style="width: 100%;" id="buscador_productos"></vista-buscador>
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

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto_carrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; padding: 0; margin: 0;">
 <img id="img" style="align-self: center; width:  15vw; height: 15vw;">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="align-items: center; width: 100%; align-self: center; justify-content: center; padding: var(--lumo-space-m);">
  <span id="nombreProducto" style="align-self: center; flex-grow: 1; text-align: center; "></span>
  <span id="precioProducto" style="align-self: center; flex-grow: 1; text-align: center; "></span>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-button style="background-color: red; color: white; align-self: center;" id="vaadinButton">
    Eliminar 
  </vaadin-button>
  <vaadin-checkbox id="checkEliminar" style="align-self: center; flex-grow: 0;"></vaadin-checkbox>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productocarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_carrito.is, VistaProducto_carrito);

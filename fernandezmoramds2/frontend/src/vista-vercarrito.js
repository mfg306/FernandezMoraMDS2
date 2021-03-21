import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-menuurunr.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVer_carrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout1">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" id="productosCarrito"></vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-self: center;" id="vaadinVerticalLayout">
   <span style="align-self: center;" id="span">Precio total de la compra:</span>
   <span style="align-self: center;" id="span1">Precio $$</span>
   <vaadin-button theme="primary" style="align-self: center;" id="vaadinButton">
     Comprar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVer_carrito.is, VistaVer_carrito);

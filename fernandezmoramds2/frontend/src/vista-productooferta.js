import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto_oferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <img style="width: 100%; height: 100%;" id="imagen_producto">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <span style="width: 100%; align-self: center;" id="nombre_producto">Nombre Producto</span>
  <vaadin-vertical-layout theme="spacing" style="align-items: flex-end; width: 100%;" id="vaadinVerticalLayout1">
   <span id="precio_original" style="text-decoration:line-through"></span>
   <span style="color: red;" id="precio_rebajado"></span>
   <vaadin-button id="botonProductoOferta" style="color: #ae1641;">
     Ver producto 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productooferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_oferta.is, VistaProducto_oferta);

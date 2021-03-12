import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProducto_categoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <img style="width: 100%; height: 100%;" id="imagen_producto">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
  <span style="align-self: center;" id="nombre_producto">Nombre Producto</span>
  <span id="precio_producto">Precio</span>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productocategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_categoria.is, VistaProducto_categoria);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-productosadministrador.js';

class VistaGestionar_productos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Mis productos</h1>
 <vaadin-button theme="primary" style="margin: var(--lumo-space-l);" id="vaadinButton">
   Nuevo producto 
 </vaadin-button>
 <vista-productosadministrador id="vistaProductosadministrador"></vista-productosadministrador>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-gestionarproductos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionar_productos.is, VistaGestionar_productos);

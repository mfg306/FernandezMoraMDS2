import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProducto_mas_vendido_por_categorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="align-items: center;" id="vaadinVerticalLayout">
 <img style="width: 100%; height: 100%;" id="imagen_producto">
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productomasvendidoporcategorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_mas_vendido_por_categorias.is, VistaProducto_mas_vendido_por_categorias);

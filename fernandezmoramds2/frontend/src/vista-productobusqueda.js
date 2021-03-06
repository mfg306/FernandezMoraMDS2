import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProducto_busqueda extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-m); border-right: 1px solid #ECEDEE;" id="vaadinVerticalLayout">
 <img id="imagen_producto">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout">
  <span style="align-self: center; width: 100%;" id="nombre_producto"></span>
  <span style="flex-grow: 0; align-self: flex-end; flex-shrink: 1; width: 100%;" id="precio_producto"></span>
  <span id="precio_rebajado" style="flex-grow: 0; align-self: flex-end; flex-shrink: 1; width: 100%;color: red;"></span>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productobusqueda';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_busqueda.is, VistaProducto_busqueda);

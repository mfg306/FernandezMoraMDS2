import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';


class VistaProductos_listado_administracion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout_productos_listado_administracion"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productoslistadoadministracion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos_listado_administracion.is, VistaProductos_listado_administracion);

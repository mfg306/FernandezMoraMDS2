import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-pedidose.js';

class VistaEncargado_de_compras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-l); align-self: flex-end;" id="vaadinHorizontalLayout">
  <vaadin-button theme="primary" id="vaadinButton">
    Cerrar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <h1 style="margin-left: 10%;" id="h1">Compras realizadas</h1>
 <vista-pedidose id="vistaPedidose"></vista-pedidose>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-encargadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargado_de_compras.is, VistaEncargado_de_compras);

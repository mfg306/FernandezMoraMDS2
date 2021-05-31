import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaTransportista extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout-transportista">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout-transportista">
  <vaadin-button theme="primary" id="vaadinButton-transportista" style="align-self: center;  background-color: #7800ff;">
    Cerrar sesion 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <h1 style="align-self: center;" id="h1-transportista">Lista pedidos</h1>
 <vaadin-vertical-layout theme="spacing" id="huecoListaPedidos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 <h3 style="align-self: center; padding: var(--lumo-space-s); background-color: #7800ff;; border-radius: 15px; color: white;" id="h3-transportista">Nombre empresa</h3>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportista.is, VistaTransportista);

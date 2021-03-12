import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVer_ficha_cliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout style="width: 80%; background-color:#D0D1D1; flex-direction: column; align-items: flex-start; margin-top: 25%;" id="vaadinVerticalLayout1">
  <vaadin-button theme="primary" style="align-self: flex-end; margin-right: var(--lumo-space-s);" id="vaadinButton">
    Cerrar 
  </vaadin-button>
  <h3 style="align-self: center;" id="h3">Código cliente</h3>
  <label style="padding: var(--lumo-space-m);" id="label">Nombre</label>
  <label style="padding: var(--lumo-space-m);" id="label1">Apellidos</label>
  <label style="padding: var(--lumo-space-m);" id="label2">Dirección</label>
  <label style="padding: var(--lumo-space-m);" id="label3">Correo electrónico</label>
  <label style="padding: var(--lumo-space-m);" id="label4">Modo de pago</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verfichacliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVer_ficha_cliente.is, VistaVer_ficha_cliente);

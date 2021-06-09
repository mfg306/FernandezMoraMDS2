import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaVer_ficha_cliente extends PolymerElement {

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
 <vaadin-vertical-layout style="background-color:#F1F2F2; flex-direction: column;  width: 100%; align-items: flex-start;" id="vaadinVerticalLayout1">
  <vaadin-button id="vaadinButton" style="background-color: red;">
   <iron-icon id="ironIcon" icon="lumo:cross"></iron-icon>
  </vaadin-button>
  <h3 style="align-self: center;" id="h3"></h3>
  <label style="padding: var(--lumo-space-m);" id="label"></label>
  <label style="padding: var(--lumo-space-m);" id="label1"></label>
  <label style="padding: var(--lumo-space-m);" id="label2"></label>
  <label style="padding: var(--lumo-space-m);" id="label3"></label>
  <label style="padding: var(--lumo-space-m);" id="label4"></label>
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

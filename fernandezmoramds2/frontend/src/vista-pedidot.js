import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaPedido_t extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 95%; background-color: #F1F2F2; margin-top: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout1">
   <label style="margin: var(--lumo-space-m);" id="label">Codigo pedido</label>
   <label style="margin: var(--lumo-space-m);" id="label1">Direccion</label>
   <label style="margin: var(--lumo-space-m);" id="label2">Fecha pedido</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
   <vaadin-button id="vaadinButton1" style="align-self: center; flex-grow: 0; background-color: #ae1641;" theme="primary">
     Marcar como enviado 
    <iron-icon icon="lumo:bell" style="vertical-align: top;" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="primary" style="align-self: center; flex-grow: 0; margin-top: 50%; background-color: #ae1641;" id="vaadinButton">
     Ver ficha 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidot';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedido_t.is, VistaPedido_t);

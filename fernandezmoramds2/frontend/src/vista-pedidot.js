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
<vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; border-bottom: 1px solid #ECEDEE;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 95%; background-color: white; margin-top: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout1">
   <label style="margin: var(--lumo-space-m);" id="label"></label>
   <label style="margin: var(--lumo-space-m);" id="label1"></label>
   <label style="margin: var(--lumo-space-m);" id="label2"></label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
   <vaadin-button id="vaadinButton1" style="align-self: center;  background-color: #7800ff;" theme="primary">
    Enviado
    <iron-icon icon="lumo:bell" style="vertical-align: top;" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="vaadinButton">
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

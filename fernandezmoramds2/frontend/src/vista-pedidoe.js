import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedido_e extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-l);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; background-color: #F1F2F2; padding: var(--lumo-space-l); align-self: center; width: 100%;" id="vaadinHorizontalLayout">
   <label style="align-self: center; flex-shrink: 0; margin-left: 15%;" id="label1">Codigo de la compra:</label>
   <label style="align-self: center; margin-left: 10%;" id="label2">Fecha:</label>
   <label id="numTotalUnidades" style="align-self: center; margin-left: 10%;">N</label>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; width: 100%; margin-left: 5%;" id="vaadinHorizontalLayout1">
    <vaadin-button theme="primary" id="botonAsignar" style="align-self: center;  background-color: #7800ff;">
      Asignar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidoe';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedido_e.is, VistaPedido_e);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout id="pedido">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center;" id="vaadinHorizontalLayout">
  <span id="codigo"></span>
  <span style="align-self: center;" id="estado_pedido"></span>
  <span></span>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;" id="vaadinVerticalLayout">
   <span>Span</span>
   <vaadin-button theme="primary" style="align-self: center; background-color: #ae1641;" id="boton_cancelar_pedido">
     Cancelar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedido.is, VistaPedido);

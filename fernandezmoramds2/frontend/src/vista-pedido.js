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
<vaadin-vertical-layout id="pedido" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center;" id="vaadinHorizontalLayout">
  <span id="codigo" style="width: 100%;"></span>
  <span style="align-self: center; width: 100%;" id="estado_pedido"></span>
  <span id="precio" style="width: 100%;"></span>
  <span id="fecha" style="width: 100%;"></span>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;" id="vaadinVerticalLayout">
   <vaadin-button theme="primary" style="align-self: center;  background-color: red;" id="boton_cancelar_pedido">
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

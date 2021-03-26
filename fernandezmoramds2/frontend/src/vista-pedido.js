import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';

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
  <img style="width: 100%; height: 100%;" id="imagen_pedido">
  <vaadin-list-box style="width: 100%; align-self: center;" id="caracteristicas_pedido">
   <vaadin-item id="vaadinItem1">
     Item one 
   </vaadin-item>
   <vaadin-item id="vaadinItem">
     Item two 
   </vaadin-item>
   <hr id="hr">
   <vaadin-item id="vaadinItem3">
     Item three 
   </vaadin-item>
   <vaadin-item id="vaadinItem2">
     Item four 
   </vaadin-item>
  </vaadin-list-box>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;" id="vaadinVerticalLayout">
   <span style="align-self: center;" id="estado_pedido">Estado</span>
   <vaadin-button theme="primary" style="align-self: center;" id="boton_cancelar_pedido">
     Cancelar 
   </vaadin-button>
   <span style="align-self: center;" id="span">Valora tu pedido:</span>
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

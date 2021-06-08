import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-menuurunr.js';

class VistaVer_pedidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="menu">
 <div style="margin-top: var(--lumo-space-xl);  align-self: center; width: 100%; text-align: center;" id="div">
  <span style="font-size: 4vw; font-weight: bold;  text-align: center;" id="span">MIS PEDIDOS</span>
  <vaadin-vertical-layout theme="spacing" id="lista_pedidos" style="background-color: white; width: 100%; height: 100%;"></vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verpedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVer_pedidos.is, VistaVer_pedidos);

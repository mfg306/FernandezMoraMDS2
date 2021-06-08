import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaMensaje_recibido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; background-color: white; border-bottom: 1px solid #ECEDEE;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-s); align-items: center;" id="vaadinHorizontalLayout">
  <img id="fotoCorreo" style="width: 5vw; height: 5vw; border-radius: 100%;">
  <span id="asunto" style="font-weight: bold; width: 100%;"></span>
  <span style="flex-grow: 0; flex-shrink: 0;" id="span"></span>
  <span style="width: 100%; flex-grow: 0; flex-shrink: 1; align-self: center;" id="span1"></span>
  <span id="span2" style="width: 100%; align-self: center;"></span>
  <vaadin-button theme="primary" id="responder" style="align-self: center; background-color: #7800ff; width: 100%;">
    Responder 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajerecibido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensaje_recibido.is, VistaMensaje_recibido);

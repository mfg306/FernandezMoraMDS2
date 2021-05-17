import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaCrear_mensaje extends PolymerElement {

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
 <span style="font-size: 4vw; font-weight: bold; align-self: center; text-align: center; margin-top: var(--lumo-space-xl);" id="span">BANDEJA DE ENTRADA</span>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; height: 100%; align-self: center;" id="vaadinVerticalLayout1">
  <vaadin-text-field id="asunto" style="width: 100%;" placeholder="Introduzca un asunto"></vaadin-text-field>
  <vaadin-horizontal-layout id="huecoSelect" style="width: 100%;"></vaadin-horizontal-layout>
  <vaadin-text-field id="mensaje" style="width: 100%; height: 100%;" placeholder="Introduzca su mensaje"></vaadin-text-field>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" style="justify-content: space-around; width: 100%; align-items: center; flex-direction: row;" id="vaadinHorizontalLayout1">
 <vaadin-button id="boton_atras" style="align-self: center; color: #ae1641;">
  Volver atras
 </vaadin-button>
 <vaadin-button theme="primary" id="boton_enviar" style="align-self: center; background-color: #ae1641;">
   Enviar mensaje 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-crearmensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrear_mensaje.is, VistaCrear_mensaje);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRecuperar_contrasenia extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <div style="width: 80%; height: 100%; align-self: center;" id="div">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; height: 100%;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; " id="span">RECUPERA TU CONTRASEÑA</span>
   <vaadin-text-field placeholder="Introduzca su correo electrónico" style="width: 100%;" id="correo"></vaadin-text-field>
   <vaadin-button theme="primary" id="boton_enviar_correo" style="background-color: #ae1641;">
     Enviar correo 
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-recuperarcontrasenia';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRecuperar_contrasenia.is, VistaRecuperar_contrasenia);

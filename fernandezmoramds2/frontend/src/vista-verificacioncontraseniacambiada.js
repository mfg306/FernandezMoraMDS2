import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-menuurunr.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerificacion_contrasenia_cambiada extends PolymerElement {

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
 <span style="font-size: 4vw; font-weight: bold; align-self: center; height: 100%; width: 100%; text-align: center; margin-top: var(--lumo-space-xl);" id="span">Su contrasena se ha modificado con exito</span>
 <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="boton_aceptar">
   Aceptar 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verificacioncontraseniacambiada';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerificacion_contrasenia_cambiada.is, VistaVerificacion_contrasenia_cambiada);

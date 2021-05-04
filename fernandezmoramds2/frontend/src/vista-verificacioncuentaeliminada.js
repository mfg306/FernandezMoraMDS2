import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVerificacion_cuenta_eliminada extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayout">
 <span style="align-self: center;" id="span">¡Su cuenta ha sido eliminada con éxito! </span>
 <vaadin-button theme="primary" style="align-self: center; background-color: #ae1641;" id="boton_volver">
   Volver a la pantalla de inicio 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verificacioncuentaeliminada';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerificacion_cuenta_eliminada.is, VistaVerificacion_cuenta_eliminada);

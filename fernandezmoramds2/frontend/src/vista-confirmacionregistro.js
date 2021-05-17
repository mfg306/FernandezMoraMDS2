import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaConfirmacion_registro extends PolymerElement {

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
 <div style="align-self: center; width: 80%; height: 80%; flex-grow: 0; margin: var(--lumo-space-xl); background-color: #F5F5F5; " id="div">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; flex-direction: column; width: 100%; height: 100%;" id="panel_confirmacion_registro">
   <span id="span">¡Su registro ha sido realizado con exito!</span>
   <vaadin-button theme="primary" id="boton_iniciar_sesion" style="background-color: #ae1641;">
    Iniciar sesion
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-confirmacionregistro';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaConfirmacion_registro.is, VistaConfirmacion_registro);

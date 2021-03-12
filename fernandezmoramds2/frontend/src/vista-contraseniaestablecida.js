import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaContrasenia_establecida extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <div style="width: 80%; height: 100%; align-self: center;" id="div">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; height: 100%;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span">NUEVA CONTRASEÑA ESTABLECIDA</span>
   <vaadin-button theme="primary" id="boton_iniciar_sesion">
     Iniciar sesión 
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-contraseniaestablecida';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaContrasenia_establecida.is, VistaContrasenia_establecida);

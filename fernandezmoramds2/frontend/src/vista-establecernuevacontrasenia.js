import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEstablecer_nueva_contrasenia extends PolymerElement {

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
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span">RECUPERA TU CONTRASENA</span>
   <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; border-radius: 0; padding-bottom: 0; width: 100%;" placeholder="Introduzca su nueva contrasena" id="nueva_contrasenia"></vaadin-text-field>
   <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; border-radius: 0; padding-bottom: 0; width: 100%;" placeholder="Confirme su nueva contrasena" id="confirmacion_nueva_contrasenia"></vaadin-text-field>
   <vaadin-button theme="primary" id="boton_continuar" style="align-self: center;  background-color: #7800ff;">
     Continuar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-establecernuevacontrasenia';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEstablecer_nueva_contrasenia.is, VistaEstablecer_nueva_contrasenia);

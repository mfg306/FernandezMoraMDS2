import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCambiar_contrasenia extends PolymerElement {

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
 <div style="width: 80%; height: 100%; align-self: center; margin-top: var(--lumo-space-xl);" id="div">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; text-align:center; width: 100%;" id="titulo_cambiar_contrasenia">Cambiar contrasena</span>
   <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; margin: 0; padding: 0; border-radius: 0; width: 100%;" placeholder="Contrasena actual" id="contrasenia_actual"></vaadin-text-field>
   <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; padding: 0; border-radius: 0; width: 100%;" placeholder="Nueva contrasena" id="nueva_contrasenia"></vaadin-text-field>
   <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; padding: 0; border-radius: 0; width: 100%;" placeholder="Confirmacion nueva contrasena" id="confirmacion_nueva_contrasenia"></vaadin-text-field>
   <vaadin-button theme="primary" id="boton_guardar" style="align-self: center; background-color: #7800ff;">
     Guardar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cambiarcontrasenia';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCambiar_contrasenia.is, VistaCambiar_contrasenia);

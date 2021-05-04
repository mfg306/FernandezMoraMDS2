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
   <span style="font-size: 4vw; font-weight: bold;  text-align:center;" id="titulo_cambiar_contrasenia">Cambiar contraseña</span>
   <vaadin-text-field style="width: 100%;" placeholder="Contraseña actual" id="contrasenia_actual"></vaadin-text-field>
   <vaadin-text-field style="width: 100%;" placeholder="Nueva contraseña" id="nueva_contrasenia"></vaadin-text-field>
   <vaadin-text-field style="width: 100%;" placeholder="Confirmación nueva contraseña" id="confirmacion_nueva_contrasenia"></vaadin-text-field>
   <vaadin-button theme="primary" id="boton_guardar" style="background-color: #ae1641;">
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

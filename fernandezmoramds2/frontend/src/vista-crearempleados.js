import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCrear_empleados extends PolymerElement {

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
 <h1 style="align-self: center;" id="h1">Crear empleado</h1>
 <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey;  border-radius: 0; padding-bottom: 0;" label="Introduzca un correo:" id="introduzcaUnCorreo" autofocus></vaadin-text-field>
 <vaadin-text-field style="align-self: center; border-bottom: 2px solid grey; border-radius: 0; padding-bottom: 0;" label="Introduzca una contrasena:" id="introduzcaUnaContraseña"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
  <vaadin-checkbox id="vaadinCheckbox" style="align-self: center;">
    Transportista 
  </vaadin-checkbox>
  <vaadin-checkbox id="vaadinCheckbox1" style="align-self: center;">
    Encargado 
  </vaadin-checkbox>
 </vaadin-horizontal-layout>
 <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="vaadinButton">
   Crear 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crearempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrear_empleados.is, VistaCrear_empleados);

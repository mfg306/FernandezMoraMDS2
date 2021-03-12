import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEditar_empleado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Editar empleado</h1>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; padding: 10%; align-self: center; background-color: #F1F2F2; " id="vaadinVerticalLayout1">
  <vaadin-text-field style="align-self: center; width: 50%;" placeholder="Introducir nuevo correo" id="vaadinTextField1"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 50%;" placeholder="Introducir nueva contraseña" id="vaadinTextField"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
   <vaadin-button theme="primary" id="vaadinButton">
     Guardar 
   </vaadin-button>
   <vaadin-button theme="primary" id="vaadinButton1">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editarempleado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditar_empleado.is, VistaEditar_empleado);

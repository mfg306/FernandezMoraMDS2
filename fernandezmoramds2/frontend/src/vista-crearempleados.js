import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCrear_empleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Crear empleado</h1>
 <vaadin-text-field style="align-self: center;" label="Introduzca un correo:" id="introduzcaUnCorreo"></vaadin-text-field>
 <vaadin-text-field style="align-self: center; margin: var(--lumo-space-m);" label="Introduzca una contraseña:" id="introduzcaUnaContraseña"></vaadin-text-field>
 <vaadin-button theme="primary" style="align-self: center;" id="vaadinButton">
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

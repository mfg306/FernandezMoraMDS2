import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-crearempleados.js';
import './vista-empleados.js';

class VistaGestionar_empleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vista-crear_empleados id="crearEmpleado"></vista-crear_empleados>
 <h1 id="h1">Empleados</h1>
 <vista-empleados id="vistaEmpleados"></vista-empleados>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-gestionarempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionar_empleados.is, VistaGestionar_empleados);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaGestionar_empleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="huecoCrearEmpleados" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 <h1 id="h1">Empleados</h1>
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

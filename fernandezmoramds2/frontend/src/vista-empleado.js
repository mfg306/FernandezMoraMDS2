import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEmpleado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-l); border-bottom: 1px solid #ECEDEE;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 100%; background-color: white; align-self: center; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout">
  <label style="align-self: center;" id="label"></label>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; width: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-button theme="primary" id="vaadinButton" style="background-color: #7800ff;">
     Editar 
   </vaadin-button>
   <vaadin-button theme="primary" id="vaadinButton1" style="background-color: red;">
     Eliminar 
   </vaadin-button>
   <span id="tipoEmpleado" style="align-self: center;"></span>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empleado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpleado.is, VistaEmpleado);

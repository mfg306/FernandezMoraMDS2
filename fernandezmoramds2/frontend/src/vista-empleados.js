import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaEmpleados extends PolymerElement {

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
 <vaadin-vertical-layout theme="spacing" id="huecoEmpleados" style="width: 100%; align-self: center; align-items: center; justify-content: center;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-button theme="primary" id="botonAnteriores" style="background-color: grey; color: white;">
    Anterior 
  </vaadin-button>
  <span>Pagina</span>
  <span id="paginaActual"></span>
  <span id="de">de</span>
  <span id="totalPaginas"></span>
  <vaadin-button theme="primary" id="botonSiguientes" style="background-color: grey; color: white;">
    Siguiente 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpleados.is, VistaEmpleados);

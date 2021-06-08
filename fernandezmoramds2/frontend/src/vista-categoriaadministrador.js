import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaCategoria_administrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="background-color: white; justify-content: center; border-bottom: 1px solid #ECEDEE;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: stretch; justify-content: center; align-items: center;" id="vaadinHorizontalLayout">
  <h1 style="align-self: center; margin-left: var(--lumo-space-l);" id="h1"></h1>
  <vaadin-button theme="primary" id="vaadinButton" style="background-color: #7800ff; align-self: center;">
    Editar 
  </vaadin-button>
  <vaadin-button theme="primary" id="vaadinButton1" style="background-color: red; align-self: center;">
    Eliminar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categoriaadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoria_administrador.is, VistaCategoria_administrador);

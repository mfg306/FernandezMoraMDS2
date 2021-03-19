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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; flex-grow: 0; margin-top: var(--lumo-space-l);background-color: #F1F2F2;" id="vaadinHorizontalLayout">
  <h1 style="align-self: center; margin-left: var(--lumo-space-l);" id="h1">Nombre categoria</h1>
  <vaadin-button theme="primary" style="align-self: center; margin-left: 35%;" id="vaadinButton">
    Editar 
  </vaadin-button>
  <vaadin-button theme="primary" style="align-self: center;" id="vaadinButton1">
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

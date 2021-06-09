import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaOferta_administrador extends PolymerElement {

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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; align-self: stretch; justify-content: center; align-items: center;">
  <label style="margin: var(--lumo-space-l); align-self: center;" id="label"></label>
  <h3 id="h3"></h3>
  <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="vaadinButton">
    Editar 
  </vaadin-button>
  <vaadin-button theme="primary" style="align-self: center; background-color: red;" id="vaadinButton1">
    Eliminar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ofertaadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta_administrador.is, VistaOferta_administrador);

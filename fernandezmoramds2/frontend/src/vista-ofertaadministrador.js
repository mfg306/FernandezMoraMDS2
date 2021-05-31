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
<vaadin-vertical-layout style="align-items: center; background-color: #F1F2F2; justify-content: center;" id="vaadinVerticalLayout">
 <h1 id="h1" style="width: 50%; align-self: center;">Nombre oferta</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; margin-top: var(--lumo-space-l); flex-shrink: 0; align-items: center; align-self: stretch; justify-content: center;" id="vaadinHorizontalLayout">
  <label style="margin: var(--lumo-space-l); width: 100%;" id="label">Codigo oferta</label>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="justify-content: flex-end; width: 100%;">
   <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="vaadinButton">
     Editar 
   </vaadin-button>
   <vaadin-button theme="primary" style="align-self: center;  background-color: red;" id="vaadinButton1">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
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

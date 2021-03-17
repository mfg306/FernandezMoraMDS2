import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaOferta_administrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center; background-color: #F1F2F2; justify-content: center;" id="vaadinVerticalLayout">
 <h1 id="h1" style="width: 50%; align-self: center;">Nombre oferta</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1; margin-top: var(--lumo-space-l); flex-shrink: 0; align-items: center; align-self: stretch; justify-content: center;" id="vaadinHorizontalLayout">
  <label style="margin: var(--lumo-space-l);" id="label">Código oferta</label>
  <vaadin-button theme="primary" style="margin-left: var(--lumo-space-m);" id="vaadinButton1">
    Eliminar 
  </vaadin-button>
  <vaadin-button theme="primary" style="margin-left: 40%;" id="vaadinButton">
    Editar 
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

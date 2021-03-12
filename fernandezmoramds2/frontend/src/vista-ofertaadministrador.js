import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaOferta_administrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 80%; background-color: #F1F2F2; flex-grow: 0; margin-top: var(--lumo-space-m);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; margin-top: var(--lumo-space-l); background-color: #F1F2F2; align-self: center;" id="vaadinHorizontalLayout">
   <h1 style="margin-left: var(--lumo-space-l); flex-grow: 1; flex-shrink: 0;" id="h1">Nombre oferta 
    <vaadin-button theme="primary" style="margin-left: 40%;" id="vaadinButton">
      Editar 
    </vaadin-button>
    <vaadin-button theme="primary" style="margin-left: var(--lumo-space-m);" id="vaadinButton1">
      Eliminar 
    </vaadin-button></h1>
  </vaadin-horizontal-layout>
  <label style="margin: var(--lumo-space-l);" id="label">Código oferta</label>
 </vaadin-vertical-layout>
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

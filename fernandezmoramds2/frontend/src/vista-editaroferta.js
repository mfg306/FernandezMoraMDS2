import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import './vista-zonaproductos.js';

class VistaEditar_oferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="verticalLayout_editar_Oferta">
 <h1 id="h1_editar_Oferta" style="align-self: center;">Mis ofertas</h1>
 <h2 id="h2_editar_Oferta" style="align-self: center;">Editar oferta</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout_editar_Oferta">
  <label style="align-self: center; margin-left: 5%;" id="label_editar_Oferta">Nombre oferta</label>
  <vaadin-text-field label="" id="text-field_editar_Oferta"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vista-zonaproductos id="vistaZonaproductos"></vista-zonaproductos>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-l); width: 100%; justify-content: center;" id="vaadinHorizontalLayout_editar_Oferta1">
  <vaadin-button theme="primary" id="vaadinButton_editar_Categoria">
    Guardar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editaroferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditar_oferta.is, VistaEditar_oferta);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-zonaproductos.js';

class VistaEditar_categoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout_editar_Categoria">
 <h1 style="align-self: center;" id="h1_editar_Categoria">Mis categorías</h1>
 <h2 style="align-self: center;" id="h2_editar_Categoria">Editar categoría</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout_Crear_Categoria">
  <label style="align-self: center; margin-left: 5%;" id="label_editar_Categoria">Nombre categoria</label>
  <vaadin-text-field id="vaadinTextField_editar_Categoria"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vista-zonaproductos id="vistaZonaproductos"></vista-zonaproductos>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-l); width: 100%; justify-content: center;" id="vaadinHorizontalLayout_editar_Categoria">
  <vaadin-button theme="primary" id="vaadinButton_editar_Categoria">
    Guardar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editarcategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditar_categoria.is, VistaEditar_categoria);

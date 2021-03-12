import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-zonaproductos.js';

class VistaCrear_categoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout_Crear_Categoria">
 <h1 id="h1_Crear_Categoria">Mis categorías</h1>
 <h2 id="h2_Crear_Categoria">Crear una nueva categoría</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout_Crear_Categoria">
  <label style="align-self: center; margin-left: 5%;" id="label_Crear_Categoria">Nombre categoria</label>
  <vaadin-text-field id="vaadinTextField_Crear_Categoria"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vista-zonaproductos id="vistaZonaproductos"></vista-zonaproductos>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-l); width: 100%;" id="vaadinHorizontalLayout1_Crear_Categoria">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout2_Crear_Categoria">
   <vaadin-button theme="primary" style="margin-left: 8.5%;" id="boton_Cancelar_Crear_Categoria">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout3_Crear_Categoria">
   <vaadin-button theme="primary" style="margin-right: 5%;" id="boton_Guardar_Crear_Categoria">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crearcategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrear_categoria.is, VistaCrear_categoria);

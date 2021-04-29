import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaAdministrar_productos_anadidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: flex-start;" id="vertical-layout_administrar_productos_anadidios">
 <vaadin-vertical-layout theme="spacing" id="layoutCrearCategoria" style="width: 100%; height: 100%; align-items: center;">
  <h1 id="h1CrearCategoria">Mis categorias</h1>
  <h2 id="h2CrearCategoria">Crear una nueva categoria</h2>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutEditarCategoria" style="width: 100%; align-items: center;">
  <h1 id="h1EditarCategoria">Mis categorias</h1>
  <h2 id="h2EditarCategoria">Editar categoría</h2>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutCrearOferta" style="width: 100%; align-items: center;">
  <h1 id="h1CrearOferta">Mis ofertas</h1>
  <h2 id="h2CrearOferta">Crear una nueva oferta</h2>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutEditarOferta" style="width: 100%; align-items: center;">
  <h1 id="h1EditarOferta">Mis ofertas</h1>
  <h2 id="h2EditarOferta">Editar oferta</h2>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="layoutNombreCategoria" style="width: 100%;">
   <label id="nombreCategoria" style="padding: var(--lumo-space-m);">Nombre categoria</label>
   <vaadin-text-field id="campoCategoria" style="align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="layoutNombreOferta" style="width: 100%;">
   <label id="nombreOferta" style="padding: var(--lumo-space-m);">Nombre oferta</label>
   <vaadin-text-field id="campoOferta" style="align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout_administrador_productos_anadidos" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout_zonaProductos" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1_zonaProductos" style="width: 100%; justify-content: center;">
    <h2 id="h2"> Seleccione los productos a:</h2>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1_productos_anadidos" style="width: 100%; align-self: flex-end;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2_productos_anadidos" style="width: 100%; justify-content: center;">
    <h2 id="h21">Añadidos:</h2>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="botonesCG" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button theme="primary" id="botonCancelar">
      Cancelar 
    </vaadin-button>
    <vaadin-button theme="primary" id="vaadinButton">
      Guardar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" id="huecoProductos" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="huecoIzquierda" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="huecoDerecha" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarproductosanadidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrar_productos_anadidos.is, VistaAdministrar_productos_anadidos);

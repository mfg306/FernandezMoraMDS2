import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-productoslistadoadministracion.js';

class VistaAdministrar_productos_anadidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: flex-start;" id="vertical-layout_administrar_productos_anadidios">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout_administrador_productos_anadidos" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout_zonaProductos" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1_zonaProductos" style="width: 100%; justify-content: center;">
    <h2 id="h2"> Seleccione los productos a:</h2>
   </vaadin-horizontal-layout>
   <vista-productos_listado id="vistaProductos_listado_zonaProductos" style="width: 100%;"></vista-productos_listado>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1_productos_anadidos" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2_productos_anadidos" style="width: 100%; justify-content: center;">
    <h2 id="h21">Añadidos:</h2>
   </vaadin-horizontal-layout>
   <vista-productoslistadoadministracion id="vistaProductoslistadoadministracion"></vista-productoslistadoadministracion>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
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

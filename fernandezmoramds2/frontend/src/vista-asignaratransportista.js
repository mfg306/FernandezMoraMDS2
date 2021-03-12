import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaAsignar_a_transportista extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vertical-layout_asignar_a_transportista">
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end;" id="horizontal-layout_asignar_a_transportista">
  <vaadin-button theme="primary" style="margin: var(--lumo-space-l);" id="cerrarSesion_asignar_a_transportista">
    Cerrar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <h1 style="margin: var(--lumo-space-l); margin-left: 10%;" id="h1-asignar_a_transportista">Compras</h1>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center; background-color: #F1F2F2; padding: var(--lumo-space-xl);" id="vertical-layout_2_asignar_a_transportista">
  <vaadin-select value="Item one" style="align-self: center; width: 60%;" placeholder="Nombre transportista" id="Seleccion-asignar_a_transportista">
   <template id="listaSeleccion-asignar_a_transportista">
    <vaadin-list-box selected="0" id="listaSeleccionarTransportista-asignar_a_transportista">
     <vaadin-item selected id="transportista-asignar_a_transportista">
       Nombre transportista 1 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-button theme="primary" style="align-self: center;" id="aceptar-asignar_a_transportista">
    Aceptar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-asignaratransportista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAsignar_a_transportista.is, VistaAsignar_a_transportista);

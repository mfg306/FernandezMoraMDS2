import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import './vista-zonaproductos.js';

class VistaCrear_oferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="verticalLayout_CrearOferta" style="width: 100%;">
 <h1 id="h1_Crear_Oferta" style="align-self: center;">Mis ofertas</h1>
 <h2 id="h2_Crear_Oferta" style="align-self: center;">Crear nueva oferta</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout_Crear_Oferta">
  <label style="align-self: center; margin-left: 5%;" id="label_Crear_Oferta">Nombre oferta</label>
  <vaadin-text-field id="vaadinTextField_Crear_Oferta" style="align-self: center;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vista-zonaproductos id="vistaZonaproductos"></vista-zonaproductos>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-l); width: 100%;" id="vaadinHorizontalLayout1_Crear_Oferta">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout2_Crear_Oferta">
   <vaadin-button theme="primary" style="margin-left: 8.5%;" id="boton_Cancelar_Crear_Oferta">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout3_Crear_Oferta">
   <vaadin-button theme="primary" style="margin-right: 5%;" id="boton_Guardar_Crear_Oferta">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crearoferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrear_oferta.is, VistaCrear_oferta);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto_listado_administracion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 90%; align-items: center; margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); border-bottom: 1px solid #ECEDEE;" id="verticalLayout_producto_listado_administracion">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background-color: white; padding: var(--lumo-space-s); align-self: center;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center;">
   <label style="align-self: center; margin-left: var(--lumo-space-l);" id="label"></label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end; align-self: center;" id="vaadinHorizontalLayout2">
   <vaadin-button theme="primary" style="align-self: center; flex-grow: 0; flex-shrink: 0; margin-right: var(--lumo-space-m);  background-color: red;" id="vaadinButton">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productolistadoadministracion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_listado_administracion.is, VistaProducto_listado_administracion);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaProducto_listado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 90%; align-items: center; margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); border-bottom: 1px solid #ECEDEE;" id="verticalLayout_producto_listado">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background-color: #white; padding: var(--lumo-space-s);" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;" id="vaadinHorizontalLayout1">
   <label style="align-self: center;" id="label"></label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout2">
   <vaadin-text-field placeholder="Placeholder" id="cambiarPrecio" style="align-self: center; border-radius: 0; padding-bottom: 0; width: 100%;"></vaadin-text-field>
   <label style="align-self: center;" id="label1"></label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout3">
   <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="vaadinButton">
     Anadir 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productolistado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_listado.is, VistaProducto_listado);

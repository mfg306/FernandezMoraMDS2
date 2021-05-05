import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaProducto_administrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center; margin-top: var(--lumo-space-l);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: #F1F2F2; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout">
  <label style="margin-left: var(--lumo-space-xl);" id="label">Nombre producto </label>
  <label style="margin-left: 15%;" id="label2">Precio</label>
  <label style="margin-left: 45%; width: 100%;" id="label1">Código producto</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: #F1F2F2; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout1">
  <vaadin-list-box style="margin-top: var(--lumo-space-xl); padding: var(--lumo-space-l); background-color:#D0D1D1; width: 100%;" id="vaadinListBox">
   <vaadin-item id="vaadinItem">
     Características 
   </vaadin-item>
  </vaadin-list-box>
  <h2 style="flex-grow: 1; flex-shrink: 0; align-self: center; margin-left: 50%; width: 15%;" id="h2">Imagen</h2>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; justify-content: flex-end; margin-top: var(--lumo-space-l);" id="vaadinHorizontalLayout2">
  <vaadin-button theme="primary" id="vaadinButton" style="background-color: #ae1641;">
    Editar 
  </vaadin-button>
  <vaadin-button theme="primary" id="vaadinButton1" style="background-color: #ae1641;">
    Eliminar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto_administrador.is, VistaProducto_administrador);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; align-items: center; margin-top: var(--lumo-space-l); border: 1px solid #ECEDEE; padding: var(--lumo-space-m);  border-radius: 20px;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: white; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout">
  <label style="margin-left: var(--lumo-space-xl); width: 100%;" id="label"></label>
  <label style="margin-left: 15%;" id="label2"></label>
  <label style="margin-left: 45%;" id="label1"></label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: white; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout1">
  <span id="descripcion" style="width: 100%;"></span>
  <img id="fotoProducto" style="width: 100%; height: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; justify-content: flex-end; margin-top: var(--lumo-space-l);" id="vaadinHorizontalLayout2">
  <vaadin-button theme="primary" id="vaadinButton" style="align-self: center;  background-color: #7800ff;">
    Editar 
  </vaadin-button>
  <vaadin-button theme="primary" id="vaadinButton1" style="background-color: red;">
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

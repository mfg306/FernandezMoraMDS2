import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaVenta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-l);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: #F1F2F2; align-self: center; justify-content: space-around;" id="vaadinHorizontalLayout">
  <vaadin-list-box style="padding: var(--lumo-space-l); flex-grow: 0; background-color:#D0D1D1; flex-shrink: 1; width: 40%;" id="vaadinListBox">
   <vaadin-item id="vaadinItem">
    Caracteristicas
   </vaadin-item>
  </vaadin-list-box>
  <label style="align-self: center; flex-grow: 0; flex-shrink: 1; margin-right: var(--lumo-space-l);" id="label">Estado venta</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-venta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVenta.is, VistaVenta);

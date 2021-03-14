import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaUrunr extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="huecoMenu" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-button theme="primary" id="botonVerCategorias" style="align-self: flex-end; margin: var(--lumo-space-m);">
   Ver categorías 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-urunr';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUrunr.is, VistaUrunr);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <a href="" style="width: 100%; padding: var(--lumo-space-l); text-decoration:none; text-align: center; color: black; align-self: center;" id="oferta">Oferta</a>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);

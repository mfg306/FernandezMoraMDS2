import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaCategoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout">
 <a href="https://vaadin.com" style="width: 100%; padding: var(--lumo-space-l); align-self: center; text-decoration:none; color: white; font-size: 20px;  background-color: #4FC3F7; text-align: center;" id="categoria">Categoría</a>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoria.is, VistaCategoria);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaCategorias_administrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categoriasadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategorias_administrador.is, VistaCategorias_administrador);

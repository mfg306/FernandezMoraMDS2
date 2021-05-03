import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaCategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="lista_categorias">
 <vaadin-vertical-layout theme="spacing" id="lista_Categorias" style="width: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="partePaginacion" style="width: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" id="huecoProductos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategorias.is, VistaCategorias);

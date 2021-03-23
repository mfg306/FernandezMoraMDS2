import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductos_mas_vendidos_por_categorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <span style="width: 100%; display: block; text-align: center;" id="span">Los productos más vendidos</span>
 <vaadin-select value="Item one" id="clasificar_categorias"></vaadin-select>
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; padding: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;" id="lista_productos_categoria"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosmasvendidosporcategorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos_mas_vendidos_por_categorias.is, VistaProductos_mas_vendidos_por_categorias);

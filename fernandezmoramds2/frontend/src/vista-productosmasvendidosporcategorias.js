import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; align-items: center; justify-content: center;" id="vaadinHorizontalLayout">
  <div style="width: 100%; background-color: #454545; height: 0.5vw;" id="div"></div>
  <h2 id="getTituloMasVendidos" style="align-self: center; width: 100%; text-align: center;">Lo mas vendido</h2>
  <div style="width: 100%; background-color: #454545; height: 0.5vw;" id="div1"></div>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="listaCategoriasMasVendidos"></vaadin-vertical-layout>
 <vaadin-horizontal-layout style="height: 100%; width: 100%; align-self: center; align-items: center; justify-content: center;" id="lista_productos_categoria"></vaadin-horizontal-layout>
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

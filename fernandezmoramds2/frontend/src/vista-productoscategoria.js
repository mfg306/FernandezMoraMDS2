import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-menuurunr.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProductos_categoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="lista_productos_categoria" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: center;" id="vaadinHorizontalLayout">
  <vaadin-button id="boton_pagina_anterior" style="color: #ae1641;">
    &lt; 
  </vaadin-button>
  <span id="numero_pagina">Pagina x de X</span>
  <vaadin-button id="boton_pagina_siguiente" style="color: #ae1641;">
    &gt; 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="verProductoCategoria" style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productoscategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos_categoria.is, VistaProductos_categoria);

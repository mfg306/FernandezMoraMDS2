import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-menuurunr.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductos_oferta extends PolymerElement {

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
 <vaadin-horizontal-layout theme="spacing-l" style="align-self: center; background-color: white; height: 100%; padding: var(--lumo-space-m); align-items: center; justify-content: center;" id="lista_productos_oferta"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-s);" id="vaadinHorizontalLayout">
  <vaadin-button id="boton_pagina_anterior" style="background-color: grey; color: white;">
    &lt; 
  </vaadin-button>
  <span id="span1">Página</span>
  <span id="primeraPagina"></span>
  <span id="numero_pagina">de</span>
  <span id="ultimaPagina"></span>
  <vaadin-button id="boton_pagina_siguiente" style="background-color: grey; color: white;">
    &gt; 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosoferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos_oferta.is, VistaProductos_oferta);

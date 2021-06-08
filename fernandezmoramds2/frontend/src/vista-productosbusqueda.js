import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-menuurunr.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productobusqueda.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductos_busqueda extends PolymerElement {

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
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-l); align-items: center; height: 100%; background-color: white;" id="vaadinHorizontalLayout1"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-s);" id="vaadinHorizontalLayout2">
  <vaadin-button id="boton_pagina_anterior" style="background-color: grey; color: white;">
    &lt; 
  </vaadin-button>
  <span id="span">Página</span>
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
        return 'vista-productosbusqueda';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos_busqueda.is, VistaProductos_busqueda);

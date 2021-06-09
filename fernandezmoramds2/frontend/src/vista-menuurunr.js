import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaMenu_urunr extends PolymerElement {

     static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="justify-content: center; align-items: center; width: 100%; " id="menu">
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; align-self: center; align-items: center; justify-content: center;  top: 0; position: sticky; z-index: 100; background-color: white;" id="vaadinHorizontalLayout">
  <img style="width: 100%;" id="logo_tienda">
  <vaadin-horizontal-layout theme="spacing" id="seleccionarCategoria" style="align-self: center; justify-content: center; align-items: center;"></vaadin-horizontal-layout>
  <vaadin-vertical-layout id="huecoBuscador" style="width: 100%; align-self: center; align-items: center; justify-content: center;"></vaadin-vertical-layout>
  <img id="boton_iniciar_sesion">
  <vaadin-vertical-layout id="vaadinVerticalLayout" style="justify-content: center; align-items: center; align-self: center;">
   <img id="boton_carrito" style="width: 100%; height: 100%;">
   <span id="numeroElementos" style="align-self: center; font-size: 12px; background-color: black; color: white; border-radius: 20px; width: 100%; text-align: center; margin: var(--lumo-space-s); flex-grow: 0;"></span>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-menuurunr';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMenu_urunr.is, VistaMenu_urunr);

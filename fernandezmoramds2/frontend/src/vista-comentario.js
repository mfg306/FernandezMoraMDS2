import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaComentario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; padding: var(--lumo-space-s); align-items: center;" id="comentario">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; align-items: center;">
  <vaadin-vertical-layout theme="spacing" id="huecoNombreUsuarioComentario" style="flex-grow: 1; align-items: center; justify-content: center; align-self: center;">
   <span id="nombreComentarioUsuario"></span>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="flex-grow: 1; align-self: center; align-items: center; justify-content: center;">
   <span id="valoracionProducto" style="align-self: center;"></span>
   <vaadin-vertical-layout theme="spacing" id="huecoComentario" style="width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-comentario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComentario.is, VistaComentario);

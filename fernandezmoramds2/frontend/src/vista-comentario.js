import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
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
<vaadin-vertical-layout style="width: 100%; align-items: flex-start; padding: var(--lumo-space-s); " id="comentario">
 <span style="align-self: flex-start;" id="span">Comentario de un usuario</span>
 <span style="align-self: flex-end;" id="span1">Valoración</span>
 <span style="align-self: flex-end; " id="span2">5/5</span>
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

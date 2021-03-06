import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaComentarios extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="lista_comentarios">
 <span style="font-weight: bold;" id="span">Comentarios:</span>
 <vaadin-vertical-layout theme="spacing" id="huecoComentarios" style="width: 100%; align-self: center; align-items: center; justify-content: center;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-comentarios';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComentarios.is, VistaComentarios);

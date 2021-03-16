import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaGestionarcategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="titulo" style="align-self: center;">Mis categorías</h1>
 <vaadin-button theme="primary" id="botonNuevaCategoria">
   Nueva categoria 
 </vaadin-button>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-gestionarcategorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionarcategorias.is, VistaGestionarcategorias);

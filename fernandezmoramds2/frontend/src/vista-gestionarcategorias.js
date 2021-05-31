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
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-button id="retroceder" style="background-color: grey; color: white;">
   &lt; 
 </vaadin-button>
 <h1 id="titulo" style="align-self: center;">Mis categorias</h1>
 <vaadin-button theme="primary" id="botonNuevaCategoria" style="align-self: flex-start; background-color: #7800ff;">
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

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaOfertas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-horizontal-layout class="content" style="justify-content: center;" id="vaadinHorizontalLayout">
 <vaadin-button style="align-self: center; background-color: #454545; color: white;" id="boton_anterior">
   &lt; 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" id="listaOfertas" style="width: 100%; 	
"></vaadin-horizontal-layout>
 <vaadin-button style="align-self: center; background-color: #454545; color: white;" id="boton_siguiente">
   &gt; 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-ofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertas.is, VistaOfertas);

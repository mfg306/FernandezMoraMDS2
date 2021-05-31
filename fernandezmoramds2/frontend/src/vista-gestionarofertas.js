import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ofertasadministrador.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaGestionar_ofertas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: flex-start;" id="vaadinVerticalLayout">
 <vaadin-button id="retroceder" style="background-color: grey; color: white;">
   &lt; 
 </vaadin-button>
 <h1 style="align-self: center;" id="h1">Mis ofertas</h1>
 <vaadin-button theme="primary" style="align-self: flex-start; background-color: #7800ff;" id="vaadinButton">
   Nueva oferta 
 </vaadin-button>
 <vaadin-vertical-layout id="vaadinVerticalLayout1">
  <vista-ofertasadministrador id="vistaOfertasadministrador"></vista-ofertasadministrador>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-gestionarofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionar_ofertas.is, VistaGestionar_ofertas);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-ofertasadministrador.js';

class VistaGestionar_ofertas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: flex-start;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Mis ofertas</h1>
 <vaadin-button theme="primary" style="margin: var(--lumo-space-l);" id="vaadinButton">
   Nueva oferta 
 </vaadin-button>
 <vista-ofertasadministrador id="vistaOfertasadministrador"></vista-ofertasadministrador>
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

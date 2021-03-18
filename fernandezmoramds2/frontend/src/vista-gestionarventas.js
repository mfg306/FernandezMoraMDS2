import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaGestionar_ventas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Ventas</h1>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-gestionarventas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionar_ventas.is, VistaGestionar_ventas);

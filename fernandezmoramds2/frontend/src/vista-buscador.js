import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaBuscador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-text-field placeholder="Busca tu producto ..." style="width: 100%;" id="buscador">
  <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
 </vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-buscador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscador.is, VistaBuscador);

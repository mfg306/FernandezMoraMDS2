import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaPedidos_e extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidose';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidos_e.is, VistaPedidos_e);

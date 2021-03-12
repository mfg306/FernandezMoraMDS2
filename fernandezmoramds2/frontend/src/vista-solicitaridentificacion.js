import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-menuurunr.js';

class VistaSolicitar_identificacion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayout">
 <span style="font-size: 4vw; font-weight: bold; align-self: center; text-align: center; margin-top: var(--lumo-space-xl);" id="span">INICIA SESIÓN O REGÍSTRATE PARA REALIZAR UNA COMPRA </span>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-solicitaridentificacion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaSolicitar_identificacion.is, VistaSolicitar_identificacion);

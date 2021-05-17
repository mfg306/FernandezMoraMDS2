import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaIntroducir_datos_compra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 80%; justify-content: center; align-items: center;" id="vaadinVerticalLayout1">
  <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span">Introduzca los datos de su compra</span>
  <vaadin-text-field id="direccion_envio" style="width: 100%;" placeholder="Introduzca una direccion de envio"></vaadin-text-field>
  <vaadin-text-field id="metodo_pago" style="width: 100%;" placeholder="Introduzca un metodo de pago"></vaadin-text-field>
  <vaadin-button theme="primary" id="boton_continuar" style="background-color: #ae1641;">
    Continuar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-introducirdatoscompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIntroducir_datos_compra.is, VistaIntroducir_datos_compra);

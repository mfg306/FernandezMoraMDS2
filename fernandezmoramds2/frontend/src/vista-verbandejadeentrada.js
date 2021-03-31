import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVer_bandeja_de_entrada extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayoutGeneral">
 <vaadin-vertical-layout style="width: 100%; background-color: #F1F2F2;" id="menuAdmin">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
   <img id="logo">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout1">
    <vaadin-button theme="primary" style="margin: var(--lumo-space-xl);" id="correo">
      Correo 
    </vaadin-button>
    <vaadin-button theme="primary" style="margin: var(--lumo-space-xl);" id="cerrar_sesion">
      Cerrar sesión 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <span style="font-size: 4vw; font-weight: bold; align-self: center; text-align: center; margin-top: var(--lumo-space-xl);" id="span">BANDEJA DE ENTRADA</span>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
   <vaadin-button id="boton_recibidos">
     Recibidos 
   </vaadin-button>
   <vaadin-button id="boton_enviados">
     Enviados 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" id="huecoMensajes" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verbandejadeentrada';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVer_bandeja_de_entrada.is, VistaVer_bandeja_de_entrada);

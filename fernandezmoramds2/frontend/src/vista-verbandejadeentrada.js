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
 <vaadin-vertical-layout style="width: 100%; " id="menuAdmin">
  <vaadin-horizontal-layout style="width: 100%;" id="vaadinHorizontalLayout">
   <img id="logo">
   <vaadin-horizontal-layout style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout1" theme="spacing-s">
    <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="correo">
      Correo 
    </vaadin-button>
    <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="cerrar_sesion">
      Cerrar sesion 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <span style="font-size: 4vw; font-weight: bold; align-self: center; text-align: center; margin-top: var(--lumo-space-xl);" id="span">BANDEJA DE ENTRADA</span>
 <vaadin-vertical-layout style="width: 80%; align-self: flex-start;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: flex-start;" theme="spacing">
   <vaadin-button id="boton_recibidos" style="color: #7800ff;">
     Recibidos 
   </vaadin-button>
   <vaadin-button id="boton_enviados" style="color: #7800ff;">
     Enviados 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout id="huecoMensajes" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
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

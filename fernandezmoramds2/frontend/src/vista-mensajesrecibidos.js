import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaMensajes_recibidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="lista_mensajes_recibidos">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
 <vaadin-button id="boton_crear_mensaje">
   Crear mensaje 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; justify-content: center; align-items: center;" id="vaadinHorizontalLayout">
  <vaadin-button id="boton_pagina_anterior">
    &lt; 
  </vaadin-button>
  <span id="numero_de_pagina">Pagina x de X</span>
  <vaadin-button id="boton_pagina_siguiente">
    &gt; 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajesrecibidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajes_recibidos.is, VistaMensajes_recibidos);

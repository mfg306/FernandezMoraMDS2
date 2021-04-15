import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaIniciar_sesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinVerticalLayout">
 <span style="font-size: 4vw; font-weight: bold; width: 100%; text-align:center;" id="span">INICIA SESIÓN</span>
 <vaadin-text-field id="correo" style="width: 80%;" placeholder="Introduzca su correo electrónico"></vaadin-text-field>
 <vaadin-text-field id="nombre_usuario" style="width: 80%;" placeholder="Introduzca su nombre de usuario"></vaadin-text-field>
 <vaadin-text-field id="contrasenia" style="width: 80%;" placeholder="Introduzca su contraseña"></vaadin-text-field>
 <vaadin-button theme="primary" id="botonOlvidarContraseña" class="boton-enlace" style="align-self: center; ">
   Recuperar contraseña 
 </vaadin-button>
 <vaadin-button theme="primary" id="boton_iniciar_sesion">
   Iniciar sesión 
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-button id="boton_iniciar_sesion_google">
    con Google 
  </vaadin-button>
  <vaadin-button id="boton_iniciar_sesion_facebook">
    con Facebook 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button theme="primary" id="botonRegistrarse" style="align-self: center; ">
   Registrarse 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-iniciarsesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciar_sesion.is, VistaIniciar_sesion);

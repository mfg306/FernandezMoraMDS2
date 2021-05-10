import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaIniciar_sesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; background-color: #ae1641;">
   <h1 style="align-self: center; color: white; text-align: center; flex-grow: 1; height: 100%;">¡Bienvenido a nuestra página!</h1>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <span style="font-size: 4vw; font-weight: bold; width: 100%; text-align:center;" id="span">INICIA SESIÓN</span>
   <vaadin-text-field id="correo" style="width: 80%; align-self: center;" placeholder="Introduzca su correo electrónico" required autofocus></vaadin-text-field>
   <vaadin-text-field id="nombre_usuario" style="width: 80%; align-self: center;" placeholder="Introduzca su nombre de usuario" required autofocus></vaadin-text-field>
   <vaadin-password-field id="contrasenia" style="width: 80%; align-self: center;" required invalid></vaadin-password-field>
   <vaadin-button theme="tertiary-inline" id="botonOlvidarContraseña" class="boton-enlace" style="align-self: center; flex-grow: 0; flex-shrink: 0; color: #ae1641;">
     ¿Has olvidado tu contraseña? 
   </vaadin-button>
   <vaadin-button theme="primary" id="boton_iniciar_sesion" class="botonPersonalizado" style="align-self: center; background-color: #ae1641;">
     Iniciar sesión 
   </vaadin-button>
   <vaadin-button theme="tertiary-inline" id="botonRegistrarse" style="align-self: center; color: #ae1641;">
    ¿No tienes cuenta? Registrate
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
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

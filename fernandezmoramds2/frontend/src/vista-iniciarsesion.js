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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; background-color: #ae1641;" id="vaadinVerticalLayout2">
   <h1 style="align-self: center; color: white; text-align: center; flex-grow: 0; margin: auto;" id="h1">¡Bienvenido a nuestra pagina!</h1>
   <h1 id="modoEmpleado" style="align-self: center; color: white; text-align: center; flex-grow: 0; margin: auto;">Modo Empleado</h1>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; width: 100%; text-align:center;" id="span">INICIA SESION</span>
   <vaadin-text-field id="correo" style="width: 80%; align-self: center;" placeholder="Introduzca su correo electronico" required autofocus invalid></vaadin-text-field>
   <vaadin-text-field id="nombre_usuario" style="width: 80%; align-self: center;" placeholder="Introduzca su nombre de usuario" required autofocus invalid></vaadin-text-field>
   <vaadin-password-field id="contrasenia" style="width: 80%; align-self: center;" required invalid placeholder="Introduzca su contrasena"></vaadin-password-field>
   <vaadin-button theme="tertiary-inline" id="botonOlvidarContraseña" class="boton-enlace" style="align-self: center; flex-grow: 0; flex-shrink: 0; color: #ae1641;">
     ¿Has olvidado tu contrasena? 
   </vaadin-button>
   <vaadin-button theme="primary" id="boton_iniciar_sesion" class="botonPersonalizado" style="align-self: center; background-color: #ae1641;">
     Iniciar sesion 
   </vaadin-button>
   <vaadin-button id="boton_iniciar_sesion_empleados" style="align-self: center; background-color: #ae1641;" theme="primary">
    Iniciar sesión
   </vaadin-button>
   <vaadin-button theme="tertiary-inline" id="botonRegistrarse" style="align-self: center; color: #ae1641;">
     ¿No tienes cuenta? Registrate 
   </vaadin-button>
   <vaadin-button id="enlaceEmpleados" style="align-self: center; color: #ae1641;" theme="tertiary-inline">
    ¿Eres un empleado?
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

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
 <vaadin-horizontal-layout style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%;  " id="vaadinVerticalLayout2">
   <img id="img" style="width: 100%; height: 100%;">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-l" style="width: 100%; padding: var(--lumo-space-m); " id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; width: 100%; text-align:center;" id="span">INICIA SESION</span>
   <vaadin-horizontal-layout theme="spacing-xs" style="align-self: center; align-items: center; justify-content: center;">
    <vaadin-button theme="tertiary-inline" id="botonRegistrarse" style="align-self: center; color: #7800ff; flex-grow: 0; flex-shrink: 0;">
      o Registrate 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-text-field id="correo" style="align-self: center; border-bottom: 1px solid grey; border-radius: 0; padding-bottom: 0; width: 100%; background-color: white; " placeholder="Introduzca su correo electronico" required autofocus invalid></vaadin-text-field>
   <vaadin-text-field id="nombre_usuario" style="align-self: center; border-bottom: 1px solid grey; border-radius: 0; padding-bottom: 0; width: 100%; background-color: white; " placeholder="Introduzca su correo electronico" required autofocus invalid></vaadin-text-field>
   <vaadin-password-field id="contrasenia" style="align-self: center; border-bottom: 1px solid grey; border-radius: 0; padding-bottom: 0; width: 100%; background-color: white; " required invalid placeholder="Introduzca su contrasena"></vaadin-password-field>
   <vaadin-button theme="tertiary-inline" id="botonOlvidarContraseña" class="boton-enlace" style="align-self: flex-start; flex-grow: 0; flex-shrink: 0; color:#7800ff;">
     ¿Has olvidado tu contrasena? 
   </vaadin-button>
   <vaadin-button theme="primary" id="boton_iniciar_sesion" class="botonPersonalizado" style="align-self: center; background-color: #7800ff;">
     Iniciar sesion 
   </vaadin-button>
   <vaadin-button id="boton_iniciar_sesion_empleados" style="align-self: center;  background-color: #7800ff;" theme="primary">
     Iniciar sesión 
   </vaadin-button>
   <vaadin-button id="enlaceEmpleados" style="align-self: center; color: #7800ff; border-radius: 0;" theme="tertiary-inline" class="bounce">
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

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

class VistaRegistrarse extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <div style="width: 80%; align-self: center;" id="div">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: center; height: 100%;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span">REGÍSTRATE</span>
   <vaadin-text-field id="nombre" style="width: 100%;" placeholder="Introduzca su nombre" required></vaadin-text-field>
   <vaadin-text-field id="apellidos" style="width: 100%;" placeholder="Introduzca sus apellidos" required></vaadin-text-field>
   <vaadin-text-field id="correo" style="width: 100%;" placeholder="Introduzca su correo" required></vaadin-text-field>
   <vaadin-text-field id="nombre_usuario" style="width: 100%;" placeholder="Introduzca su nombre de usuario" required></vaadin-text-field>
   <vaadin-password-field id="contrasenia" style="width: 100%;" required></vaadin-password-field>
   <vaadin-password-field id="confirmacionContrasenia" style="width: 100%;" required></vaadin-password-field>
   <vaadin-button theme="primary" style="align-self: center;" id="boton_registrarse">
     Registrarse 
   </vaadin-button>
  </vaadin-vertical-layout>
 </div>
 <vaadin-button theme="primary" id="botonIniciarSesion" style="align-self: center; margin: var(--lumo-space-m);">
   ¿Ya tienes cuenta? Haz click aquí para iniciar sesión 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-registrarse';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistrarse.is, VistaRegistrarse);

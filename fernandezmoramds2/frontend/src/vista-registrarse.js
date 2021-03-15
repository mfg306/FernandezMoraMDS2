import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaRegistrarse extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <div style="width: 80%; align-self: center;" id="div">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: center; height: 100%;" id="vaadinVerticalLayout1">
   <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span">REGÍSTRATE</span>
   <vaadin-text-field id="nombre" style="width: 100%;" placeholder="Introduzca su nombre"></vaadin-text-field>
   <vaadin-text-field id="apellidos" style="width: 100%;" placeholder="Introduzca sus apellidos"></vaadin-text-field>
   <vaadin-text-field id="correo" style="width: 100%;" placeholder="Introduzca su correo"></vaadin-text-field>
   <vaadin-text-field id="nombre_usuario" style="width: 100%;" placeholder="Introduzca su nombre de usuario"></vaadin-text-field>
   <vaadin-text-field id="contrasenia" style="width: 100%;" placeholder="Introduzca su contraseña"></vaadin-text-field>
   <vaadin-text-field id="confirmacion_contrasenia" style="width: 100%;" placeholder="Confirme su contraseña"></vaadin-text-field>
   <vaadin-button theme="primary" style="align-self: center;" id="boton_registrarse">
     Registrarse 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
    <vaadin-button id="boton_con_Google">
      con Google 
    </vaadin-button>
    <vaadin-button id="boton_con_Facebook">
      con Facebook 
    </vaadin-button>
   </vaadin-horizontal-layout>
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

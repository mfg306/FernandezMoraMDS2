import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEditar_perfil extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <span style="align-self: center; margin-top: var(--lumo-space-xl); background-color: #737373; color: white; padding: 0 2vw; border-radius: 1vw; font-size: 3vw;" id="span">Mi perfil</span>
 <vaadin-vertical-layout theme="spacing" id="huecoImagen" style="align-self: center; width: 100%; margin: var(--lumo-space-l); align-items: center; justify-content: center;">
  <img style="width: 50%; height: 50%; border-radius: 100%;" id="img">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; height: 100%; flex-grow: 0; align-self: center; " id="vaadinVerticalLayout1">
  <span style="font-size: 4vw; font-weight: bold; align-self: center;" id="span1">Editar perfil</span>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Nombre de usuario" id="nombre_usuario" class="formulario" label="Nombre de usuario:"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Nombre" id="nombre" class="formulario" label="Nombre:"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Primer apellido" id="apellidos" class="formulario" label="Primer apellido:"></vaadin-text-field>
  <vaadin-text-field placeholder="Segundo apellido" id="segundoApellido" style="align-self: center; width: 100%;" class="formulario" label="Segundo apellido:"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Correo electronico" id="correo_electronico" class="formulario" label="Correo electronico:"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Direccion envio" id="direccion_envio" class="formulario" label="Direccion de envio:"></vaadin-text-field>
  <vaadin-text-field style="align-self: center; width: 100%;" placeholder="Metodo de pago" id="metodo_pago" class="formulario" label="Metodo de pago:"></vaadin-text-field>
  <vaadin-button style="align-self: center; color: #7800ff;" id="boton_cambiar_contrasenia">
    Cambiar contrasena 
  </vaadin-button>
  <vaadin-button theme="primary" style="align-self: center;  background-color: #7800ff;" id="boton_guardar">
    Guardar 
  </vaadin-button>
  <span style="align-self: center;" id="span2">¿Desea eliminar su cuenta?</span>
  <vaadin-button theme="primary error" style="align-self: center;" id="boton_eliminar_cuenta">
    Eliminar cuenta 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editarperfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditar_perfil.is, VistaEditar_perfil);

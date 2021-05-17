import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProducto extends PolymerElement {

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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-top: var(--lumo-space-l);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-m);" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: space-between; width: 100%; height: 100%; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout1">
    <span id="nombre_producto" style="font-size: 2vw;"></span>
    <vaadin-button id="boton_anadir_carrito" style="color: #ae1641;">
      Anadir a carrito 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <img style="width: 100%; height: 100%; align-self: center;" id="img">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout2">
    <img style="width: 100%; height: 100%;" id="img1">
    <img style="width: 80%; height: 80%;" id="img2">
    <img style="width: 80%; height: 80%;" id="img3">
    <img style="width: 80%; height: 80%;" id="img4">
    <img style="width: 80%; height: 80%;" id="img5">
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; background-color: #F5F5F5; padding: var(--lumo-space-l);" id="vaadinVerticalLayout2">
    <vaadin-text-field placeholder="Deja tu comentario ..." style="height: 100%; padding: var(--lumo-space-m); align-self: center; width: 100%;" required name="comentario" invalid id="dejar_comentario"></vaadin-text-field>
    <vaadin-vertical-layout theme="spacing" id="valorarProducto"></vaadin-vertical-layout>
    <vaadin-button theme="primary" style="align-self: flex-end; background-color: #ae1641;" id="enviar_comentario">
      Enviar comentario 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-m); background-color: #F5F5F5;" id="vaadinVerticalLayout3">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout3">
    <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout4">
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: stretch;" id="vaadinHorizontalLayout4">
      <span style="align-self: center; flex-grow: 0; flex-shrink: 0;" id="etiqueta_descripcion">Descripcion</span>
      <span style="align-self: center; background-color: grey; padding: 1vw; color: white; border-radius: 2vw; text-align: center; height: 50%;" id="precio"></span>
     </vaadin-horizontal-layout>
     <vaadin-list-box style="background-color: white; align-self: center; width: 100%;" id="caracteristicas_producto">
      <vaadin-item id="vaadinItem6"></vaadin-item>
     </vaadin-list-box>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; width: 80%; flex-grow: 1;" id="vaadinVerticalLayout5">
     <span style="font-weight: bold; align-self: center; width: 100%; flex-grow: 0;" id="span">Valoracion media:</span>
     <span style="align-self: center;" id="valoracion_media"></span>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="listaComentarios"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);

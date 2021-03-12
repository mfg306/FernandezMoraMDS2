import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCrear_producto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <h1 style="align-self: center;" id="h1">Mis productos</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; justify-content: center; background-color: #F1F2F2; align-self: center; padding: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 40%;" id="vaadinHorizontalLayout1">
    <vaadin-text-field label="Nombre producto:" placeholder="Introduzca un nombre producto" style="flex-grow: 1; width: 100%;" id="nombreProducto"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-text-field label="Precio:" placeholder="Introduzca un precio" id="precio"></vaadin-text-field>
   <vaadin-text-area label="Añade una descripción al producto:" placeholder="Descripción" style="width: 50%;" id="añadeUnaDescripciónAlProducto"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 60%;" id="vaadinVerticalLayout2">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout2">
    <img id="img" style="width: 100%; height: 100%;">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; margin-left: var(--lumo-space-xl); align-items: center; flex-grow: 1; flex-shrink: 1;" id="vaadinVerticalLayout3">
     <img id="img1" style="width: 100%; height: 100%;">
     <img id="img2" style="width: 100%; height: 100%;">
     <img id="img3" style="width: 100%; height: 100%;">
     <img id="img4" style="width: 100%; height: 100%;">
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-button theme="primary" id="vaadinButton">
     Añadir imagen 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; margin-top: var(--lumo-space-l); justify-content: flex-end; align-self: center;" id="vaadinHorizontalLayout3">
  <vaadin-button theme="primary" id="vaadinButton1">
    Guardar 
  </vaadin-button>
  <vaadin-button theme="primary" id="vaadinButton2">
    Cancelar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-crearproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCrear_producto.is, VistaCrear_producto);

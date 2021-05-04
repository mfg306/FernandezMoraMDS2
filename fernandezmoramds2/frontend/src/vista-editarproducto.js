import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaEditar_producto extends PolymerElement {

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
 <h1 style="align-self: center;" id="h1">Mis productos</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; background-color: #F1F2F2; padding: var(--lumo-space-xl); justify-content: center; align-self: center;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 100%; align-items: center;" id="vaadinVerticalLayout1">
   <vaadin-text-field label="Nuevo nombre producto:" placeholder="Nombre producto" id="nuevoNombreProducto" style="width: 100%;"></vaadin-text-field>
   <vaadin-text-field label="Nuevo precio:" placeholder="Precio" id="nuevoPrecio" style="width: 100%;"></vaadin-text-field>
   <vaadin-text-area label="Añade una nueva descripción:" placeholder="Descripción" style="flex-grow: 0; flex-shrink: 0; width: 100%;" id="añadeUnaNuevaDescripción"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; flex-shrink: 1; justify-content: center;" id="vaadinVerticalLayout2">
   <label id="label">Código</label>
   <h2 id="h2">Imagen</h2>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-l); justify-content: flex-end; align-self: center;" id="vaadinHorizontalLayout1">
  <vaadin-button theme="primary" id="vaadinButton" style="background-color: #ae1641;">
    Guardar 
  </vaadin-button>
  <vaadin-button theme="primary" id="vaadinButton1" style="background-color: #ae1641;">
    Cancelar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-editarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditar_producto.is, VistaEditar_producto);

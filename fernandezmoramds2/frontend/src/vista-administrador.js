import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaAdministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; padding: 0;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout id="hueco-menu"></vaadin-vertical-layout>
 <h1 style="align-self: center; margin-bottom: var(--lumo-space-xl); 	" id="h1">BIENVENIDO AL MODO ADMINISTRADOR</h1>
 <vaadin-horizontal-layout style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 100%; background-color: #ECEDEE; padding: var(--lumo-space-m);" id="vaadinVerticalLayout1">
   <h2 style="align-self: center;" id="h2">Tus ofertas</h2>
   <vaadin-button theme="primary" id="boton_gestionar_ofertas" style="background-color: #7800ff; align-self: center; border-radius: 2vw;">
     Gestionar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; background-color: #ECEDEE; padding: var(--lumo-space-m);" id="vaadinVerticalLayout2">
   <h2 style="align-self: center;" id="h21">Tus categorias</h2>
   <vaadin-button theme="primary" id="boton_gestionar_categorias" style="background-color: #7800ff; align-self: center; border-radius: 2vw;">
     Gestionar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;  " id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout style="width: 100%; background-color: #ECEDEE; padding: var(--lumo-space-m);" id="vaadinVerticalLayout3">
   <h2 style="align-self: center;" id="h22">Tus productos</h2>
   <vaadin-button theme="primary" id="boton_gestionar_productos" style="background-color: #7800ff; align-self: center; border-radius: 2vw;">
     Gestionar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; background-color: #ECEDEE; padding: var(--lumo-space-m);" id="vaadinVerticalLayout4">
   <h2 style="align-self: center;" id="h23">Tus empleados</h2>
   <vaadin-button theme="primary" id="boton_gestionar_empleados" style="background-color: #7800ff; align-self: center; border-radius: 2vw;">
     Gestionar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; background-color: #ECEDEE; padding: var(--lumo-space-m);" id="vaadinVerticalLayout5">
   <h2 style="align-self: center;" id="h23">Tus ventas</h2>
   <vaadin-button theme="primary" id="boton_gestionar_ventas" style="background-color: #7800ff; align-self: center; border-radius: 2vw;">
     Gestionar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);

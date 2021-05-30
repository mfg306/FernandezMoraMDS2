package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Empleado;

public class BD_Empleados {
	public BDPrincipal _bDPrincipal;
	public Vector<Empleado> _empleado = new Vector<Empleado>();

	public Empleado[] cargarEmpleados() throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Empleado[] empleados = null;
		try {
			empleados = EmpleadoDAO.listEmpleadoByQuery(null, null);
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		return empleados;		
	}

	public void eliminarEmpleado(int aIdEmpleado) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Empleado e = EmpleadoDAO.getEmpleadoByORMID(aIdEmpleado);
			EmpleadoDAO.delete(e);
			
			/*Ver si es encargado o transportista para eliminar las relaciones*/
			
			if(e instanceof Transportista) {
				e = (Transportista)e;
				
				for(Enviado enviado : ((Transportista) e)._Enviado.toArray()) {
					((Transportista) e)._Enviado.remove(enviado);
				}
				
				for(Recibido recibido : ((Transportista) e)._Recibido.toArray()) {
					((Transportista) e)._Recibido.remove(recibido);
				}
			}
			
			if(e instanceof Encargado_de_compras) {
				e = (Encargado_de_compras)e;
				
				for(Enviado enviado : ((Encargado_de_compras) e)._Pedido_enviado.toArray()) {
					((Encargado_de_compras) e)._Pedido_enviado.remove(enviado);
				}
				
				for(Pendiente pendiente : ((Encargado_de_compras) e)._Pendiente.toArray()) {
					((Encargado_de_compras) e)._Pendiente.remove(pendiente);
				}
			}
			
			
			t.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
	}

	public void insertarEmpleado(String aContrasenia, String aCorreo, boolean aEsEncargado) throws PersistentException {
	
		PersistentTransaction t1 = HitoPersistentManager.instance().getSession().beginTransaction();
		
		try {
			if(aEsEncargado == true){
				Encargado_de_compras encargado = Encargado_de_comprasDAO.createEncargado_de_compras();
				
				encargado.setContrasenia(aContrasenia);
				encargado.setCorreo(aCorreo);
				
				Encargado_de_comprasDAO.save(encargado);
				
			} else {
				Transportista t = TransportistaDAO.createTransportista();
				
				t.setContrasenia(aContrasenia);
				t.setCorreo(aCorreo);
				
				Transportista[] listadoT = TransportistaDAO.listTransportistaByQuery(null, null);
				
				/* Tenemos que asignarle la cola que se corresponde con el numero del transportista que es*/
				if(listadoT.length > 0) t.setId_cola(listadoT.length);
				else t.setId_cola(0);
				
				TransportistaDAO.save(t);
			}
			
			t1.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t1.rollback();
		}
	}

	public Empleado actualizarEmpleado(int aIdEmpleado, String correo, String contrasenia) throws PersistentException {
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Empleado e = null;
		
		try {
			e = EmpleadoDAO.getEmpleadoByORMID(aIdEmpleado);
			e.setCorreo(correo);
			e.setContrasenia(contrasenia);
			
			EmpleadoDAO.save(e);
			t.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			t.rollback();
		}
		
		return e;
	}
}
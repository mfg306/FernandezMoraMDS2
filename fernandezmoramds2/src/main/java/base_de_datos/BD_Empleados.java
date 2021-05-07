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
				
				TransportistaDAO.save(t);
			}
			
			t1.commit();
		} catch(Exception e) {
			e.printStackTrace();
			t1.rollback();
		}

		
		
	}

	public void actualizarEmpleado(String aNombreUsuario, String aContrasenia, String aCorreo) {
		throw new UnsupportedOperationException();
	}
}
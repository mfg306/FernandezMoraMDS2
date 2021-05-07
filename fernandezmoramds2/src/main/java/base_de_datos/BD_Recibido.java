package base_de_datos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Recibido;

public class BD_Recibido {
	public BDPrincipal _bDPrincipal;
	public Vector<Recibido> _recibido = new Vector<Recibido>();


	public Recibido[] cargarRecibidos() throws PersistentException 
	{
		PersistentTransaction t = HitoPersistentManager.instance().getSession().beginTransaction();
		Recibido[] recibidos = null;
		
		try {
			recibidos = RecibidoDAO.listRecibidoByQuery(null, null);
			t.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
		return recibidos;
	}

}
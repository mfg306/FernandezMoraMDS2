package base_de_datos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Recibido;

public class BD_Recibido {
	public BDPrincipal _bDPrincipal;
	public Vector<Recibido> _recibido = new Vector<Recibido>();


	public Recibido[] cargarRecibidos() throws PersistentException 
	{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();
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
	
	public boolean repartirACliente(UR aCliente, Enviado aEnviado)  throws PersistentException 
	{
		PersistentTransaction t = MDS2PersistentManager.instance().getSession().beginTransaction();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String fechaActualizacion = formatter.format(date);
		
		try {
			
			Recibido recibido = RecibidoDAO.createRecibido();
			recibido.setORM__recibe(aCliente);
			recibido.setORM__Recoge(aEnviado.get_Transportista());
			recibido.setFecha_estado(fechaActualizacion);
			recibido.setNum_total_unidades(aEnviado.getNum_total_unidades());
			recibido.setPrecio_total(aEnviado.getPrecio_total());
			recibido.setRecibido(true);
			
			RecibidoDAO.save(recibido);

		} catch(Exception e) {
			e.printStackTrace();
			t.rollback();
			return false;
		}

		this._bDPrincipal = new BDPrincipal();
		this._bDPrincipal.eliminarEnviado(aEnviado);
		
		
		return true;
		
	}
	
	public Recibido[] cargarRecibidos(UR aUsuario) {
		Recibido[] listaR = null;
	
		try {
			listaR = RecibidoDAO.listRecibidoByQuery("URUsuario_GeneralId_Usuario = " + aUsuario.getId_Usuario() + " AND RECIBIDO = 1", null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return listaR;
		
	}

}

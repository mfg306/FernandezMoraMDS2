package Base_de_Datos;

import basededatos.BDPrincipal;
import java.util.Vector;
import Base_de_Datos.UR;

public class BD_UR {
	public BDPrincipal _bDPrincipal;
	public Vector<UR> _uNR = new Vector<UR>();

	public void registrarse(String aNombre, String aApellidos, String aCorreo, String aNombreUsuario, String aContrasenia, String aContraseniaRepeticion) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesion(String aCorreo, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean buscarUsuarioPorCorreo(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void actualizarDatosCompra(String aDireccionEnvio, String aMetodoPago) {
		throw new UnsupportedOperationException();
	}

	public UR[] cargarFichaCliente() {
		throw new UnsupportedOperationException();
	}
}
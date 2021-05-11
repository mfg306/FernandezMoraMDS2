package fernandezmora.interfaz;

import java.awt.Panel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



import com.vaadin.flow.component.notification.Notification;

import vistas.VistaRecuperar_contrasenia;

public class Recuperar_contrasenia extends VistaRecuperar_contrasenia {

	public Iniciar_sesion_UNR _iniciar_sesion_UNR;
	public Establecer_nueva_contrasenia _establecer_nueva_contrasenia;
	public Gestor_Correos _unnamed_Gestor_Correos_;
	
	
	public Recuperar_contrasenia(Iniciar_sesion_UNR iunr) {
		inicializar(iunr);
	}

	public void inicializar(Iniciar_sesion_UNR iunr) {
		this._iniciar_sesion_UNR = iunr;
		Enviar_enlace_recuperacion();

	}

	public void Enviar_enlace_recuperacion() {
		this.getBoton_enviar_correo().addClickListener(event -> {
			enviarConGMail(this.getCorreo().getValue(), "Tu nueva contraseña de TiendaElectrodomesticos", "Nueva contraseña");
			Notification.show("Enlace de recuperación enviado. Revise su bandeja de entrada del correo "
					+ this.getCorreo().getValue());
		});
	}

	public static void enviarConGMail(String destinatario, String Asunto, String cuerpo) {
		 Properties propiedad = new Properties();
	        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
	        propiedad.setProperty("mail.smtp.starttls.enable", "true");
	        propiedad.setProperty("mail.smtp.port", "587");
	        propiedad.setProperty("mail.smtp.auth","true");
	        
	        Session sesion = Session.getDefaultInstance(propiedad);
	        String correoEnvia = "tiendaelectrodomesticosmds2@gmail.com";
	        String contrasena = "JorgeMarta9900..es";
	        String receptor = destinatario ;
	        String asunto = Asunto;
	        String mensaje= cuerpo;
	        
	        MimeMessage mail = new MimeMessage(sesion);
	        try {
	            mail.setFrom(new InternetAddress (correoEnvia));
	            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (receptor));
	            mail.setSubject(asunto);
	            mail.setText(mensaje);
	            
	            Transport transportar = sesion.getTransport("smtp");
	            transportar.connect(correoEnvia,contrasena);
	            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
	            transportar.close();
	            
	            
	        } catch (AddressException ex) {
	            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (MessagingException ex) {
	            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}
}
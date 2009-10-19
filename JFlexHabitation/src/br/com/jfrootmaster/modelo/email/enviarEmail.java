package br.com.jfrootmaster.modelo.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




public class enviarEmail {

	public enviarEmail() {
		super();
	}

	
	private String servidor;
	private String assunto;
	private String para;
	private String de;
	private String mensagem;
	
	
	public class SMTPAuthenticator extends Authenticator {  
	       public PasswordAuthentication getPasswordAuthentication() {  
	          String usuario = "jefferson.ti@cbadiesel.com.br";  
	          String senha = "jn2803";  
	          return new PasswordAuthentication(usuario, senha);  
	       }  
	    }  
	   
	    public void setaParametrosEmail(enviarEmail enviaremail)  
	       throws AddressException, MessagingException {  
	   
	       Properties mailProps = new Properties();    
	   
	       mailProps.put("mail.smtp.host", enviaremail.getServidor());  
	   
	       Authenticator auth = new SMTPAuthenticator();  
	       Session mailSession = Session.getDefaultInstance(mailProps, auth);  
	   
	       mailProps.put("mail.smtp.auth", "true");  
	    
	       InternetAddress destinatario = new InternetAddress(enviaremail.getPara());  
	       InternetAddress remetente = new InternetAddress(enviaremail.getDe()); 
	   
	       Message message = new MimeMessage(mailSession);  
	    
	       message.setFrom(remetente);  
	   
	   
	       message.setRecipient(Message.RecipientType.TO, destinatario);   
	   
	       message.setSubject(enviaremail.getAssunto());  
	   
	       message.setContent(enviaremail.getMensagem().toString(), "text/html");  
	   
	       Transport.send(message); 
	       
	       System.out.println("Enviando Email.....");
	       System.out.println("Destinatario: " + destinatario);
	       System.out.println("Remetente: " + remetente);
	       System.out.println("Assunto: " + enviaremail.getAssunto());
	       System.out.println("Mesangem: " + enviaremail.getMensagem());
	    }

		public String getServidor() {
			return servidor;
		}

		public void setServidor(String servidor) {
			this.servidor = servidor;
		}

		public String getAssunto() {
			return assunto;
		}

		public void setAssunto(String assunto) {
			this.assunto = assunto;
		}

		public String getPara() {
			return para;
		}

		public void setPara(String para) {
			this.para = para;
		}

		public String getDe() {
			return de;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
	
	/* Methods */
		
//	public static void teste(String servidor, String assunto, String para, String de, String mensagem) throws AddressException, MessagingException{  
//			enviarEmail email = new enviarEmail();  
//			email.setaParametrosEmail(servidor, assunto, para, de, mensagem);     
//	}
	
}

package br.com.jfrootmaster.modelo.email;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;




public class receberEmail {

	public receberEmail() {
		super();
	}

	
//	private String host = "pop.cbadiesel.com.br";
//	private String username = "jefferson.ti@cbadiesel.com.br";
//	private String passwoed = "jn2803";
	
	private String mensagemHtml;
	private String de;
	private String assunto;
	private String para;
	
	//public void verificaEmails () throws MessagingException, IOException{	
	public List<receberEmail> verificaEmails() throws MessagingException, IOException{
			List<receberEmail> lista = new ArrayList<receberEmail>();
			
			List<String> listaString = new ArrayList<String>();
			
			String host = "pop.cbadiesel.com.br";
			String username = "jamille.vendas@cbadiesel.com.br";
			String passwoed = "cbadiesel";
		
	        Properties properties = System.getProperties();
	        Session session = Session.getDefaultInstance(properties);

	        Store store = session.getStore("pop3");
	        store.connect(host, username, passwoed);

	        Folder folder = store.getFolder("inbox");

	        if (!folder.exists()) {
	            System.out.println("No INBOX...");
	            System.exit(0);
	        }
	        folder.open(Folder.READ_WRITE);
	        Message[] msg = folder.getMessages();

	        for (int i = 0; i < msg.length; i++) {
	            System.out.println("------------ Message " + (i + 1) + " ------------");
	            String from = InternetAddress.toString(msg[i].getFrom());
	            if (from != null) {
	                System.out.println("From: " + from);
	                
	                //teste inclusao na lista de retorno;   
	                //lista.get(i).setDe(from);
	                listaString.add(from);
	            }

	            String replyTo = InternetAddress.toString(
	                    msg[i].getReplyTo());
	            if (replyTo != null) {
	                System.out.println("Reply-to: " + replyTo);
	            }
	            String to = InternetAddress.toString(
	                    msg[i].getRecipients(Message.RecipientType.TO));
	            if (to != null) {
	                System.out.println("To: " + to);
	                
	                //teste inclusao na lista de retorno;
	                //lista.get(i).setPara(to);
	                //listaString.add(to);
	            }

	            String subject = msg[i].getSubject();
	            if (subject != null) {
	                System.out.println("Subject: " + subject);
	                
	                //teste inclusao na lista de retorno;
	                //lista.get(i).setAssunto(subject);
	                //listaString.add(subject);
	            }
	            Date sent = msg[i].getSentDate();
	            if (sent != null) {
	                System.out.println("Sent: " + sent);
	            }

	            System.out.println();
	   
	            System.out.println("Tipo mensagem : ");
	            System.out.println(msg[i].getContentType());
	            
	            if(msg[i].getContentType().equalsIgnoreCase("text/html; charset=us-ascii")){
	            	
	            	System.out.println();
	                System.out.println("Message : ");
	                
	                @SuppressWarnings("unused")
					String corpoSimples = msg[i].getContent().toString();
	                System.out.println(corpoSimples);
	                
	                //teste inclusao na lista de retorno;
	                //lista.get(i).setMensagemHtml(corpoSimples);
	            	
	            }else{
	            Multipart multipart = (Multipart) msg[i].getContent();
	            
	            for (int x = 0; x < multipart.getCount(); x++) {
	                BodyPart bodyPart = multipart.getBodyPart(x);

	                String disposition = bodyPart.getDisposition();

	                if (disposition != null && (disposition.equals(BodyPart.ATTACHMENT))) {
	                    System.out.println("Mail have some attachment : ");

	                    DataHandler handler = bodyPart.getDataHandler();
	                    System.out.println("file name : " + handler.getName());
	                } else {
	                    System.out.println(bodyPart.getContent());
	                    
	                    //abre painel para exibir html
	                    //mostrarHTML(bodyPart.getContent().toString());
	                    
	                    //teste inclusao na lista de retorno;
		                //lista.get(i).setMensagemHtml(bodyPart.getContent().toString());
	                }
	            }
	            System.out.println();
	        }
	       }
	        folder.close(true);
	        store.close();
	        
	        //retorno lista de emails
			return lista;
	    }





	public String getMensagemHtml() {
		return mensagemHtml;
	}

	public void setMensagemHtml(String mensagemHtml) {
		this.mensagemHtml = mensagemHtml;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
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
	
}
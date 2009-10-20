////testes de inclusao,alteração,listagem e exclusão.
package br.com.jfrootmaster.teste;

import java.util.*;
import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.*;

public class teste2 {

    public static void main(String args[]) throws Exception {

        String host = "pop.cbadiesel.com.br";
        String username = "jefferson.ti@cbadiesel.com.br";
        String passwoed = "jn2803";

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
            }

            String subject = msg[i].getSubject();
            if (subject != null) {
                System.out.println("Subject: " + subject);
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
                }
            }
            System.out.println();
        }
        }
        folder.close(true);
        store.close();
    }
}
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Properties;
//
//import javax.mail.Address;
//import javax.mail.Folder;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.Part;
//import javax.mail.Session;
//import javax.mail.Store;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.swing.JEditorPane;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JScrollPane;
//
//import com.sun.mail.handlers.message_rfc822;
//
//public class teste2 {
//public static void main(String[] args) throws Exception {
//String host = "pop.cbadiesel.com.br";
//String username = "jefferson.ti@cbadiesel.com.br";
//String password = "jn2803";
//
//// Create empty properties
//try {
//Properties props = new Properties();
//
//// Get session
//Session session = Session.getDefaultInstance(props, null);
//
//// Get the store
//Store store = session.getStore("pop3");
//store.connect(host, username, password);
//
//// Get folder
//Folder folder = store.getFolder("INBOX");
//folder.open(Folder.READ_WRITE);
//
//// Get directory
//Message message[];
//message = folder.getMessages();
//for (int i=0, n=message.length; i<n; i++) {
//System.out.println(i + ": " + "De: " + message[i].getFrom()[0] + " Assunto: " + message[i].getSubject());
//System.out.println(message[i].getContentType());
////msg_struct(message[i]);
//}
//
//// Close connection
//folder.close(false);
//store.close();
//}catch (Exception e) {  
// e.printStackTrace();  
// } 
//
//}
//}



 
// import java.io.IOException;  
// import java.io.PrintStream;  
//   
// import sun.net.smtp.SmtpClient;  
// 
// 	@SuppressWarnings("unchecked")  
//    public class teste2 {  
// 		
// 		@SuppressWarnings("unchecked")
// 		public static void main(String[] args) {
// 			
// 			String from = "jefferson.ti@cbadiesel.com.br";  
//		       String to = "jf.rootmaster@gmail.com";  
//		   
//		       try {  
//		          SmtpClient client = new SmtpClient("smtp.cbadiesel.com.br");  
//		          client.from(from);  
//		          client.to(to);  
//		          PrintStream msg = client.startMessage();  
//		          msg.println("to:" + to);  
//		          msg.println("Subject:Sending e-mail from Zamples");  
//		          msg.print("\r\n");  
//		          msg.println("This email was sent from a JSP built by Zamples.");  
//		          msg.println("See [url]http://zamples.com[/url] for more information.");  
//		          client.closeServer();  
//		       } catch (IOException e) {  
//		          System.out.println("error" + e);  
//		       }
// 		}
//    }
// import javax.mail.*;  
// import javax.mail.internet.*;  
//   
// import java.util.Properties;  
//   
// public class Email {  
//   
//    public class SMTPAuthenticator extends Authenticator {  
//       public PasswordAuthentication getPasswordAuthentication() {  
//          String username = "";  
//          String password = "";  
//          return new PasswordAuthentication(username, password);  
//       }  
//    }  
//   
//    public void sendSimpleMail(  
//       String mailServer,  
//       String subject,  
//       String to,  
//       String from,  
//       String mensagem)  
//       throws AddressException, MessagingException {  
//   
//       Properties mailProps = new Properties();  
//       //definição do mailserver   
//   
//       mailProps.put("mail.smtp.host", mailServer);  
//   
//       Authenticator auth = new SMTPAuthenticator();  
//       Session mailSession = Session.getDefaultInstance(mailProps, auth);  
//   
//       mailProps.put("mail.smtp.auth", "false");  
//   
//       //As duas linhas seguintes de código, colocam no   
//       //formato de endereços,   
//       //supostamente válidos, de email os dados   
//       //passados pelos parâmetros to e from.   
//       InternetAddress destinatario = new InternetAddress(to);  
//       InternetAddress remetente = new InternetAddress(from);  
//   
//       //As duas linhas de código a seguir, são   
//       //responsáveis por setar os atributos e   
//       //propriedas necessárias do objeto message   
//       //para que o email seja enviado.   
//       //inicialização do objeto Message   
//       Message message = new MimeMessage(mailSession);  
//   
//       //Definição de quem está enviando o email   
//       message.setFrom(remetente);  
//   
//       //define o(s) destinatário(s) e qual o tipo do   
//       //destinatário.   
//       //os possíveis tipos de destinatário: TO, CC, BCC   
//   
//       message.setRecipient(Message.RecipientType.TO, destinatario);  
//       //definição do assunto do email   
//   
//       message.setSubject(subject);  
//       //definição do conteúdo da mesnagem e do   
//       //tipo da mensagem   
//   
//       message.setContent(mensagem.toString(), "text/html");  
//       //a linha de código seguinte é a responsável   
//       //pelo envio do email   
//   
//       Transport.send(message);  
//    }  
//    public static void main(String args[]) throws AddressException, MessagingException{  
//       Email email = new Email();  
//       email.sendSimpleMail("localhost", "Olá!", "dalton@godigital.com.br",  
//                      "dalton@javafree.com.br", "Oi, tudo bem??");     
//    }  
// }  
//	
   
//////////////CRIANDO UM OBJETO DE CADCLIENTE E PREENCHENDO DADOS/////////////
//
//	   System.out.println("Preenchendo Dados.....");
//	   Ocorrencia cc = new Ocorrencia();
//	   cc.setId_ocorrencia(2);
//	   cc.setDatainit("1");
//	   cc.setDescricao("1");
//	   cc.setHorainit("1");
//	   cc.setIddefeito("1");
//	   cc.setIdtipodef("1");
//	   cc.setIduser("1");
//	   cc.setStatus("1");
//	   id.incluir(cc);
//	   System.out.println("Dados Incluidos no Banco");
//
//   
///////////////////////////////LISTANDO APOS INCLUIR/////////////////////////
	   
//	   System.out.println("Listando apos incluir....");
//	   id.listar();
//	}
//}
//	   
///////////////////////////////ALTERANDO/////////////////////////////////////
////	   
////	   System.out.println("Alterando....");
////	   cc.setNome("Nome Mudado");
////	   id.CadClienteAlterar(cc);
////	   System.out.println("Nome Alterado");
////	   
///////////////////////////////LISTANDO APOS ALTERAR/////////////////////////
////	   
////	   System.out.println("Listando apos alterar....");
////	   id.CadClienteListar();
////	   
///////////////////////////////DELETANDO/////////////////////////////////////
////	   
////	   System.out.println("Deletando...");
////	// cc.setId(5); //Informa o ID do Cliente a Excluir (somente testes)
////	   id.CadClienteExcluir(cc.getId());
////	   System.out.println("Cliente Deletado");
////	   
///////////////////////////////LISTANDO APOS EXCLUIR////////////////////////
////	   
////	   System.out.println("Listando apos excluir...");
////	   id.CadClienteListar();
////	   
////	}
////	
//

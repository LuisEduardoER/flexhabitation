////testes de inclusao,alteração,listagem e exclusão.
package br.com.jfrootmaster.teste;

import java.util.*;
import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLEditorKit;

import br.com.jfrootmaster.modelo.email.enviarEmail;
import br.com.jfrootmaster.modelo.email.receberEmail;

public class teste3 {

    public static void main(String args[]) throws Exception {
//    	receberEmail recemail = new receberEmail();  
//		recemail.verificaEmails();
//    }

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
            }else if(msg[i].getContentType().equalsIgnoreCase("text/html; charset=ISO-8859-1")){
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
                    
                    //abre painel para exibir html
                    mostrarHTML(bodyPart.getContent().toString());
                }
            }
            System.out.println();
        }
        }
        folder.close(true);
        store.close();
    }
    
 public static void mostrarHTML(String html){  
         try {              
             JTextPane txtPane = new JTextPane();  
             JFrame frame = new JFrame();  
               
             txtPane.setContentType("text/html");  
               
             txtPane.setEditorKit(new HTMLEditorKit());  
             txtPane.setText(html);  
             //txtPane.setPage("file:///C:/PaginaTestehtml");  
             txtPane.setEditable(false);  
               
             //JScrollPane scroll = new JScrollPane(txtPane);  
             JScrollPane scroll = new JScrollPane(txtPane);   
   
              frame.getContentPane().add(scroll);  
              frame.setBounds(150, 10, 674, 718);  
               
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
              frame.setVisible(true);  
         }  
         catch (Exception e){  
             System.out.println("ERRO: " + e.getMessage() + " " + e.getLocalizedMessage());              
         }  
     } 
}
//}

////testes de inclusao,alteração,listagem e exclusão.
package br.com.jfrootmaster.teste;

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
   
 public class Email {  
   
    public class SMTPAuthenticator extends Authenticator {  
       public PasswordAuthentication getPasswordAuthentication() {  
          String usuario = "jefferson.ti@cbadiesel.com.br";  
          String senha = "jn2803";  
          return new PasswordAuthentication(usuario, senha);  
       }  
    }  
   
    public void enviarEmail(  
       String servidor,  
       String assunto,  
       String para,  
       String de,  
       String mensagem)  
       throws AddressException, MessagingException {  
   
       Properties mailProps = new Properties();  
       //definição do servidor   
   
       mailProps.put("mail.smtp.host", servidor);  
   
       Authenticator auth = new SMTPAuthenticator();  
       Session mailSession = Session.getDefaultInstance(mailProps, auth);  
   
       mailProps.put("mail.smtp.auth", "true");  
   
       //As duas linhas seguintes de código, colocam no   
       //formato de endereços,   
       //supostamente válidos, de email os dados   
       //passados pelos parâmetros to e from.   
       InternetAddress destinatario = new InternetAddress(para);  
       InternetAddress remetente = new InternetAddress(de);  
   
       //As duas linhas de código a seguir, são   
       //responsáveis por setar os atributos e   
       //propriedas necessárias do objeto message   
       //para que o email seja enviado.   
       //inicialização do objeto Message   
       Message message = new MimeMessage(mailSession);  
   
       //Definição de quem está enviando o email   
       message.setFrom(remetente);  
   
       //define o(s) destinatário(s) e qual o tipo do   
       //destinatário.   
       //os possíveis tipos de destinatário: TO, CC, BCC   
   
       message.setRecipient(Message.RecipientType.TO, destinatario);  
       //definição do assunto do email   
   
       message.setSubject(assunto);  
       //definição do conteúdo da mesnagem e do   
       //tipo da mensagem   
   
       message.setContent(mensagem.toString(), "text/html");  
       //a linha de código seguinte é a responsável   
       //pelo envio do email   
   
       Transport.send(message);  
    }  
    public static void main(String args[]) throws AddressException, MessagingException{  
       Email email = new Email();  
       email.enviarEmail("smtp.cbadiesel.com.br", "Teste Email com Java!", "jf.rootmaster@gmail.com",  
                      "jefferson.ti@cbadiesel.com.br", "Oi, tudo bem?? meu projeto java de enviar emails funcionou hehehe >D");     
    }  
 }  
	
   
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

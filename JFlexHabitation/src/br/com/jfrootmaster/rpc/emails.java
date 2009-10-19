package br.com.jfrootmaster.rpc;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import br.com.jfrootmaster.modelo.email.enviarEmail;

public class emails {
	
	
	public static void teste(enviarEmail enviaremail) throws AddressException, MessagingException{  
		enviarEmail email = new enviarEmail();  
		email.setaParametrosEmail(enviaremail);     
}
	
	
}

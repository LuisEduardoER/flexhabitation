package br.com.jfrootmaster.utilitarios;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Marcelo de Francisco
 *
 * Esta classe fornece um m�todo para criptografar uma mensagem utilizando 
 * o algoritmo de hash MD5 para criptografar. Este algoritmo � o mesmo utilizado no
 * tomcat para descriptografar a mensagem.
 */

public final class Cryptography {

	/**
	 * Realiza a criptografia retornando uma String atrav�s do algoritmo MD5
	 * @param senha - O string a ser criptografada
	 * @return String - O resultado da criptografia
	 * @throws NoSuchAlgorithmException - Ser� lan�ado se o algoritmo fornecido n�o
	 * for v�lido
	 */
	public static String encrypt (String senha) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
	    String s = hash.toString(16);
	    if (s.length() %2 != 0)
	        s = "0" + s;
	    return s;
	}

}

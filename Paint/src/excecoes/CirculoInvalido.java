package excecoes;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar por um n�mero negativo no raio
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */

import java.awt.Color;

public class CirculoInvalido extends Exception {

	/**
	 * vraio receber� o valor do raio do c�rculo
	 */
	String vraio;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui raio � vraio
	 * @param raio recebe o raio do c�rculo
	 */
	public CirculoInvalido(String raio) {
		super();
		vraio=raio;
	}
	
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Deixe o valor das seguintes coisas maior que 0 para continuar: ");
		if(Integer.parseInt(vraio)<=0) {
			erro.append(" |Raio| ");
		}
		return erro.toString();
		
	}
}

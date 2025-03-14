package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar criar um c�rculo raio ou cor vazia
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class CirculoVazio extends Exception {
	
	/**
	 * vraio reber� o valor do raio
	 * vc receber� a cor do c�rculo
	 */
	String vraio;
	Color vc;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui cor � vcor e raio � vraio
	 * @param raio recebe o valor de raio
	 * @param cor recebe a cor do c�rculo
	 */
	public CirculoVazio(Color cor,String raio) {
		super();
		vraio=raio;
		vc=cor;
	}
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Preencha os seguintes valores para criar seu C�rculo: ");
		if(vraio.equals("")) {
			erro.append(" |Raio| ");
		}
		if(vc==null) {
			erro.append(" |Cor| ");
		}
		return erro.toString();
		
	}
}

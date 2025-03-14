package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e é uma exceção criada para ser lançada ao tentar criar um círculo raio ou cor vazia
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class CirculoVazio extends Exception {
	
	/**
	 * vraio reberá o valor do raio
	 * vc receberá a cor do círculo
	 */
	String vraio;
	Color vc;
	
	/**
	 * Construtor padrão para classes que extendem Exception e além disso atribui cor à vcor e raio à vraio
	 * @param raio recebe o valor de raio
	 * @param cor recebe a cor do círculo
	 */
	public CirculoVazio(Color cor,String raio) {
		super();
		vraio=raio;
		vc=cor;
	}
	/**
	 * Forma a mensagem à ser mandada pelo erro dependendo dos valores que estão dando erro
	 * @return Mensagem à ser mostrada para o usuário em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Preencha os seguintes valores para criar seu Círculo: ");
		if(vraio.equals("")) {
			erro.append(" |Raio| ");
		}
		if(vc==null) {
			erro.append(" |Cor| ");
		}
		return erro.toString();
		
	}
}

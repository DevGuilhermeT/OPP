package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar por um n�mero negativo na base ou na altura
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class RetanguloInvalido extends Exception {

	/**
	 * valtura receber� o valor da altura do ret�ngulo
	 * vbase receber� o valor da base do ret�ngulo
	 */
	String valtura,vbase;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui altura � valtura e base � vbase
	 * @param altura recebe a altura do ret�ngulo
	 * @param base recebe a base do ret�ngulo
	 */
	public RetanguloInvalido(String altura, String base) {
		super();
		valtura=altura;
		vbase=base;
	}
	
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Deixe o valor das seguintes coisas maior que 0 para continuar: ");
		if(Integer.parseInt(vbase)<=0) {
			erro.append(" |Base| ");
		}if(Integer.parseInt(valtura)<=0) {
			erro.append(" |Altura| ");
		}
		return erro.toString();
		
	}
}

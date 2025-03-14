package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar criar um ret�ngulo com altura, base ou cor vazia
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class RetanguloVazio extends Exception {
	
	/**
	 * valtura receber� o valor da altura do tri�ngulo
	 * vbase receber� o valor da base do tri�ngulo
	 * vc receber� a cor do tri�ngulo
	 */
	String valtura,vbase;
	Color vc;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui cor � vcor, altura � valtura e base � vbase
	 * @param altura recebe a altura do ret�ngulo
	 * @param base recebe a base do ret�ngulo
	 * @param cor recebe a cor do ret�ngulo
	 */
	public RetanguloVazio(Color cor, String altura,String base) {
		super();
		valtura=altura;
		vbase=base;
		vc=cor;
	}
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Preencha os seguintes valores para criar seu Ret�ngulo: ");
		if(valtura.equals("")) {
			erro.append(" |Altura| ");
		}
		if(vbase.equals("")) {
			erro.append(" |Base| ");
		}
		if(vc==null) {
			erro.append(" |Cor| ");
		}
		return erro.toString();
		
	}
}

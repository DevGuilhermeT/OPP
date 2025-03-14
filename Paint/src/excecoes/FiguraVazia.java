package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar criar uma figura com posi��o x, posi��o y ou cor vazia
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class FiguraVazia extends Exception {
	
	/**
	 * vx receber� o valor da posi��o x
	 * vy receber� o valor da posi��o y
	 * vc receber� a cor
	 */
	String vx,vy;
	Color vc;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui cor � vcor, posi��o x � vx e posi��o y � vy
	 * @param x recebe a posi��o x da figura
	 * @param y recebe a posi��o y da figura
	 * @param cor recebe a cor da figura
	 */
	public FiguraVazia(String x, String y,Color cor) {
		super();
		vx=x;
		vy=y;
		vc=cor;
	}
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Preencha os seguintes valores para criar sua Figura: ");
		if(vx.equals("")) {
			erro.append(" |X| ");
		}
		if(vy.equals("")) {
			erro.append(" |Y| ");
		}
		if(vc==null) {
			erro.append(" |Cor| ");
		}
		return erro.toString();
		
	}
	
}
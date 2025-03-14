package excecoes;

import java.awt.Color;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao tentar por um n�mero negativo na Posi��o X ou na Posi��o Y
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class FiguraInvalida extends Exception {
	
	/**
	 * vx receber� o valor da posi��o x
	 * vy receber� o valor da posi��o y
	 */
	int vx,vy;
	
	/**
	 * Construtor padr�o para classes que extendem Exception e al�m disso atribui x � vx e y � vy
	 * @param vx recebe a posi��o x da figura
	 * @param vy recebe a posi��o y da figura
	 */
	public FiguraInvalida(String x,String y) {
		super();
		vx=Integer.parseInt(x);
		vy=Integer.parseInt(y);
	}
	
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Deixe o valor das seguintes coisas maior que 0 para continuar: ");
		if(vx<=0) {
			erro.append(" |X| ");
		}if(vy<=0) {
			erro.append(" |Y| ");
		}
		return erro.toString();
		
	}
}

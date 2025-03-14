package excecoes;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao clicar na tela e n�o ter selecionado nenhuma figura antes
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class BotaoFiguraDeselecionado extends Exception {
	
	/**
	 * Construtor padr�o para classes que extendem Exception
	 */
	public BotaoFiguraDeselecionado(){
		super();
	}
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Selecione uma figura para ser criada");
		return erro.toString();
		
	}
}

package excecoes;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao clicar no bot�o de limpar e a lista estar vazia
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class ListaVazia extends Exception {

	/**
	 * Construtor padr�o para classes que extendem Exception
	 */
	public ListaVazia() {
		super();
	}
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("A lista est� vazia, logo, j� est� limpa.");
		return erro.toString();
		
	}
}

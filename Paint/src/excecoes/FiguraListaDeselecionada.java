package excecoes;

/**
 * Essa classe extende Exception e � uma exce��o criada para ser lan�ada ao clicar em um bot�o de mudan�a da lista sem clicar em nenhuma figura da lista
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class FiguraListaDeselecionada extends Exception {
	
	/**
	 * Construtor padr�o para classes que extendem Exception
	 */
	public FiguraListaDeselecionada(){
		super();
	}
	/**
	 * Forma a mensagem � ser mandada pelo erro dependendo dos valores que est�o dando erro
	 * @return Mensagem � ser mostrada para o usu�rio em caso de erro
	 */
	public String getMessage() {
		StringBuffer erro = new StringBuffer();
		erro.append("Selecione uma figura da lista para proceder com essa a��o");
		return erro.toString();
		
	}
}

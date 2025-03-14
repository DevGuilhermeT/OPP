package formas;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

import excecoes.TrianguloInvalido;
import excecoes.TrianguloVazio;

/**
 * Triangulo � uma classe que extende Figura2D e serve para cria��o de tri�ngulos
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 *
 */
public class Triangulo extends Figura2D
{
	/**
	 * base � a base do ret�ngulo
	 * altura � a altura do ret�ngulo
	 */
	private int base;
	private int altura;
	    
	/**
     * Construtor do tri�ngulo que trata das exce��es TrianguloVazio, TrianguloVazio, NumberFormatException a fim dos valores recebidos serem validos de todas as maneiras
     * @param cor recebe uma cor
     * @param px  recebe o valor da posi��o X
     * @param py  recebe o valor da posi��o Y
     * @param base  recebe o valor da base
     * @param altura  recebe o valor da altura
     */
	public Triangulo(Color cor, String px, String py, String base, String altura){
		super(cor, px, py);
        try {
        	if(base.equals("") || cor==null || altura.equals("")) {
        		throw new TrianguloVazio(cor,altura,base);
        	}
        	if(Integer.parseInt(base)<=0 || Integer.parseInt(altura)<=0) {
        		throw new TrianguloInvalido(altura,base);
        	}
        	this.base=Integer.parseInt(base);
        	this.altura=Integer.parseInt(altura);
        }catch(NumberFormatException nfe) {
        	JOptionPane.showMessageDialog(null, "Utilize somente n�meros nos campos","ERRO",JOptionPane.ERROR_MESSAGE);
        }catch (TrianguloVazio v) {
        	JOptionPane.showMessageDialog(null, v.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }catch(TrianguloInvalido ci) {
        	JOptionPane.showMessageDialog(null, ci.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
	}
	/**
     * M�todo que calcula a �rea do tri�ngulo
     * @return �rea do tri�ngulo
     */
	public double area(){
	    return (base*altura)/2;
	}
	    
	/**
     * Modifica o toString do tri�ngulo
     * @return informa��es do tri�ngulo
     */
	public String toString(){
	        
            StringBuffer Buffer = new StringBuffer();
        
            Buffer.append("Tri�ngulo\n");
            Buffer.append("| Cor: ");
            Buffer.append(this.getCor());
            Buffer.append("\n| �rea: ");
            Buffer.append(this.area());
            Buffer.append("\n| Base: ");
            Buffer.append(this.base);
            Buffer.append("\n| Altura: ");
            Buffer.append(this.altura);
            Buffer.append("\n| Px: ");
            Buffer.append(this.x);
            Buffer.append("\n| Py: ");
            Buffer.append(this.y);
            Buffer.append(" \n");
         
            return Buffer.toString();
    }
	/**
     * Retorna o valor da base do tri�ngulo
     * @param base valor da base
     */
        public int getBase() {
		return base;
	}

    /**
    * Atribui o valor da base da figura
    * @param base valor da base
    */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * Retorna o valor da altura
	 * @return valor da altura do ret�ngulo
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Atribui o valor da altura do ret�ngulo
	 * @param altura valor da altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * M�todo para desenhar o ret�ngulo
	 * @param g � um Graphics para desenho do ret�ngulo
	 */
		public void desenhar (Graphics g){
        	g.setColor(cor);
            g.fillPolygon(new int[] {x-base/2,x,x+base/2}, new int[] {y+altura/2,y-altura/2,y+altura/2}, 3);
        }
}

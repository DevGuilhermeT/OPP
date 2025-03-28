package formas;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.math.*;

import javax.swing.JOptionPane;

import excecoes.CirculoInvalido;
import excecoes.FiguraInvalida;
import excecoes.FiguraVazia;

/**
 * Figura2D � uma classe m�e que serve como base para figuras
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 *
 */
public abstract class Figura2D implements Serializable
{
	/**
	 * cor recebe uma Cor
	 * x recebe o valor da posi��o X
	 * y recebe o valor da posi��o Y
	 */
	protected Color cor;
	protected int x;
	protected int y;
	
	/**
	 * M�todo abstrato que calcular� a �rea da figura
	 * @return �rea da figura como um Double
	 */
    public abstract double area();  
    
    /**
     * Construtor de uma figura que trata exce��es FiguraVazia, FiguraInvalida e NumberFormatException a fim dos valores recebidos serem v�lidos de todas as maneiras
     * @param cor recebe uma cor
     * @param x	  recebe o valor da posi��o x
     * @param y	  recebe o valor da posi��o y
     */
    public Figura2D(Color cor, String x, String y){

        try {
        	if(x.contentEquals("")|| y.contentEquals("") || cor==null) {
        		throw new FiguraVazia(x,y,cor);
        	}
        	if(Integer.parseInt(x)<=0 || Integer.parseInt(y)<=0) {
        		throw new FiguraInvalida(x,y);
        	}
        	this.cor = cor;
        	this.x = Integer.parseInt(x);
        	this.y = Integer.parseInt(y);
        }catch(NumberFormatException nfe) {
        	JOptionPane.showMessageDialog(null, "Utilize somente n�meros nos campos","ERRO",JOptionPane.ERROR_MESSAGE);
        }catch (FiguraVazia fv) {
        	JOptionPane.showMessageDialog(null, fv.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }catch (FiguraInvalida fi) {
        	JOptionPane.showMessageDialog(null, fi.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
	/**
	 * @return o x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return o y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param x atribui o X
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @param y atribui o Y
	 */
	public void setY(int y) {
		this.y = y;
	}
    
	/**
	 * @return cor
	 */
	public Color getCor() {
		return cor;
	}
	/**
	 * @param cor atribui a cor
	 */
	public void setCor(Color cor) {
		this.cor = cor;
	}
	/**
	 * M�todo abstrato para desenhar as figuras
	 * @param g Graphics para desenhar as figuras
	 */
        public abstract void desenhar(Graphics g);
    
}

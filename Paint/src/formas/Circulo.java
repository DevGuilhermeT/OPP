package formas;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

import excecoes.CirculoInvalido;
import excecoes.CirculoVazio;

/**
 * Circulo � uma classe que extende Figura2D e serve para cria��o de c�rculos
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 *
 */
public class Circulo extends Figura2D
{
	/**
	 * raio se refere ao raio do c�rculo
	 */
	  private int raio;
	    
	  /**
	   * Construtor da figura c�rculo que trata exce��es CirculoVazia, CirculoInvalido e NumberFormatException a fim dos valores recebidos serem v�lidos de todas as maneiras
	   * @param cor recebe uma cor
	   * @param px recebe o valor da posi��o X
	   * @param py recebe o valor da posi��o Y
	   * @param raio recebe o valor do raio
	   */
	    public Circulo(Color cor, String px, String py, String raio){
	        super(cor, px, py);
	        try {
	        	if(raio.equals("") || cor==null) {
	        		throw new CirculoVazio(cor,raio);
	        	}
	        	if(Integer.parseInt(raio)<=0) {
	        		throw new CirculoInvalido(raio);
	        	}
	        	this.raio=Integer.parseInt(raio);
	        }catch(NumberFormatException nfe) {
	        	JOptionPane.showMessageDialog(null, "Utilize somente n�meros nos campos","ERRO",JOptionPane.ERROR_MESSAGE);
	        }catch (CirculoVazio v) {
	        	JOptionPane.showMessageDialog(null, v.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
	        }catch(CirculoInvalido ci) {
	        	JOptionPane.showMessageDialog(null, ci.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    
	    /**
	     * @return valor da �rea do c�rculo
	     */
	    public double area(){
	        return Math.PI*Math.pow(raio, 2);
	    }
	    
	    /**
	     * 
	     * @return raio do c�rculo
	     */
	    public int getRaio() {
			return raio;
		}
	    
	    /**
	     * 
	     * @param raio se refere ao raio do c�rculo
	     */
		public void setRaio(int raio) {
			this.raio = raio;
		}
		
		/**
		 * M�todo para mudar o toString do c�rculo para mostrar as informa��es
		 * @return informa��es do c�rculo
		 */
		public String toString(){
	        
                StringBuffer Buffer = new StringBuffer();
        
                Buffer.append("C�rculo\n");
                Buffer.append("| Cor: ");
                Buffer.append(this.getCor());
                Buffer.append("\n| �rea: ");
                Buffer.append(this.area());
                Buffer.append("\n| Raio: ");
                Buffer.append(this.raio);
                Buffer.append("\n| Px: ");
                Buffer.append(this.x);
                Buffer.append("\n| Py: ");
                Buffer.append(this.y);
                Buffer.append(" \n");
         
                return Buffer.toString();
            }
            
		/**
		 * M�todo para desenho do c�rculo
		 * @param g � um Graphics para desenho no painel
		 */
            public void desenhar(Graphics g){
               g.setColor(cor);
               g.fillOval(x-raio/2, y-raio/2,raio, raio);
            }
}

package paint;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dialogs.JDialogCirculo;
import dialogs.JDialogRetangulo;
import dialogs.JDialogTriangulo;
import excecoes.BotaoFiguraDeselecionado;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * MeuPainel � uma classe que extende JPanel e serve para utilizar fun��es pr�prias para essa painel que n�o s�o apresentados num JPanel comum
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 */
public class MeuPainel extends JPanel {

	/**
	 * px receber� o valor de x
	 * py receber� o valor de y
	 * formaPainel receber� um valor diferente dependendo da figura selecionada para cria��o da mesma. Come�a com 1 que n�o representa nenhuma figura implementada
	 * painel receber� um MeuPainel
	 * editor receber� um editor
	 * lista receber� uma list do tipo DefaultListModel
	 * br receber� o estado do bot�o ret�ngulo
	 * bt receber� o estado do bot�o tri�ngulo
	 * bc receber� o estado do bot�o c�rculo
	 */
	private int px;
	private int py;
	private int formaPainel=1;
	private MeuPainel painel;
	private Editor editor;
	private DefaultListModel lista;
	private boolean br,bt,bc;
	
	public MeuPainel() {
		setPreferredSize(new Dimension(5000,5000));
		addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Esse m�todo chamar� o dialog correto para a cria��o da figura desejada e chama BotaoFiguraDeselecionado caso tente criar um figura sem nenhum bot�o selecionado
			 * As posi��es x e y ser�o atribuidas pelo clique na tela
			 * @param e recebe o x e y do clique em tela 
			 */
			public void mouseClicked(MouseEvent e) {
				try {
					px=e.getX();
					py=e.getY();
					
					System.out.println(formaPainel);
					System.out.println(bt);
					System.out.println(br);
					System.out.println(bc);
					if(bt==false && br==false && bc==false) {
						throw new BotaoFiguraDeselecionado();
					}
					switch (formaPainel) {
					case 4:
						JDialogRetangulo jdr = new JDialogRetangulo(px,py,editor,painel,lista);
						jdr.setVisible(true);
						break;
					case 3:
						JDialogTriangulo jdt = new JDialogTriangulo(px,py,editor,painel,lista);
						jdt.setVisible(true);
						break;
					
					case 0:
						JDialogCirculo jdc = new JDialogCirculo(px,py,editor,painel,lista);
						jdc.setVisible(true);
						break;
					}
					painel.repaint();
				}catch(BotaoFiguraDeselecionado bfd) {
					JOptionPane.showMessageDialog(null, bfd.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
	/**
	 * Esse m�todo � sobrescrito  do JPanel e chamar� o desenhar do editor
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		editor.desenhar(g);		
	}
	/**
	 * Atribui o valor de formaPainel para cria��o da figura
	 * @param formaDesejada recebe o "c�digo" para cria��o da figura desejada
	 * @param br estado do bot�o ret�ngulo
	 * @param bt estado do bot�o tri�ngulo
	 * @param bc estado do bot�o c�rculo
	 */
	public void setFormaPainel(int formaDesejada, boolean br,boolean bt, boolean bc) {
		this.formaPainel=formaDesejada;
		this.br=br;
		this.bc=bc;
		this.bt=bt;
	}
	/**
	 * M�todo para passagem de refer�ncia para implementa��o de outros m�todos no MeuPainel
	 * @param editor recebe um editor
	 * @param painel recebe um MeuPainel
	 * @param lista recebe uma DefaultListModel
	 */
	public void passagem (Editor editor, MeuPainel painel, DefaultListModel lista ) {
		this.editor=editor;
		this.painel=painel;
		this.lista=lista;
	}
}

package dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import formas.Figura2D;
import formas.Retangulo;
import formas.Triangulo;
import paint.Editor;
import paint.MeuPainel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * JDialogEditTriangulo � uma classe que extende JDialog e � chamada para abrir a tela de edi��o do tri�ngulo
 * @author Eduardo Amorim dos Santos Araujo
 * @author Guilherme Trindade Souza
 *
 */
public class JDialogEditTriangulo extends JDialog {
	/**
	 * cor receber� a nova cor
	 * textField receber� o novo X
	 * textField_1 receber� o novo Y
	 * textField_2 receber� a nova base
	 * textField_3 receber� a nova altura
	 */
	private final JPanel contentPanel = new JPanel();
	private Color cor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public JDialogEditTriangulo(MeuPainel painel, Editor editor, DefaultListModel lista, int posicao) {
		Triangulo tVelho = (Triangulo) lista.get(posicao);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPosioX = new JLabel("Posi��o X: ");
			lblPosioX.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblPosioX.setBounds(10, 10, 93, 20);
			contentPanel.add(lblPosioX);
		}
		{
			JLabel lblPosioY = new JLabel("Posi��o Y:  ");
			lblPosioY.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblPosioY.setBounds(10, 40, 93, 20);
			contentPanel.add(lblPosioY);
		}
		{
			JLabel lblBase = new JLabel("Base:  ");
			lblBase.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblBase.setBounds(10, 70, 93, 20);
			contentPanel.add(lblBase);
		}
		{
			JLabel lblAltura = new JLabel("Altura: ");
			lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblAltura.setBounds(10, 100, 93, 20);
			contentPanel.add(lblAltura);
		}
		{
			JLabel lblCor = new JLabel("Cor:  ");
			lblCor.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCor.setBounds(10, 130, 93, 20);
			contentPanel.add(lblCor);
		}
		{
			JLabel lblXAntigo = new JLabel("X Antigo: ");
			lblXAntigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblXAntigo.setBounds(220, 10, 93, 20);
			contentPanel.add(lblXAntigo);
		}
		{
			JLabel lblYAntigo = new JLabel("Y Antigo: ");
			lblYAntigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblYAntigo.setBounds(220, 40, 93, 20);
			contentPanel.add(lblYAntigo);
		}
		{
			JLabel lblBaseAntigo = new JLabel("Base Antigo:");
			lblBaseAntigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblBaseAntigo.setBounds(220, 70, 93, 20);
			contentPanel.add(lblBaseAntigo);
		}
		{
			JLabel lblNewLabel = new JLabel("Altura A. : ");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(220, 100, 93, 19);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblCorAntiga = new JLabel("Cor Antiga: ");
			lblCorAntiga.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCorAntiga.setBounds(220, 130, 93, 20);
			contentPanel.add(lblCorAntiga);
		}
		{
			textField = new JTextField();
			textField.setBounds(95, 10, 96, 19);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(95, 39, 96, 19);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(95, 70, 96, 19);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(95, 100, 96, 19);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblNovaCor = new JLabel("Nova Cor");
			lblNovaCor.setForeground(Color.BLACK);
			lblNovaCor.setBackground(Color.GRAY);
			lblNovaCor.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNovaCor.setBounds(95, 160, 96, 20);
			contentPanel.add(lblNovaCor);
		
		
			JButton btnEscolhaCor = new JButton("Escolher Cor");
			btnEscolhaCor.addActionListener(new ActionListener() {
				/**
				 * Atribuir uma cor pelo JColorChooser para a vari�vel cor
				 * @param e se refere ao clique no bot�o "Escolher Cor"
0				 */
				public void actionPerformed(ActionEvent e) {
					cor= JColorChooser.showDialog(JDialogEditTriangulo.this, "Escolha uma cor", cor);
					lblNovaCor.setText(toHexString(cor));
				}
			});
			btnEscolhaCor.setBounds(95, 130, 96, 21);
			contentPanel.add(btnEscolhaCor);
		}
		{
			/**
			 * Se refere ao valor antigo de X
			 */
			String vx = String.valueOf(tVelho.getX());
			JLabel lblNewLabel_1 = new JLabel(vx);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(323, 10, 93, 19);
			contentPanel.add(lblNewLabel_1);
		}
		{
			/**
			 * Se refere ao valor antigo de Y
			 */
			String vy = String.valueOf(tVelho.getY());
			JLabel label1 = new JLabel(vy);
			label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label1.setBounds(323, 41, 93, 19);
			contentPanel.add(label1);
		}
		{
			/**
			 * Se refere ao valor antigo de Base
			 */
			String vbase = String.valueOf(tVelho.getBase());
			JLabel label2 = new JLabel(vbase);
			label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label2.setBounds(323, 71, 93, 19);
			contentPanel.add(label2);
		}
		{
			/**
			 * Se refere ao valor antigo de Altura
			 */
			String valtura = String.valueOf(tVelho.getAltura());
			JLabel label3 = new JLabel(valtura);
			label3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label3.setBounds(323, 100, 93, 19);
			contentPanel.add(label3);
		}
		{
			/**
			 * Se refere ao valor antigo de Cor
			 */
			String vcor = String.valueOf(toHexString(tVelho.getCor()));
			JLabel label4 = new JLabel(vcor);
			label4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label4.setBounds(323, 130, 93, 19);
			contentPanel.add(label4);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					/**
					 * Esse m�todo editar� um tri�ngulo ja criado
					 * A figura s� ser� adicionada na lista se a base, altura, a posi��o x e a y  forem maiores que 0, para garantir que s� sejam, adicionadas figuras v�lidas
					 * @param e se refere ao clique no bot�o "OK"
					 */
					public void actionPerformed(ActionEvent e) {
						Triangulo t = new Triangulo (cor,textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText());
						if(t.getAltura()>0 && t.getBase()>0 && !cor.equals("") && t.getX()>0 && t.getY()>0) {
							editor.rmFigura((Figura2D) lista.get(posicao));
							lista.remove(posicao);
							editor.addFiguraPosicao(t, posicao);
							lista.add(posicao, t);
							painel.repaint();
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					/**
					 * Fecha o JDialog 
					 * @param e se refere ao clique no bot�o "Cancel"
					 */
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	/**
	 * Tem como serventia transformar o c�digo de uma cor de RGB para hexadecimal
	 * @param c recebe uma cor
	 * @return o c�digo de uma cor em hexadecimal
	 * @throws NullPointerException
	 */
	public String toHexString(Color c) throws NullPointerException{
        String hex = Integer.toHexString(c.getRGB() & 0xffffff);

        if(hex.length() < 6) {
            hex = "000000".substring(0, 6-hex.length()) + hex;
        }


        return "#"+hex;
    }
}

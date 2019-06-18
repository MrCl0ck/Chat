package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelConversa extends JPanel {
	private JPanel panelSuperior;
	private JPanel panelInferior;
	private JTextArea fieldMensagem;
	private JButton botaoEnviar;
	private JButton botaoVoltar;
	private JLabel labelNome;
	private JScrollPane scrollCampoMensagem;
	
	public PanelConversa() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.add(getPanelSuperior());
		this.add(getPanelInferior());
	}
	
	public JPanel getPanelSuperior() {
		if(panelSuperior == null) {
			panelSuperior = new JPanel();
			panelSuperior.setBackground(Color.DARK_GRAY);
			panelSuperior.setLayout(null);
			panelSuperior.setBounds(200, 0, 700, 50);
			panelSuperior.add(getBotaoVoltar());
			panelSuperior.add(getLabelNome());
		}
		return panelSuperior;
	}
	
	public void setPanelSuperior(JPanel panelSuperior) {
		this.panelSuperior = panelSuperior;
	}

	public JPanel getPanelInferior() {
		if(panelInferior == null) {
			panelInferior = new JPanel();
			panelInferior.setBackground(Color.DARK_GRAY);
			panelInferior.setLayout(null);
			panelInferior.setBounds(200, 475, 700, 100);
			//panelInferior.add(getFieldMensagem());
			panelInferior.add(getBotaoEnviar());
			panelInferior.add(getFieldMensagem());
			//panelInferior.add(getScrollCampoMensagem());
		}
		return panelInferior;
	}

	public void setPanelInferior(JPanel panelInferior) {
		this.panelInferior = panelInferior;
	}
	
	public JTextArea getFieldMensagem() {
		if(fieldMensagem == null) {
			fieldMensagem = new JTextArea();
			fieldMensagem.setBounds(10, 10, 600, 70);
			fieldMensagem.setColumns(10);
			fieldMensagem.setText("Digite uma mensagem");
			fieldMensagem.setFont(new Font("",Font.ITALIC, 12));
			fieldMensagem.setLineWrap(true);//Permite a quebra de linha ao digitar um caractere no limite do campo.
		}
		return fieldMensagem;
	}

	public void setFieldMensagem(JTextArea textField) {
		this.fieldMensagem = textField;
	}

	public JButton getBotaoEnviar() {
		if(botaoEnviar == null) {
			botaoEnviar = new JButton(">");
			botaoEnviar.setFont(new Font("", Font.BOLD, 15));
			botaoEnviar.setBounds(619, 8, 51, 23);
			botaoEnviar.setBackground(Color.LIGHT_GRAY);
			botaoEnviar.setForeground(Color.BLACK);
		}
		return botaoEnviar;
	}

	public void setBotaoEnviar(JButton botaoEnviar) {
		this.botaoEnviar = botaoEnviar;
	}

	public JButton getBotaoVoltar() {
		if(botaoVoltar == null) {
			botaoVoltar = new JButton("Voltar");
			//botaoVoltar = new JButton(new ImageIcon(getClass().getResource("setaVoltar - Cópia.png")));
			//botaoVoltar.setText(getLabelSetaVoltar());
			botaoVoltar.setFont(new Font("Tahoma", Font.BOLD, 10));
			botaoVoltar.setForeground(Color.WHITE);
			botaoVoltar.setFocusPainted(false);//Tira o foco do botão.
			botaoVoltar.setContentAreaFilled(false);//Deixa o botão Transparente.
			//botaoVoltar.setBorderPainted(false);//Deixa a borda do botão invisível.
			botaoVoltar.setBounds(10, 11, 70, 32);
		}
		return botaoVoltar;
	}

	public void setBotaoVoltar(JButton botaoVoltar) {
		this.botaoVoltar = botaoVoltar;
	}

	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel("Nome do Contato");
			labelNome.setBounds(120, 14, 400, 20);
			labelNome.setFont(new Font("Tahoma", Font.BOLD, 18));
			labelNome.setForeground(Color.WHITE);
		}
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JScrollPane getScrollCampoMensagem() {
		if(scrollCampoMensagem == null) {
			scrollCampoMensagem = new JScrollPane(getFieldMensagem());
		}
		return scrollCampoMensagem;
	}

	public void setScrollCampoMensagem(JScrollPane scrollCampoMensagem) {
		this.scrollCampoMensagem = scrollCampoMensagem;
	}
}
package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JList;
//import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelConversa extends JPanel {
	private JPanel panelSuperior;
	private JPanel panelInferior;
	private JTextArea fieldMensagem;
	private JButton botaoEnviar;
	private JLabel labelNome;
	private JScrollPane scrollCampoMensagem;
	private JPanel panelEsquerda;
	private JPanel panelContato;
	private JLabel lblNomesCont;
	private JButton btnAdicionarContato;
	private JPanel panelDireita;
	private JList list;
	private JList list2;
	private JScrollPane sclpan;
	private JScrollPane sclpan2;
	
	public PanelConversa() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		add(getPanelEsquerda());
		add(getPanelDireita());
	}
	
	public JPanel getPanelSuperior() {
		if(panelSuperior == null) {
			panelSuperior = new JPanel();
			panelSuperior.setBounds(0, 0, 703, 33);
			panelSuperior.setBackground(Color.DARK_GRAY);
			panelSuperior.setLayout(null);
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
			panelInferior.setBounds(0, 492, 703, 100);
			panelInferior.setBackground(Color.DARK_GRAY);
			panelInferior.setLayout(null);
			panelInferior.add(getFieldMensagem());
			panelInferior.add(getBotaoEnviar());
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
			botaoEnviar = new JButton("");
			botaoEnviar.setBounds(620, 10, 73, 70);
			botaoEnviar.setIcon(new ImageIcon(PanelConversa.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/enter-icon.png")));
			botaoEnviar.setFont(new Font("", Font.BOLD, 15));
			botaoEnviar.setBackground(Color.DARK_GRAY);
			botaoEnviar.setForeground(Color.BLACK);
		}
		return botaoEnviar;
	}

	public void setBotaoEnviar(JButton botaoEnviar) {
		this.botaoEnviar = botaoEnviar;
	}

	public void setBotaoVoltar(JButton botaoVoltar) {
		//this.botaoVoltar = botaoVoltar;
	}

	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel("Nome do Contato");
			labelNome.setBounds(294, 11, 121, 16);
			labelNome.setFont(new Font("Tahoma", Font.BOLD, 13));
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
	private JPanel getPanelEsquerda() {
		if (panelEsquerda == null) {
			panelEsquerda = new JPanel();
			panelEsquerda.setBorder(new LineBorder(Color.DARK_GRAY));
			panelEsquerda.setBounds(0, 0, 200, 592);
			panelEsquerda.setLayout(new BorderLayout(0, 0));
			panelEsquerda.add(getPanelContato(), BorderLayout.NORTH);
			panelEsquerda.add(getBtnAdicionarContato(), BorderLayout.SOUTH);
			panelEsquerda.add(getScrollpaneEsq(), BorderLayout.CENTER);
			
		}
		return panelEsquerda;
	}
	private JPanel getPanelContato() {
		if (panelContato == null) {
			panelContato = new JPanel();
			panelContato.setBackground(Color.DARK_GRAY);
			panelContato.setForeground(Color.BLACK);
			panelContato.add(getLblNomesCont());
		}
		return panelContato;
	}
	private JLabel getLblNomesCont() {
		if (lblNomesCont == null) {
			lblNomesCont = new JLabel("Contatos");
			lblNomesCont.setForeground(Color.WHITE);
			lblNomesCont.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblNomesCont;
	}
	private JButton getBtnAdicionarContato() {
		if (btnAdicionarContato == null) {
			btnAdicionarContato = new JButton("Adicionar contato");
			btnAdicionarContato.setIcon(new ImageIcon(PanelConversa.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-fewer-details.png")));
		}
		return btnAdicionarContato;
	}
	private JPanel getPanelDireita() {
		if (panelDireita == null) {
			panelDireita = new JPanel();
			panelDireita.setBorder(new LineBorder(new Color(64, 64, 64)));
			panelDireita.setBounds(200, 0, 703, 592);
			panelDireita.setLayout(null);
			panelDireita.add(getPanelSuperior());
			panelDireita.add(getPanelInferior());
			panelDireita.add(getScrollpaneDir());
		}
		return panelDireita;
	}
	private JList getListChat() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JScrollPane getScrollpaneDir() {
		if(sclpan == null) {
			sclpan = new JScrollPane();
			sclpan.setBounds(0, 33, 703, 460);
			sclpan.setViewportView(getListChat());
		}
		return sclpan;
	}
	
	private JList getListContatos() {
		if (list2 == null) {
			list2 = new JList();
		}
		return list2;
	}
	
	private JScrollPane getScrollpaneEsq() {
		if(sclpan2 == null) {
			sclpan2 = new JScrollPane();
			sclpan2.setViewportView(getListContatos());
			list.setBounds(0, 0, 196, 527);
		}
		return sclpan2;
	}
}
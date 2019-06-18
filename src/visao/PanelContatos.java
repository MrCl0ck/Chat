package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelContatos extends JPanel{
	private JPanel panelSuperior;
	private JButton botaoConversas;
	private JButton botaoContatos;
	private JLabel labelChat;
	
	public PanelContatos() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
	}

	public JPanel getPanelSuperior() {
		if(panelSuperior== null) {
			panelSuperior = new JPanel();
			panelSuperior.setBackground(Color.DARK_GRAY);
			panelSuperior.setLayout(null);
			panelSuperior.setSize(700, 100);
			panelSuperior.add(getLabelChat());
			panelSuperior.add(getBotaoConversas());
			panelSuperior.add(getBotaoContatos());
		}
		return panelSuperior;
	}

	public void setPanelSuperior(JPanel panelSuperior) {
		this.panelSuperior = panelSuperior;
	}

	public JButton getBotaoConversas() {
		if(botaoConversas == null) {
			botaoConversas = new JButton("Conversas");
			botaoConversas.setBounds(5, 74, 190, 23);
			botaoConversas.setBackground(Color.DARK_GRAY);
			botaoConversas.setFocusPainted(false);//Impede que o botão seja mostrado como foco.
			//botaoConversas.setOpaque(false);
			botaoConversas.setBorderPainted(false);//Torna a borda do botão invisível.
			botaoConversas.setContentAreaFilled(false);//Deixa o botão transparente.
			botaoConversas.setForeground(Color.WHITE);
		}
		return botaoConversas;
	}

	public void setBotaoConversas(JButton botaoConversas) {
		this.botaoConversas = botaoConversas;
	}

	public JButton getBotaoContatos() {
		if(botaoContatos == null) {
			botaoContatos = new JButton("Contatos");
			botaoContatos.setBounds(200, 74, 190, 23);
			//botaoContatos.setOpaque(false);
			botaoContatos.setFocusPainted(false);
			botaoContatos.setBorderPainted(false);
			botaoContatos.setContentAreaFilled(false);
			botaoContatos.setForeground(Color.LIGHT_GRAY);
		}
		return botaoContatos;
	}

	public void setBotãoContatos(JButton botaoContatos) {
		this.botaoContatos = botaoContatos;
	}

	public JLabel getLabelChat() {
		if(labelChat == null) {
			labelChat = new JLabel("Chat");
			labelChat.setForeground(Color.WHITE);
			labelChat.setFont(new Font("Miriam", Font.BOLD, 25));
			labelChat.setBounds(25, 29, 60, 25);
		}
		return labelChat;
	}

	public void setLabelChat(JLabel labelChat) {
		this.labelChat = labelChat;
	}
}
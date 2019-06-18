package visao;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Frame extends JFrame{
	private PanelContatos panelContatos = new PanelContatos();
	private PanelConversa panelConversa = new PanelConversa();
	
	public Frame() {
		super("Chat");
		repaint();
		validate();
		this.setResizable(false);
		this.setSize(900, 590);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.setContentPane(getPanelContatos());
		//this.add(getPanelContatos().getPanelSuperior());
		this.setContentPane(getPanelConversa());
		getContentPane().add(getPanelConversa().getPanelSuperior());
		getContentPane().add(getPanelConversa().getPanelInferior());
		//getContentPane().add(getPanelContatos().getPanelSuperior());
		getContentPane().setLayout(null);
	}

	public PanelContatos getPanelContatos() {
		return panelContatos;
	}

	public void setPanelContatos(PanelContatos panelContatos) {
		this.panelContatos = panelContatos;
	}
	
	public PanelConversa getPanelConversa() {
		return panelConversa;
	}
	
	public void setPanelConversa(PanelConversa panelConversa) {
		this.panelConversa = panelConversa;
	}
}

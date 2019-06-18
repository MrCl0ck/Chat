package controle;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.AncestorListener;

import visao.Frame;

public class ControladorPrincipal implements ActionListener {
	private static Frame frame;
	private VerificaFocusCampo verifica = new VerificaFocusCampo();
	private static boolean auxiliarLimpaCampo = false;
	
	public static void main(String[] args) {
		new ControladorPrincipal();
	}
	
	public ControladorPrincipal() {
		frame = new Frame();
		addEventos();
		verifica.start();
	}
	
	public void addEventos() {
		frame.getPanelContatos().getBotaoContatos().addActionListener(this);
		frame.getPanelContatos().getBotaoConversas().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(frame.getPanelContatos().getBotaoContatos())) {
			frame.getPanelContatos().getBotaoContatos().setForeground(Color.WHITE);
			frame.getPanelContatos().getBotaoConversas().setForeground(Color.LIGHT_GRAY);
		}
		
		else if(e.getSource().equals(frame.getPanelContatos().getBotaoConversas())) {
			frame.getPanelContatos().getBotaoConversas().setForeground(Color.WHITE);
			frame.getPanelContatos().getBotaoContatos().setForeground(Color.LIGHT_GRAY);
		}
		
	}
	
	public class VerificaFocusCampo extends Thread{
		public void run() {
			while(true) {
				if(frame.getPanelConversa().getFieldMensagem().isFocusOwner() == true && auxiliarLimpaCampo == false
						/*&& frame.getPanelConversa().getFieldMensagem().getText() == "Digite uma mensagem"*/) {
					frame.getPanelConversa().getFieldMensagem().setText("");
					frame.getPanelConversa().getFieldMensagem().setFont(new Font("",Font.PLAIN, 12));
					auxiliarLimpaCampo = true;
				}
				
				else if(frame.getPanelConversa().getFieldMensagem().isFocusOwner() == false && 
						frame.getPanelConversa().getFieldMensagem().getText() == (String) ""){
					frame.getPanelConversa().getFieldMensagem().setText("Digite uma mensagem");
					frame.getPanelConversa().getFieldMensagem().setFont(new Font("",Font.ITALIC, 12));
					auxiliarLimpaCampo = false;
				}
			}
		}
	}
}

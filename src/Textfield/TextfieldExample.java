package Textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextfieldExample extends JFrame {
	public JTextField  TXTF1;
	public JTextField  TXTF2;
	public JTextField  TXTF3;
	public JPasswordField PassF;
	TextfieldExample(){
		super("Testing TextField");
		setLayout(new FlowLayout());
		TXTF1 = new JTextField(10);
		add(TXTF1);
		TXTF2 = new JTextField("Enter Text Here: ");
		add(TXTF2);
		TXTF3 = new JTextField("Uneditable Text", 21);
		TXTF3.setEditable(false);
		add(TXTF3);
		PassF = new JPasswordField("Hidden Text");
		add(PassF);
		// EventHandle
		TextFieldHandler handler = new TextFieldHandler();
		TXTF1.addActionListener(handler);
		TXTF2.addActionListener(handler);
		TXTF3.addActionListener(handler);
		PassF.addActionListener(handler);
		
	}
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
		String s="";
		if(event.getSource()==TXTF1){
			s = String.format("TXTF1: %s",event.getActionCommand());
			
			
		}
		else
			if(event.getSource()==TXTF2){
				s = String.format("TXTF2: %s",event.getActionCommand());
			}
			else
				if(event.getSource()==TXTF3){
					s = String.format("TXTF3: %s",event.getActionCommand());
				}
				else
					if(event.getSource()==PassF){
						s = String.format("PassF: %s",event.getActionCommand());
					}
					JOptionPane.showMessageDialog(null, s);
			
		}
		
	}
	public static void main(String[] args){
		TextfieldExample example = new TextfieldExample();
		example.setVisible(true);
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setSize(350,100);
	}
	
	

}

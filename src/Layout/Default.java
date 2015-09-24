package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Default extends JFrame {
	Container container;
	JButton Btn;
	FlowLayout fc;
	Default(){
		super("yeah");
		setLayout(fc);
		Btn = new JButton("Yes");
		add(Btn);
		container = getContentPane();
		Btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fc.setAlignment(FlowLayout.CENTER);
				fc.layoutContainer(container);
				
			}
			
		});
	}
	public static void main(String[] args){
		Default dg = new Default();
		dg.setVisible(true);
		dg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		dg.setSize(120,30);
		
	}


}

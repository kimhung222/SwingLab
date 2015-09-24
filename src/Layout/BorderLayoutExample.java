package Layout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BorderLayoutExample extends JFrame {
String[] s ={"NORTH","SOUTH","EAST","WEST","CENTER"};
JButton[] buttons;
BorderLayout layout;


BorderLayoutExample(){
	super("Border Layout Example");
	layout = new BorderLayout(5, 5);
	setLayout(layout);
	ActionListener btnhandler = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			for(JButton button : buttons){
			if(e.getSource()==button){
				button.setVisible(false);
			}
			else
				button.setVisible(true);	
		}	
	}
};  

	buttons = new JButton[s.length];
	for(int i=0;i<s.length;i++){
		buttons[i] = new JButton("HIDE "+s[i]);
		buttons[i].addActionListener(btnhandler);
	}
	//add(buttons,BorderLayout.NORTH);
	add(buttons[0],BorderLayout.NORTH);
	add(buttons[1],BorderLayout.SOUTH);
	add(buttons[2],BorderLayout.EAST);
	add(buttons[3],BorderLayout.WEST);
	add(buttons[4],BorderLayout.CENTER);

	layout.layoutContainer(getContentPane());
}
public static void main(String[] args){
	BorderLayoutExample example = new BorderLayoutExample();
	example.setVisible(true);
	example.setDefaultCloseOperation(EXIT_ON_CLOSE);
	example.setSize(300,200);
}
}


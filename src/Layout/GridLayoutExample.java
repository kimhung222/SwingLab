package Layout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GridLayoutExample extends JFrame {
	private static String[] s ={"one","two","three","four","five","six"};
	private JButton[] buttons;
	private boolean toggle = true;
	private GridLayout layout1;
	private GridLayout layout2;
	private Container container;
	GridLayoutExample(){
		super("Grid Layout Example");
		container = getContentPane();
		layout1 = new GridLayout(2,2,5,5);
		layout2 = new GridLayout(2,4);
		//setLayout(layout1);
		//layout1.layoutContainer(container)
		container.setLayout(layout1);
		ActionListener ButtonHandler = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(toggle){
					container.setLayout(layout2);
				}
				else 
					container.setLayout(layout1);
				container.validate();
				toggle = !toggle;
			}
		};
		buttons = new JButton[s.length];
		for(int i=0;i<s.length;i++){
			buttons[i] = new JButton(s[i]);
			buttons[i].addActionListener(ButtonHandler);
			add(buttons[i]);
		}
		
	}
	public static void main(String[] args){
		GridLayoutExample example = new GridLayoutExample();
		example.setVisible(true);
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setSize(200,300);
	}

}

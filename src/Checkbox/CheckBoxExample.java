package Checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxExample extends JFrame {
	JTextField txtfield;
	JCheckBox cb1;
	JCheckBox cb2;
	CheckBoxExample(){
		super("Checkbox Example");
		setLayout(new FlowLayout());
		txtfield = new JTextField("This is Checkbox Example");
		txtfield.setFont(new Font("Serif",Font.PLAIN,14));
		txtfield.setEditable(false);
		add(txtfield);
		cb1 = new JCheckBox("Bold");
		cb2 = new JCheckBox("Italic");
		add(cb1);
		add(cb2);
		CheckboxHandler handler = new CheckboxHandler();
		cb1.addItemListener(handler);
		cb2.addItemListener(handler);
	}
	private class CheckboxHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub
			Font font = null;
			if(cb1.isSelected()){
				font = new Font("Serif",Font.BOLD,14);
				txtfield.setFont(font);
			}
			else 
				if(cb2.isSelected()){
					font = new Font("Serif",Font.ITALIC,14);
					txtfield.setFont(font);
				}
				else
					if(cb2.isSelected()&&cb1.isSelected()){
						font = new Font("Serif",Font.BOLD + Font.ITALIC,14);
					}
					else
						font = new Font("Serif",Font.PLAIN,14);
			            txtfield.setFont(font);
		}
		
	}
	public static void main(String[] args){
		CheckBoxExample example = new CheckBoxExample();
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setVisible(true);
		example.setSize(275,100);
	}
	
	
	

}

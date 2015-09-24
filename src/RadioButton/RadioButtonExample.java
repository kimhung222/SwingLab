package RadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class RadioButtonExample extends JFrame {
	Font font1;
	Font font2;
	Font font3;
	JRadioButton bolditalic;
	JRadioButton bold;
	JRadioButton italic;
	JTextField txtfield;
	ButtonGroup radiogroup;
	RadioButtonExample(){
		super("Radio Button Example");
		setLayout(new FlowLayout());
		txtfield = new JTextField("Can you relize my style ?");
		txtfield.setFont(new Font("Serif",Font.PLAIN,14));
		add(txtfield);
		bolditalic = new JRadioButton("BOLD AND ITALIC",false);
		bold = new JRadioButton("BOLD",false);
		italic = new JRadioButton("ITALIC",false);
		add(bold);
		add(bolditalic);
		add(italic);
		radiogroup = new ButtonGroup();
		radiogroup.add(bold);
		radiogroup.add(bolditalic);
		radiogroup.add(italic);
		font1 = new Font("Serif",Font.BOLD,14);
		font2 = new Font("Serif",Font.ITALIC,14);
		font3 = new Font("Serif",Font.BOLD+Font.ITALIC,14);
		RadioButtonHandler handler = new RadioButtonHandler();
		bold.addItemListener(handler);
		bolditalic.addItemListener(handler);
		italic.addItemListener(handler);	
	}
	private class RadioButtonHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
			if(bold.isSelected()){
				txtfield.setFont(font1);
			}
			else
				if(bolditalic.isSelected()){
					txtfield.setFont(font2);
				}
				else
					if(italic.isSelected()){
						txtfield.setFont(font3);
					} 
			
				} 
			
			
		}
	public static void main(String[] args){
		RadioButtonExample example = new RadioButtonExample();
		example.setVisible(true);
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setSize(300,100);
	}
		
	}

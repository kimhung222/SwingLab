package JComboBoxExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxExample extends JFrame {
	String[] names ={"1.jpg","1_2.jpg","1_3.jpg","1_4.jpg"};
	private Icon[] icon = { new ImageIcon(getClass().getResource(names[0])),new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),new ImageIcon(getClass().getResource(names[3]))};
	private JLabel label;
	private JComboBox Jbox;
	JComboBoxExample(){
	 super("ComboBox Example");
	 setLayout(new FlowLayout());
	 Jbox = new JComboBox(names );
	 Jbox.setMaximumRowCount(3);
	 Jbox.addItemListener(
			 new ItemListener(){

				@Override
				public void itemStateChanged(ItemEvent event) {
					// TODO Auto-generated method stub
					if(event.getStateChange()==ItemEvent.SELECTED){
						label.setIcon(icon[Jbox.getSelectedIndex()]);
					}				
				}
				
				
	 });
	 add(Jbox);
	 label = new JLabel(icon[0]);
	 add(label);
	
	
	}
	public static void main(String[] args){
		JComboBoxExample example = new JComboBoxExample();
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setVisible(true);
		example.setSize(350,150);
	}
	
}

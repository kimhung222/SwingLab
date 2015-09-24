package ListExample;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;


public class ListExample extends JFrame {
	private JList colorJList;// list to display colors
	private static final String[] colorNames = { "Black", "Blue", "Cyan",
		 "Dark Gray","Gray","Green","Light Gray","Magenta",
		 "Orange","Pink","Red", "White", "Yellow" };
		 private static final Color[] colors = { Color.BLACK, Color.BLUE,
        Color.CYAN, Color.DARK_GRAY, Color.GRAY,Color.GREEN,
		 Color.LIGHT_GRAY,Color.MAGENTA, Color.ORANGE, Color.PINK,
		 Color.RED, Color.WHITE, Color.YELLOW };
		 ListExample(){
			 super("JList Example");
			 setLayout(new FlowLayout());
			 colorJList = new JList(colorNames);
			 colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 add(new JScrollPane(colorJList));
			 colorJList.addListSelectionListener(new  ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);		
				}
			});
		 }
public static void main(String[] args){
	ListExample list = new ListExample();
	list.setDefaultCloseOperation(EXIT_ON_CLOSE);
	list.setVisible(true);
	list.setSize(350,150);
	}
}

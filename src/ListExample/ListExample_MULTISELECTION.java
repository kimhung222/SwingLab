package ListExample;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListExample_MULTISELECTION extends JFrame {
	private JList colorJList;// list to display colors
	private JList copyJList;
	private static final String[] colorNames = { "Black", "Blue", "Cyan",
		 "Dark Gray","Gray","Green","Light Gray","Magenta",
		 "Orange","Pink","Red", "White", "Yellow" };
		 private static final Color[] colors = { Color.BLACK, Color.BLUE,
        Color.CYAN, Color.DARK_GRAY, Color.GRAY,Color.GREEN,
		 Color.LIGHT_GRAY,Color.MAGENTA, Color.ORANGE, Color.PINK,
		 Color.RED, Color.WHITE, Color.YELLOW };
		 JButton choice;
		 ListExample_MULTISELECTION(){
			 super("JList Example WITH MULTISELECTION");
			 setLayout(new FlowLayout());
			 choice = new JButton("Add");
			 colorJList = new JList(colorNames);
			 colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			 colorJList.setVisibleRowCount(5);
			 add(new JScrollPane(colorJList)); 
			 colorJList.addListSelectionListener(new  ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
					getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);		
				}
			}); 
			 choice.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					copyJList.setListData(colorJList.getSelectedValues());
				}
				 
			 });
			 add(choice);
			 copyJList = new JList();
			 copyJList.setVisibleRowCount(5);
			 copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 copyJList.setFixedCellHeight(15);
			 copyJList.setFixedCellWidth(100);
			 add(copyJList);
			 add(new JScrollPane(copyJList));
		 }
public static void main(String[] args){
	ListExample_MULTISELECTION list = new ListExample_MULTISELECTION();
	list.setDefaultCloseOperation(EXIT_ON_CLOSE);
	list.setVisible(true);
	list.setSize(350,150);
	}
}

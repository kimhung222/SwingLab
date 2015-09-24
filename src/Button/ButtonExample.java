package Button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class ButtonExample extends JFrame {
	JButton PlainButton;
	JButton FancyButton;
	ButtonExample(){
		super("Button Example 1");
		setLayout(new FlowLayout());
		PlainButton = new JButton("Plain Button");
		add(PlainButton);
		FancyButton = new JButton("Fancy Button");
		Icon icon1 = new ImageIcon(getClass().getResource("1.jpg"));
		Icon icon2 = new ImageIcon(getClass().getResource("1_2.jpg"));
		FancyButton.setIcon(icon1);
		FancyButton.setRolloverIcon(icon2);
		add(FancyButton);
		ButtonHandler buttonhandler = new ButtonHandler();
		FancyButton.addActionListener(buttonhandler);
		PlainButton.addActionListener(buttonhandler);
	}
  private class ButtonHandler implements ActionListener{
	  public void actionPerformed(ActionEvent event){
		  JOptionPane.showMessageDialog(ButtonExample.this,String.format("You pressed: %s",event.getActionCommand()));
	  }
	  
  }
  public static void main(String[] args){
	  ButtonExample example1 = new ButtonExample();
	  example1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  example1.setVisible(true);
	  example1.setSize(275,110);
	  
  }
	

}

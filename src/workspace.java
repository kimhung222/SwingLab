import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class workspace extends JFrame {
	String a = " I am Batman";
	String b = " Oh Yeah!";
	JButton btn;
	JTextField txt;
	FlowLayout layout;
	workspace(){
		
		super(" TEST");
		btn = new JButton("Show me");
		txt = new JTextField("Tell me, Do you bleed ?");
		setLayout(new BorderLayout());
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,txt.getText());	
			}
		});
		txt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = e.getActionCommand();
				
			}
			
		});
		add(txt,BorderLayout.NORTH);
		add(btn,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		workspace ws = new workspace();
		ws.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ws.setVisible(true);
		ws.setSize(600,600);
	}

}

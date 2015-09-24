package Layout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample extends JFrame {
	JButton LEFT;
	JButton RIGHT;
	JButton CENTER;
	Container container;
	FlowLayout layout;
	public FlowLayoutExample(){
		super("Flow Layout Example");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		LEFT = new JButton("LEFT");
		LEFT.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
				
				
			}
			
		});
		RIGHT = new JButton("RIGHT");
		
		RIGHT.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
				
			}
			
		});
		CENTER = new JButton("CENTER");
		
		CENTER.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);	
			}	
		});	
		add(LEFT);
		add(RIGHT);
		add(CENTER);
	}
	
	public static void main(String[] args){
		FlowLayoutExample example = new FlowLayoutExample();
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setVisible(true);
		example.setSize(300,75);
		
	}
}

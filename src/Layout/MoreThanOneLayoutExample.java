package Layout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoreThanOneLayoutExample extends JFrame {
	private BorderLayout borderlayout;
	private FlowLayout flowlayout;
	private JButton[] buttons;
	private String[] s ={"A","ROW","AT","THE","BOTTOM"};
	private JPanel panel;
	Container container;
	public MoreThanOneLayoutExample() {
		// TODO Auto-generated constructor stub
		super(" More than One Layout Example");
		borderlayout = new BorderLayout(5,5);
		flowlayout = new FlowLayout();
		//flowlayout.setHgap(600);
		//flowlayout.setVgap(300);
		panel = new JPanel();
		panel.setLayout(flowlayout);
		setLayout(borderlayout);
		buttons = new JButton[s.length];
		for(int i=0;i<s.length;i++){
			buttons[i] = new JButton(s[i]);
			panel.add(buttons[i]);
		}
		add(panel, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args){
		//600300
		MoreThanOneLayoutExample example = new MoreThanOneLayoutExample();
		example.setVisible(true);
		example.setDefaultCloseOperation(EXIT_ON_CLOSE);
		example.setSize(300, 600);
	}

}

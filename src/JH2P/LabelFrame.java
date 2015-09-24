package JH2P;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.IconUIResource;

public class LabelFrame extends JFrame {
	JLabel label1;
	JLabel label2;
	JLabel label3;
	public LabelFrame(){
		super("First Swing Example");
		setLayout(new FlowLayout());
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label 1");
		add(label1);
		Icon Telerik = new ImageIcon(getClass().getResource("irelia-lol-fan-art-hd-wallpaper-penett-1920x1080.jpg"));
		label2 = new JLabel("Label with text and Icon",Telerik,SwingConstants.LEFT);
		add(label2);
		label3 = new JLabel();
		label3.setText("Label add text and Icon");
		label3.setIcon(Telerik);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label 3");
		add(label3);
		
	}
	public static void main(String[] args){
		LabelFrame lf = new LabelFrame();
		lf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lf.setSize(260,180);
		lf.setVisible(true);
		
	}

}

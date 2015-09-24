import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Helloworld {
	
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		// Multi-threading.. tránh cái void main ra.
		SwingUtilities.invokeAndWait(new Runnable() {
			
			@Override
			public void run() {
				 JFrame frame = new JFrame("HelloWorld");
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			        // set Size and location frame
			        frame.setSize(200, 300);
			        frame.setLocation(300, 200);
			 
			        // display frame
			        frame.setVisible(true);
			
			}
		});
	     // create frame with title "HelloWorld"
		 JFrame frame = new JFrame("HelloWorld");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        // set Size and location frame
	        frame.setSize(200, 300);
	        frame.setLocation(300, 200);
	 
	        // display frame
	        frame.setVisible(true);
       
	}

}

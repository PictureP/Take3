package Main;
import javax.swing.JFrame;

public class Client {
	public static void main(String[] args) {		
		JFrame frame = new JFrame("Library");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.getContentPane().add(new LibraryPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
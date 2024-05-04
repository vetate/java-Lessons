package solutions;
import javax.swing.JOptionPane;

public class InputNamePane {

	public static void main(String[] args) {
		
		// You could ask the user to enter their name, save it to a 
				// String variable and output to the relevant JOptionPanes
				String name = JOptionPane.showInputDialog("Please enter your name");
				
				// The most basic solution to this DIY question would be
				// to output Hello World + your name to a JOptionPane
				JOptionPane.showMessageDialog(null, "Hello World " + name + "!");
				
				// The second part of the first DIY question asks for Hello World
				// in the first JOptionPane and your name in the second.  Again this
				// is the most basic solution
				JOptionPane.showMessageDialog(null, "Hello World");
				JOptionPane.showMessageDialog(null, name);

	}

}

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("What is your Birthday?");
	if(s.equals("08/29")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
	
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday.");
	}





}
}

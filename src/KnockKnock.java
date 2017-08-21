import javax.swing.JOptionPane;

public class KnockKnock {
	// This recipe tells the user a knock-knock joke
	//
	// 1. Create a class called KnockKnock
	// 2. Add a main method
	// 3. Find your favorite knock-knock joke
	// 4. Use pop-ups (JOptionPane.showMessageDialg) to display each line of the joke
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Knock-Knock");
		JOptionPane.showMessageDialog(null, "Who's there?");
		JOptionPane.showMessageDialog(null, "A Broken Pencil.");
		JOptionPane.showMessageDialog(null, "A Broken Pencil who?");
		JOptionPane.showMessageDialog(null, "Never mind. It's pointless!");
	}
}

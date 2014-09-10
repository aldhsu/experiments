import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
	String[] buttonNames = {"Panic","Don't Panic", "Blame", "Media", "Save"};
	JButton panicButton, dontPanicButton, blameButton, mediaButton, saveButton;
	JButton[] buttons = {panicButton, dontPanicButton, blameButton, mediaButton, saveButton};
	
	public Crisis() {
		super("Crisis");
		setLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		for (int i = 0; i < buttonNames.length; i++) {
			buttons[i] = new JButton(buttonNames[i]);
			add(buttons[i]);
		}
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}	
	public static void main (String[] args) {
		Crisis crisis = new Crisis();
	}
}
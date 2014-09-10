import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class KeyViewer extends JFrame implements KeyListener {
	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel("Press any key in the text field.");
	
	public KeyViewer() {
		super("KeyViewer");
		setLookAndFeel();
		setSize(350,100);
		keyText.addKeyListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add(keyLabel, BorderLayout.NORTH);
		add(keyText,BorderLayout.CENTER);
		setVisible(true);
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		char key = event.getKeyChar();
		keyLabel.setText("You pressed" + key);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		KeyViewer keyview = new KeyViewer();
	}

}

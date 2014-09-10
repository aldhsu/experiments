package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Main Frame");
		setLookAndFeel();
		setSize(225,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		add(play);
		add(stop);
		add(pause);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e) {
			//ignore error
		}
	}
	
	public static void main(String[] args) {
		MainFrame testframe = new MainFrame();
		InternalFrame secondFrame = new InternalFrame();
		secondFrame.setTitle("Internal Frame");
		testframe.add(secondFrame);
		testframe.setVisible(true);
		testframe.pack();
		
	}
}

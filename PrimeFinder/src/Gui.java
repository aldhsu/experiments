import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

class Gui extends JFrame implements Runnable{
	Thread draw;
	JLabel howManyLabel;
	static JTextField howMany;
	JButton display, stopButton;
	JTextArea primes;
	PrimeFinder finder = new PrimeFinder(this);
	
	Gui() {
		super("Find Prime Numbers");
		setLookAndFeel();
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		
		howManyLabel = new JLabel("Quantity: ");
		howMany = new JTextField("400",10);
		display = new JButton("Display primes");
		stopButton = new JButton("Stop");
		primes = new JTextArea(8,40);
		
		stopButton.addActionListener(finder);
		display.addActionListener(finder);
		JPanel topPanel = new JPanel();
		topPanel.add(howManyLabel);
		topPanel.add(howMany);
		topPanel.add(display);
		topPanel.add(stopButton);
		add(topPanel,BorderLayout.NORTH);
		
		primes.setLineWrap(true);
		JScrollPane textPane = new JScrollPane(primes);
		add(textPane, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.NimbusLookAndFeel");
		} catch (Exception e) {}
	}
	public static void main(String[] args) {
		Gui frame = new Gui();
	}




	@Override
	public void run() {
		
		
	}
}
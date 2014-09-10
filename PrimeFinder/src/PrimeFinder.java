import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

class PrimeFinder implements Runnable, ActionListener{
	Thread go;
	String text ="";
	Gui gui;
	
	public PrimeFinder(Gui frame) {
		gui = frame;
	}	
	public void run() {
		Thread go = Thread.currentThread();
		int quantity = Integer.parseInt(Gui.howMany.getText());
		int numPrimes = 0;
		int candidate = 2;
		gui.primes.setText ("First " + quantity + " primes");
		while (go != null) {
			while (numPrimes < quantity) {
				if (isPrime(candidate)) {
					gui.primes.setText (gui.primes.getText() + candidate + " ");
					numPrimes++;
				}
				candidate++;
			}
		}
		go = null;
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == gui.display) {
			if(go == null) {
				go = new Thread (this);
				go.start();
				System.out.println("Click on display");
			}
		}
		else if (event.getSource() == gui.stopButton) {
			if(go != null) {
				System.out.print("Kill");
				go.interrupt();
				go = null;
			}
		}
	}
	
	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <=root; i++) {
			if (checkNumber %i == 0) {
				return false;
			}
		}
		return true;
	}
	public void report() {
		System.out.println("Reporting");
	}
}

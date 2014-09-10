import java.awt.*;
import java.net.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class LinkRotator extends JApplet implements Runnable,ActionListener {
	String[] pageTitle;
	String[] urls = {"http://java..sun.com","http://www.ibiblio.org/javafaq","http://www.javaworld.com","http://www.java24hours.com","http://www.samspublishing.com", "http://workbench.cadenhead.org"};
	URL[] pageLink = new URL[6];
	Color butterscotch = new Color(255,204,158);
	int current = 0;
	Thread runner;
	
	public void init() {
		pageTitle = new String[]{"Sun's Java site", "Cafe au Lait", "JavaWorld","Java in 24 Hours", "Sam's Publishing", "Workbench" };
		for (int i = 0; i < urls.length; i++) {
			pageLink[i] = getURL(urls[i]);
		}
		Button goButton = new Button("Go");
		goButton.addActionListener(this);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(goButton);
	}
	URL getURL(String urlText) {
		URL pageURL = null;
		try {
			pageURL = new URL(getDocumentBase(), urlText);
		} catch (MalformedURLException m) {
			
		}
		return pageURL;
	}
	public void paint(Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.setColor(butterscotch);
		screen2D.fillRect(0, 0, getSize().width, getSize().height);
		screen2D.drawString(pageTitle[current], 5, 60);
		screen2D.drawString("" + pageLink[current], 5, 80);
	}
	public void start() {
		if (runner ==null) {
			runner = new Thread(this);
			runner.start();
		}
	}
	public void run() {
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			current++;
			if (current > 5) {
				current = 0;
			}
			repaint();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	public void stop() {
		if (runner!=null) {
			runner = null;
		}
	}
	public void actionPerformed(ActionEvent event) {
		if (runner !=null) {
			runner = null;
		}
		AppletContext browser = getAppletContext();
		if (pageLink[current] != null) {
			browser.showDocument(pageLink[current]);
		}
	}
}
import javax.swing.*;

import java.awt.event.*;

public class LottoEvent implements ItemListener, ActionListener, Runnable {
	LottoMadness gui;
	Thread playing;
	
	public LottoEvent(LottoMadness in) {
		gui = in;
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while (playing == thisThread) {
			addOneToField(gui.drawings);
			int draw = Integer.parseInt(gui.drawings.getText());
			float numYears = (float) draw/104;
			gui.years.setText(""+numYears);
			
			int matches = 0;
			for (int i = 0; i < gui.numbers.length; i++) {
				int ball;
				do {
					ball = (int) Math.floor(Math.random() * 50 + 1);
				} while (numberGone(ball, gui.winners, i));
				gui.winners[i].setText(""+ ball);
				if (matchedOne(gui.winners[i], gui.numbers)) {
					matches++;
				}
			}
			if (matches >=3) {
				if (matches == 6) {
					addOneToField(gui.resultFields[matches-3]);
					gui.stop.setEnabled(false);
					gui.play.setEnabled(true);
					playing = null;
				}
				addOneToField(gui.resultFields[matches-3]);
			}
			try {
				Thread.sleep(Integer.parseInt(gui.sleepTIme.getText()));
			} catch (InterruptedException e) {
				//do nothing
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(arg0.getActionCommand()) {
			case "Play":
				startPlaying();
				break;
			case "Reset":
				clearAllFields();
				break;
			case "Stop":
				stopPlaying();
				break;
		}
		
	}
	void startPlaying() {
		playing = new Thread(this);
		playing.start();
		gui.play.setEnabled(false);
		gui.stop.setEnabled(true);
		gui.reset.setEnabled(false);
		gui.quickpick.setEnabled(false);
		gui.personal.setEnabled(false);
	}
	void stopPlaying() {
		gui.play.setEnabled(true);
		gui.stop.setEnabled(false);
		gui.reset.setEnabled(true);
		gui.quickpick.setEnabled(true);
		gui.personal.setEnabled(true);
		playing = null;
	}
	void clearAllFields() {
		for (int i = 0; i < gui.numbers.length; i++) {
			gui.numbers[i].setText(null);
			gui.winners[i].setText(null);
		}
		for (JTextField number: gui.resultFields) {
			number.setText("0");
		}
		gui.drawings.setText("0");
		gui.years.setText("0");
	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		Object item = event.getItem();
		if(item == gui.quickpick) {
			for (JTextField number: gui.numbers) {
				number.setText(String.valueOf((int) (Math.random() * 100)));
			}
		}else {
			for (JTextField number: gui.numbers) {
				number.setText(null);
			}
		}
		
	}
	void addOneToField(JTextField field) {
		int num = Integer.parseInt(field.getText());
		num++;
		field.setText(String.valueOf(num));
	}
	boolean numberGone(int num, JTextField[] pastNums, int count) {
		for (int i = 0; i < count; i++) {
			if (Integer.parseInt(pastNums[i].getText()) == num) {
			return true;
			}		
		}
		return false;
	}
	boolean matchedOne(JTextField win, JTextField[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (win.getText().equals(numbers[i].getText())) {
				return true;
			}
		}
		return false;
	}

}

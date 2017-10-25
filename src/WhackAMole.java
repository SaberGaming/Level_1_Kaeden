import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Date time = new Date();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton = new JButton();

	public void main(String[] args) {
		int num = new Random().nextInt(324);
		drawButtons(num);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		
	}

	// add if, that adds Mole to a random button
	void drawButtons(int o) {
		System.out.println(o);
		for (int i = 0; i < 324; i++) {
			JButton allbuttonsi = new JButton();
			allbuttonsi.addActionListener(this);
			panel.add(allbuttonsi);
			if (o == i) {
				allbuttonsi.setText("Mole");
				moleButton = allbuttonsi;
			}
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	System.exit(0);
	}

	int whack = 0;

	void destroy() {
		frame.dispose();
		int d = new Random().nextInt(324);
		frame = new JFrame();
		panel = new JPanel();
		drawButtons(d);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) e.getSource();
		if (!moleButton.equals(buttonPressed)) {
			speak("Your a waste of oxygen!");

		} else {
			destroy();
			whack++;
		}
		if(whack == 10) {
			endGame(time, whack);
		}
	}
}

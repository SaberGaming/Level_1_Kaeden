import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public void main(String[] args) {
		int num = new Random().nextInt(324);
		drawButtons(num);

		frame.add(panel);
		frame.setVisible(true);
		panel.add(moleButton);
		moleButton.addActionListener(this);
		frame.setSize(1000, 1000);

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton = new JButton();

	// add if, that adds Mole to a random button
	void drawButtons(int o) {
		for (int i = 0; i < 323; i++) {
			JButton allbuttonsi = new JButton();

			panel.add(allbuttonsi);
			allbuttonsi.addActionListener(this);
			frame.setSize(1000, 1000);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

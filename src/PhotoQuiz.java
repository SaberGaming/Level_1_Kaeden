
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String cat = "http://i2.wp.com/www.wehuntedthemammoth.com/wp-content/uploads/2017/04/kitten.png?resize=600%2C433";
		// 2. create a variable of type "Component" that will hold your image
		Component pic = createImage(cat);
		// 3. use the "createImage()" method below to initialize your Component
		pic.addMouseMotionListener(null);
		// 4. add the image to the quiz window

		quizWindow.add(pic);
		int score = 0;
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equalsIgnoreCase("kitten") || ans.equalsIgnoreCase("a kitten")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!!!!! GREAT JOB!!!!!!");
			score++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null,
					"INCORRECT!!!!!!! TERRIBLE JOB!!!!!! The correct answer that we were looking for is Kitten.");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(pic);
		// 10. find another image and create it (might take more than one line
		// of code)
		String Cap = "https://i.pinimg.com/736x/5c/2a/d4/5c2ad47e351af9c9b36db95f54ca18ba--baby-capybara-cute-baby-animals.jpg";
		Component cap = createImage(Cap);
		// 11. add the second image to the quiz window
		quizWindow.add(cap);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans2 = JOptionPane.showInputDialog("What animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (ans2.equalsIgnoreCase("Capybara")) {
			JOptionPane.showMessageDialog(null, "GREAT JOB!!!!!!! YOU GOT IT RIGHT!!!!!!!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT!!!!!!! TERRIBLE JOB!!!!!! (It is actually a kitten)");
		}
		JOptionPane.showMessageDialog(null, " Your score is " + score + "/2");
		System.exit(0);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

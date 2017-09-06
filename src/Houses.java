import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
	

public class Houses {

	static Robot bob = new Robot();	
	public static void main(String[] args){
		Robot.setWindowColor(Color.black);
		bob.setSpeed(10000000);
		bob.miniaturize();	
bob.moveTo(0, 590);
for (int h = 0; h < 10; h++) {
	if(h==0){
		bob.turn(90);
		bob.move(10);
	}
	House();

}		

	
	//X=600, Y=900
	
	
}
static void House(){	
	int r = new Random().nextInt(256);	
	int g = new Random().nextInt(256);	
	int b = new Random().nextInt(256);	
	int num = new Random().nextInt(400)+100;
bob.setPenColor(r, g, b);
	bob.turn(-90);
	bob.penDown();
	bob.move(num);
	if(num>=300){
	bob.turn(90);
	bob.move(40);
	bob.turn(90);
	}
	else{
		bob.turn(45);
	bob.move(28);
	bob.turn(90);
	bob.move(28);
	bob.turn(45);
	}
	bob.move(num);
	bob.turn(-90);
	bob.setPenColor(Color.green);
	bob.move(20);
	
}
}
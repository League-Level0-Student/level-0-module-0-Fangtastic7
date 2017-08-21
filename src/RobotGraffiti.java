import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	// This recipe draws the first letter of your name using the Robot
	//
	// 1. Create a class called RobotGraffiti
	// 2. Use the Robot to draw the first letter of your name
	// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
	// 3. BONUS: Write your entire first name using the Robot
	public static void main(String[] args) throws Exception {
		Robot Max = new Robot();
		Max.penDown();
		Max.setSpeed(10);
		for (int i = 0; i < 2; i++) {
			Max.move(100);
			Max.turn(90);
			Max.move(75);
			Max.turn(90);
			Max.move(100);
			Max.turn(-180);
		}
		
		Max.penUp(); 
		Max.turn(90);
		Max.move(25);
		Max.turn(-90);
		Max.move(100);
		Max.turn(90);
		Max.move(30);
		Max.penDown();
		Max.move(70);
		Max.turn(90);
		Max.move(120);
		Max.turn(180);
		Max.move(20);
		Max.turn(-90);
		Max.move(70);
		Max.turn(90);
		Max.move(60);
		Max.turn(90);
		Max.move(75);
		Max.penUp();
		Max.move(25);
		Max.turn(90);
		Max.move(60);
	
			Max.penDown();
			Max.turn(-135);
			Max.move(150);
			Max.penUp();
			Max.turn(135);
			Max.move(100);
			Max.penDown();
			Max.turn(135);
			Max.move(150);
			Max.penUp();
		
		
		
		
	}
}

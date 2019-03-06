package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	static Robot bob = new Robot();
	static int Sides;
	public static void main(String[] args) {
		
		//1. Create a new Robot

		//2. Set the speed to 100
bob.setSpeed(100);
bob.setY(500);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color do you want your polygon to be?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green", "Black", "Orange", "Yellow"}, 0);
		String sides=JOptionPane.showInputDialog("How many sides do your want the polygon to have?");
		Sides = Integer.parseInt(sides);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
	if(colorChoice==0) {
		bob.setPenColor(Color.red);
	}	
	else if(colorChoice==1) {
		bob.setPenColor(Color.blue);
	}	
	else if(colorChoice==2){
		bob.setPenColor(Color.green);
	}	
	else if(colorChoice==3){
		bob.setPenColor(Color.black);
	}	
	else if(colorChoice==4){
		bob.setPenColor(Color.orange);
	}	
	else if(colorChoice==5){
		bob.setPenColor(Color.yellow);
	}	
		//4. Ask the use how many polygons they want to be drawn.
	String number = JOptionPane.showInputDialog("how many polygons do you want to be drawn?");	
	int Number = Integer.parseInt(number);	
	//5. Use the robot to draw the number of polygons the user requested.
		for(int i =0;i<Number;i++) {
			drawSquare();
		}
		//6. Make it so your shapes do not overlap

	}
		//7. Challenge: add more colors to the Option Dialog.
	static void drawSquare() {
		bob.penDown();
		for(int i =0;i<Sides;i++) {
		bob.move(70);
		bob.turn(360/Sides); 
		}
		bob.penUp();
		bob.move(200);
	}
	
	}



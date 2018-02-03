package balance;

import lejos.hardware.*;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.sensor.*;
import lejos.robotics.EncoderMotor;
import lejos.robotics.Gyroscope;
import lejos.hardware.motor.*;

public class Main {

	public Gyroscope gyro; 
	public static EncoderMotor left_motor;
	public static EncoderMotor right_motor;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		
		lcd.drawString("Press key to start", 4, 4);
		keys.waitForAnyPress();

		  while(true) {
//			     GetGyroData(gyroSpeed, gyroAngle);
//			     GetMotorData(motorSpeed, motorPos);
//
//			     power = KGYROSPEED * gyroSpeed +
//			             KGYROANGLE * gyroAngle +
//			             KPOS       * motorPos  +
//			             KSPEED     * motorSpeed;
//
//			     OnFwd(left_motor, power);
//			     OnFwd(right_motor, power);
//			     
//			     wait(7);
		  }
	}
}

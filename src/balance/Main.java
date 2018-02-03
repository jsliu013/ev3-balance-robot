package balance;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.port.MotorPort;


public class Main {
	
	static EV3LargeRegulatedMotor RIGHT_MOTOR = new EV3LargeRegulatedMotor(MotorPort.A);
	static EV3LargeRegulatedMotor LEFT_MOTOR = new EV3LargeRegulatedMotor(MotorPort.B);
	static EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S1);
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		lcd.drawString("Press key to start", 4, 4);
		keys.waitForAnyPress();

		  while(true) {
			    
			    RIGHT_MOTOR.forward();
			    LEFT_MOTOR.forward();

			  Thread.sleep(7);
		  }
	}
}

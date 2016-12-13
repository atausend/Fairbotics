package org.usfirst.frc.team5340.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	
	//Joysticks
	public static Joystick driveStick1 = new Joystick(RobotMap.DRIVE_STICK_PORT);
	public static Joystick driveStick2 = new Joystick(RobotMap.DRIVE_STICK_PORT_2);
	
	//Motor Ports
	public static int LEFT_MOTOR = 1;
	public static int RIGHT_MOTOR = 3;
	public static int R_LEFT_MOTOR = 2;
	public static int R_RIGHT_MOTOR = 0;
	//public static int R_LIFT_MOTOR = 4;
	//public static int L_LIFT_MOTOR = 5;
	public static int LIFT_MOTOR = 5;
	
	//Joystick Ports
	public static final int DRIVE_STICK_PORT = 0;
	public static final int DRIVE_STICK_PORT_2 = 1;

	//Booleans
	public static final boolean usingFourMotors = true;
	
	//Subsystems
}
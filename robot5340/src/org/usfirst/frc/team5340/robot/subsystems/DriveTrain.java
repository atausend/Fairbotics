package org.usfirst.frc.team5340.robot.subsystems;

import org.usfirst.frc.team5340.robot.OI;
import org.usfirst.frc.team5340.robot.Robot;
import org.usfirst.frc.team5340.robot.RobotMap;
import org.usfirst.frc.team5340.robot.commands.DriveWStick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
	RobotDrive driveTrain;
	
    Talon leftMotor;
    Talon rLeftMotor;
    Talon rightMotor;
    Talon rRightMotor;
    OI joysticks;
    
    
    public DriveTrain(){
    	if(RobotMap.usingFourMotors){
    	leftMotor = new Talon(RobotMap.LEFT_MOTOR);
    	rLeftMotor = new Talon(RobotMap.R_LEFT_MOTOR);
    	rightMotor = new Talon(RobotMap.RIGHT_MOTOR);
    	rRightMotor = new Talon(RobotMap.R_RIGHT_MOTOR);
    	driveTrain = new RobotDrive(leftMotor, rLeftMotor, rightMotor, rRightMotor);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    	
  
    	}
    }
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWStick());
    }
    
    public void mecaDrive() {
    	driveTrain.mecanumDrive_Cartesian(Robot.oi.driveStick2.getX() * 1.0, Robot.oi.driveStick2.getY() * 1.0, Robot.oi.driveStick1.getX() * 1.0, 0);
    	
//    	As of right now (11/29/16) there is a negative value assigned to driveStick2's X value, the robot is strafing backwards this is the current fix.
//    	Above problem has been fixed
    	
    }
    
    public void autoTank() {
    	driveTrain.tankDrive(-.6, .6, true);
    }
}
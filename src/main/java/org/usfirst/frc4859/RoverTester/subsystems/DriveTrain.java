// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4859.RoverTester.subsystems;


import org.usfirst.frc4859.RoverTester.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX leftFrontMotor;
    private WPI_TalonSRX leftRearMotor;
    private WPI_TalonSRX rightFrontMotor;
    private WPI_TalonSRX rightRearMotor;
    private MecanumDrive mecanumDrive;
    private PigeonIMU pigeon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public WPI_TalonSRX getLeftFrontMotor(){ return leftFrontMotor; }
    public WPI_TalonSRX getLeftRearMotor(){ return leftRearMotor; }
    public WPI_TalonSRX getRightFrontMotor(){ return rightFrontMotor; }
    public WPI_TalonSRX getRightRearMotor(){ return rightRearMotor; }
    public MecanumDrive getMecanumDrive(){ return mecanumDrive; }
    public PigeonIMU GetPigeon(){ return pigeon; }


    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftFrontMotor = new WPI_TalonSRX(1);
        
        
        
        leftRearMotor = new WPI_TalonSRX(3);
        
        
        
        rightFrontMotor = new WPI_TalonSRX(2);
        
        
        
        rightRearMotor = new WPI_TalonSRX(4);
        
        
        
        mecanumDrive = new MecanumDrive(leftFrontMotor, leftRearMotor,
              rightFrontMotor, rightRearMotor);
        addChild("MecanumDrive",mecanumDrive);
        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setExpiration(0.1);
        mecanumDrive.setMaxOutput(1.0);

        
        pigeon = new PigeonIMU(12);
        
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void RunMotor(WPI_TalonSRX motor, double speed){
        motor.set(speed);
    }
}


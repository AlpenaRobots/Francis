// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5505.Francis.subsystems;


import org.usfirst.frc5505.Francis.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.DriverStation;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS


    private CANSparkMax sparkMAX1;
    private CANSparkMax sparkMAX2;
    private CANSparkMax sparkMAX3;
    private CANSparkMax sparkMAX4;
    private RobotDrive robotDrive41;
    private DoubleSolenoid doubleSolenoid1;


    public drive() {

        sparkMAX1 = new CANSparkMax(16, MotorType.kBrushless);
        
        
        
        sparkMAX2 = new CANSparkMax(1, MotorType.kBrushless);
        
        
        
        sparkMAX3 = new CANSparkMax(2, MotorType.kBrushless);
        
        
        
        sparkMAX4 = new CANSparkMax(3, MotorType.kBrushless);
        
        
        
        robotDrive41 = new RobotDrive(sparkMAX1, sparkMAX2, sparkMAX3, sparkMAX4);
        
        robotDrive41.setSafetyEnabled(false);
        robotDrive41.setExpiration(0.1);
        robotDrive41.setSensitivity(0.5);
        robotDrive41.setMaxOutput(1.0);

        
        doubleSolenoid1 = new DoubleSolenoid(0, 6, 7);
        addChild("Double Solenoid 1",doubleSolenoid1);
         
        


    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveBase());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        doubleSolenoid1.set(Value.kForward);
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void driveBase(Joystick stick) {
        double reduction = 1;
        robotDrive41.tankDrive(stick.getRawAxis(1) * reduction, stick.getRawAxis(5) * reduction);
        if (DriverStation.getInstance().getMatchTime() > 29 && DriverStation.getInstance().getMatchTime() < 31 && DriverStation.getInstance().isOperatorControl()) {
            stick.setRumble(RumbleType.kLeftRumble, 1);
        } else if (DriverStation.getInstance().getMatchTime() <= 29 && DriverStation.getInstance().isOperatorControl()) {
            stick.setRumble(RumbleType.kLeftRumble, 0);
        }
    }

    public void shift() {
        System.out.println("Started Shift Command");
        if (doubleSolenoid1.get() != Value.kForward) {
            doubleSolenoid1.set(Value.kForward);
            System.out.println("Shifted Forward");
        } else {
            doubleSolenoid1.set(Value.kReverse);
            System.out.println("Shifted Backwards");
        }
    }
}


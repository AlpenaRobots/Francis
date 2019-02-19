// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5505.Francis;

import org.usfirst.frc5505.Francis.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5505.Francis.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton rb1;
    public JoystickButton start1;
    public JoystickButton a1;
    public JoystickButton b1;
    public JoystickButton x1;
    public JoystickButton y1;
    public Joystick xbox1;
    public JoystickButton a2;
    public JoystickButton b2;
    public JoystickButton rb2;
    public JoystickButton x2;
    public JoystickButton y2;
    public Joystick xbox2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox2 = new Joystick(1);
        
        y2 = new JoystickButton(xbox2, 4);
        y2.whileHeld(new elevatorUp());
        x2 = new JoystickButton(xbox2, 3);
        x2.whileHeld(new elevatorDown());
        rb2 = new JoystickButton(xbox2, 6);
        rb2.whenPressed(new clamp());
        b2 = new JoystickButton(xbox2, 2);
        b2.whileHeld(new intakeOut());
        a2 = new JoystickButton(xbox2, 1);
        a2.whileHeld(new intakeIn());
        xbox1 = new Joystick(0);
        
        y1 = new JoystickButton(xbox1, 4);
        y1.whileHeld(new extendBothScrews());
        x1 = new JoystickButton(xbox1, 3);
        x1.whileHeld(new ultraWallAlign());
        b1 = new JoystickButton(xbox1, 2);
        b1.whileHeld(new retractFrontScrew());
        a1 = new JoystickButton(xbox1, 1);
        a1.whileHeld(new retractRearScrew());
        rb1 = new JoystickButton(xbox1, 6);
        rb1.whenPressed(new shift());
        start1 = new JoystickButton(xbox1, 8);
        start1.whenPressed(new returnDriverControl());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("driveBase", new driveBase());
        SmartDashboard.putData("shift", new shift());
        SmartDashboard.putData("intakeIn", new intakeIn());
        SmartDashboard.putData("intakeOut", new intakeOut());
        SmartDashboard.putData("clamp", new clamp());
        SmartDashboard.putData("elevatorUp", new elevatorUp());
        SmartDashboard.putData("elevatorDown", new elevatorDown());
        SmartDashboard.putData("elevatorJoy", new elevatorJoy());
        SmartDashboard.putData("intakeJoy", new intakeJoy());
        SmartDashboard.putData("dropAxes", new dropAxes());
        SmartDashboard.putData("pivot", new pivot());
        SmartDashboard.putData("extendBothScrews", new extendBothScrews());
        SmartDashboard.putData("retractFrontScrew", new retractFrontScrew());
        SmartDashboard.putData("retractRearScrew", new retractRearScrew());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxbox1() {
        return xbox1;
    }

    public Joystick getxbox2() {
        return xbox2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


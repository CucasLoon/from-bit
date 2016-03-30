// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3777.FakeRobot.subsystems;

import org.usfirst.frc3777.FakeRobot.RobotMap;
import org.usfirst.frc3777.FakeRobot.commands.*;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Elevator extends PIDSubsystem {

    
    public final String Positio = "";

    public static CANTalon cANTalon1 = RobotMap.elevatorCANTalon1;
    private final AnalogPotentiometer potentiometer = RobotMap.elevatorPotentiometer;

 
    public Elevator() {

        super("Elevator", 0.0, 0.0, 0.0);
        setAbsoluteTolerance(0.2);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Elevator", "PIDSubsystem Controller", getPIDController());

    }

    public void initDefaultCommand() {



	}

	protected double returnPIDInput() {
        
        return potentiometer.get();

   
    }

    protected void usePIDOutput(double output) {
       
        cANTalon1.pidWrite(output);


    }
}

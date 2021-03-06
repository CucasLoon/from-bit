// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3777.FakeRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc3777.FakeRobot.Robot;

/**
 *
 */
public class ReleaseBall extends Command {

	 private boolean m_ReleaseBall;
	 

	    public ReleaseBall(boolean ReleaseBall){ 

	        m_ReleaseBall = ReleaseBall;
	        requires(Robot.pneumatics);

    }

    protected void initialize() {
    }

    protected void execute() {
    	if (m_ReleaseBall=true){
    		Robot.pneumatics.doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
    }
    }
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

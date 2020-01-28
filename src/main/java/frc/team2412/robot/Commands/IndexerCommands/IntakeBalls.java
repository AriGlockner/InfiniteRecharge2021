package frc.team2412.robot.Commands.IndexerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.IndexerSubsystem;

//This is an example command for this year. Make sure all commands extend CommandBase and they use take all dependencies(fields) through a constructor
public class IntakeBalls extends CommandBase {
	
	IndexerSubsystem m_Subsystem;

	public IntakeBalls(IndexerSubsystem subsystem) {
		m_Subsystem = subsystem;
		addRequirements(subsystem);
	}
	@Override
	public void execute() {
		// run the example method
		m_Subsystem.intake(m_Subsystem.numBalls+1, intakeSubsystem.intakeDirection());
	}

	@Override
	public boolean isFinished() {
		return true;
	}
	public IndexerSubsystem.IntakeDirection currentIntakeDirection(){
		
	}
}

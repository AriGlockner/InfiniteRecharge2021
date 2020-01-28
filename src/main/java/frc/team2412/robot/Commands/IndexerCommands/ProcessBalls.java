package frc.team2412.robot.Commands.IndexerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.ExampleSubsystem;
import frc.team2412.robot.Subsystems.IndexerSubsystem;

//This is an example command for this year. Make sure all commands extend CommandBase and they use take all dependencies(fields) through a constructor
public class ProcessBalls extends CommandBase {
	IndexerSubsystem m_Subsystem;
	ShootBalls shoot;
	IntakeBalls intake;
	SwitchBalls switchB;
	public ProcessBalls(IndexerSubsystem subsystem, ShootBalls s, IntakeBalls i, SwitchBalls sb) {
		m_Subsystem = subsystem;
		shoot = s;
		intake = i;
		switchB = sb;
		addRequirements(subsystem);
	}

	@Override
	public void execute() {
		// run the example method
		//get the button value for shooting
		boolean shootButton = false;
		if (shootButton) {
			shoot.execute();
		} else {
			intake.execute();
			switchB.execute();
		}

	}

	@Override
	public boolean isFinished() {
		return true;
	}

}

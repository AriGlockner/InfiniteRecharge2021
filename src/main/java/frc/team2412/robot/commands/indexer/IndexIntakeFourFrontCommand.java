package frc.team2412.robot.commands.indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.RobotState;
import frc.team2412.robot.subsystems.IndexerSensorSubsystem;

//This is an example command for this year. Make sure all commands extend CommandBase and they use take all dependencies(fields) through a constructor
public class IndexIntakeFourFrontCommand extends CommandBase {

	private IndexerSensorSubsystem m_indexerSensorSubsystem;

	public IndexIntakeFourFrontCommand(IndexerSensorSubsystem sensorSubsystem) {
		m_indexerSensorSubsystem = sensorSubsystem;

		addRequirements(sensorSubsystem);
	}

	@Override
	public void execute() {
	}

	@Override
	public void end(boolean cancel) {
		RobotState.m_unbalancedSide = RobotState.UnbalancedSide.FRONT;
		RobotState.m_ballCount++;
	}

	@Override
	public boolean isFinished() {
		return m_indexerSensorSubsystem.isIndexFrontSensorTripped();
	}

}

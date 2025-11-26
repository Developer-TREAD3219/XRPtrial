package frc.robot.commands;

import frc.robot.subsystems.LineSensor;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousLineDrive extends Command {
    
    private final LineSensor m_LineSensor;
    private final Drivetrain m_Drivetrain;
    private final Arm m_Arm;
    private final Double m_speed;

    public AutonomousLineDrive(Drivetrain drive, LineSensor lineSensor, Arm arm) {
        m_Drivetrain = drive;
        m_LineSensor = lineSensor;
        m_Arm = arm;
        m_speed = 0.5;

        addRequirements(drive);
        addRequirements(lineSensor);
        addRequirements(arm);
    }

// Called when the command is initially scheduled.
@Override
public void initialize() {
    m_Drivetrain.arcadeDrive(0, 0);
    m_Drivetrain.resetEncoders();
}

// Called every time the scheduler runs while the command is scheduled
@Override
public void execute() {
    // TO-DO   NEEDS TO BE CODED!!!!
    m_Arm.setAngle(25.0);
    //m_Drivetrain.arcadeDrive(m_speed, 0);

}

// Called once the command ends or is interrupted
@Override
public void end(boolean interrupted){
    m_Drivetrain.arcadeDrive(0, 0);
    m_Arm.setAngle(90.0);
}

//Returns true when the command should end
@Override
public boolean isFinished() {
    if (m_LineSensor.isOnLine()){
        return true;
    }
    else{
        return false;
    }
}
}

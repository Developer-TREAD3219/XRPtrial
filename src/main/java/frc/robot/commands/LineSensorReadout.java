package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LineSensor; 

public class LineSensorReadout extends Command {
    LineSensor lineSensor = new LineSensor();

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        // Create an instance of DistanceSensor
        LineSensor lineSensor = new LineSensor();

        // Call the printValues method
        lineSensor.printValues(); 
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}

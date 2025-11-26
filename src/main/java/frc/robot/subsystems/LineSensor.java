package frc.robot.subsystems;
// Haven't used yet
import javax.lang.model.util.ElementScanner14;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class LineSensor extends SubsystemBase{

    private AnalogInput leftLineSensor;
    private AnalogInput rightLineSensor;
    Double leftLineSensorVoltage;
    Double rightLineSensorVoltage;
    //int leftLineSensorint;

    public LineSensor(){
        // I/O 0 and 1 are motor 3 which isn't connected to anything right now
        leftLineSensor = new AnalogInput(0);
        rightLineSensor = new AnalogInput(1); // Adjust port/channel

        updateValues();
    }

    public void updateValues() {
        leftLineSensorVoltage = leftLineSensor.getVoltage(); // Get voltage (0V pure white, 5V pure black)
        rightLineSensorVoltage = rightLineSensor.getVoltage(); // Get voltage (0V pure white, 5V pure black)
        //leftLineSensorint=leftLineSensor.getValue();
}

public boolean isOnLine() {
    // If the voltage is over 4.5, the robot is sensing a black surface.
    if (leftLineSensorVoltage > 4.5 || rightLineSensorVoltage > 4.5) 
    {
        //System.out.println("is on line");
        return true;
    }
    else
    {
        //System.out.println("line NOT detected");
        return false;
    }
}

public void printValues() {
    updateValues(); // Ensure values are updated before printing
    
    //System.out.println("leftLineSensorValue = " + leftLineSensorint);

    //System.out.println("rightLineSensorValue = " + rightLineSensorValue);
SmartDashboard.putNumber("leftLineSensorVoltage = ", leftLineSensorVoltage);
SmartDashboard.putNumber("rightLineSensorVoltage = ", rightLineSensorVoltage);
} 

    public void periodic (){
        printValues();
    }
}

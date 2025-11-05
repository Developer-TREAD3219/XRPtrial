package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LineSensor extends SubsystemBase{

    private AnalogInput leftLineSensor;
    private AnalogInput rightLineSensor;
    Double leftLineSensorValue;
    Double rightLineSensorValue;

    public LineSensor(){
        
        leftLineSensor = new AnalogInput(0);
        rightLineSensor = new AnalogInput(1); // Adjust port/channel

        updateValues();
    }

    public void updateValues() {
        leftLineSensorValue = leftLineSensor.getVoltage(); // Get voltage (0V pure white, 5V pure black)
        rightLineSensorValue = rightLineSensor.getVoltage(); // Get voltage (0V pure white, 5V pure black)
    }

    public void printValues() {
        updateValues(); // Ensure values are updated before printing
        System.out.println("leftLineSensorValue = " + leftLineSensorValue);
        System.out.println("rightLineSensorValue = " + rightLineSensorValue);
    }

    public void periodic (){
        printValues();
    }
}

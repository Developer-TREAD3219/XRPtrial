package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.AnalogInput;

public class DistanceSensor extends SubsystemBase {
    private AnalogInput rangeSensor;
    private double rangeVoltage; // Moved to instance variables
    private static final double kMillimeterPerVolt = (4000.0 - 20.0) / 5.0;

    public DistanceSensor() {
        System.out.println("DistanceSensor");
        rangeSensor = new AnalogInput(2); // Initialize with appropriate channel
        updateValues(); // Initialize values
    }

    public void updateValues() {
        rangeVoltage = rangeSensor.getVoltage(); // Get voltage (0V pure white, 5V pure black)
    }

    public void printValues() {
        updateValues(); // Ensure values are updated before printing
        double distance = rangeVoltage * kMillimeterPerVolt;
        //System.out.println("distance=" + distance);
    }
    public void periodic (){
        printValues();
    }
}
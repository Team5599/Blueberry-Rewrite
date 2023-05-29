/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.subsystems.intake;

import com.sentinels.robot.constants.Ports;
import com.sentinels.robot.util.RoboRIO;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private final PWMSparkMax motorIntake = new PWMSparkMax(Ports.Intake.INTAKE);

    public Intake() {}

    public void intakeSpin(double speed) {
        motorIntake.set(speed);
    }
    
    public void intakeStop() {
        motorIntake.stopMotor();
    }

    public double getIntakeVoltage() {
        return (motorIntake.get() * RoboRIO.getBatteryVoltage());
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Intake/Motor Voltage (V)", getIntakeVoltage());
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}

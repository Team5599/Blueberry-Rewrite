/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.subsystems.shooter;

import com.sentinels.robot.constants.Ports;
import com.sentinels.robot.util.RoboRIO;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private final Spark motorShooterL = new Spark(Ports.Shooter.SHOOTERLEFT);
    private final Spark motorShooterR = new Spark(Ports.Shooter.SHOOTERRIGHT);
    private final Spark motorShooterB = new Spark(Ports.Shooter.SHOOTERBACK);

    private final MotorControllerGroup shooterMotors = new MotorControllerGroup(motorShooterL, motorShooterR);

    public Shooter() {}

    public void shooterShoot(double speed) {
        shooterMotors.set(speed);
    }

    public void shooterPush(double speed) {
        motorShooterB.set(speed);
    }
    
    public void shooterStop() {
        shooterMotors.stopMotor();
    }

    public void pushStop() {
        motorShooterB.stopMotor();
    }

    public double getLeftVoltage() {
        return (motorShooterL.get() * RoboRIO.getBatteryVoltage());
    }
    public double getRightVoltage() {
        return (motorShooterR.get() * RoboRIO.getBatteryVoltage());
    }
    public double getBackVoltage() {
        return (motorShooterB.get() * RoboRIO.getBatteryVoltage());
    }


    @Override
    public void periodic() {
        SmartDashboard.putNumber("Shooter/Left Motor Voltage (V)", getLeftVoltage());
        SmartDashboard.putNumber("Shooter/Right Motor Voltage (V)", getRightVoltage());
        SmartDashboard.putNumber("Shooter/Back Motor Voltage (V)", getBackVoltage());

        SmartDashboard.putNumber("Shooter/Left Motor Set Speed [-1,1]:", motorShooterL.get());
        SmartDashboard.putNumber("Shooter/Right Motor Set Speed [-1,1]", motorShooterR.get());
        SmartDashboard.putNumber("Shooter/Right Motor Set Speed [-1,1]", motorShooterB.get());
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}

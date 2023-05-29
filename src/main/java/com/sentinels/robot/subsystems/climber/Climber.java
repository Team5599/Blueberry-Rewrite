/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.subsystems.climber;

import com.sentinels.robot.constants.Ports;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {

    private final DoubleSolenoid solenoid = new DoubleSolenoid(
        Ports.Devices.PCM, PneumaticsModuleType.CTREPCM ,Ports.Climber.SOLENOIDPUSH, Ports.Climber.SOLENOIDPULL
    );

    public Climber() {}

    public void climberExtend() {
        solenoid.set(Value.kForward);
    }

    public void climberRetract() {
        solenoid.set(Value.kReverse);
    }

    public String getSolenoidState() {
        return solenoid.get().toString();
      }

    @Override
    public void periodic() {
        SmartDashboard.putString("Shooter/Solenoid Piston State", getSolenoidState());
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}

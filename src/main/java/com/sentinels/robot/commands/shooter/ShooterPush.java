/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.commands.shooter;

import com.sentinels.robot.constants.Settings;
import com.sentinels.robot.subsystems.shooter.Shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class ShooterPush extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final Shooter shooter;
  private final CommandJoystick operator;

  public ShooterPush(Shooter shooter, CommandJoystick operator) {
    this.shooter = shooter;
    this.operator = operator;

    addRequirements(shooter);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    
  }

  @Override
  public void end(boolean interrupted) {
    shooter.pushStop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
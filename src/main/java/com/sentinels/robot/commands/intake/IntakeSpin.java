/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.commands.intake;

import com.sentinels.robot.constants.Settings;
import com.sentinels.robot.subsystems.intake.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class IntakeSpin extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final Intake intake;
  private final CommandJoystick operator;

  public IntakeSpin(Intake intake, CommandJoystick operator) {
    this.intake = intake;
    this.operator = operator;

    addRequirements(intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    
  }

  @Override
  public void end(boolean interrupted) {
    intake.intakeStop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
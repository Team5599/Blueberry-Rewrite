/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

package com.sentinels.robot.commands.climber;

import com.sentinels.robot.constants.Settings;
import com.sentinels.robot.subsystems.climber.Climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class ClimberExtend extends CommandBase {
@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final Climber climber;
  private final CommandJoystick operator;

  public ClimberExtend(Climber climber, CommandJoystick operator) {
    this.climber = climber;
    this.operator = operator;

    addRequirements(climber);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
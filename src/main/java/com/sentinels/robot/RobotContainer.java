// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.sentinels.robot;

import com.sentinels.robot.commands.autonomous.Autos;
import com.sentinels.robot.constants.Constants.Ports;
import com.sentinels.robot.subsystems.drive.Drivetrain;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

  // Subsystems
  private final Drivetrain drivetrain = new Drivetrain();

  // Input Devices
  private final CommandXboxController driver = new CommandXboxController(Ports.kDriverController);
  private final CommandJoystick operator = new CommandJoystick(Ports.kOperatorController);

  // Autonomous
  private static SendableChooser<Command> autonChooser = new SendableChooser<>();
  private static SendableChooser<Boolean> controlChooser = new SendableChooser<>();

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {}

  private void configureDefaultCommands() {}

  private void configureAutonCommands() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return autonChooser.getSelected();
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.sentinels.robot;

import com.sentinels.robot.commands.autonomous.Autos;
import com.sentinels.robot.commands.drivetrain.DrivetrainDrive;
import com.sentinels.robot.commands.intake.IntakeSpin;
import com.sentinels.robot.commands.shooter.ShooterShoot;
import com.sentinels.robot.constants.Ports;
import com.sentinels.robot.constants.Settings;
import com.sentinels.robot.subsystems.drive.Drivetrain;
import com.sentinels.robot.subsystems.climber.Climber;
import com.sentinels.robot.subsystems.intake.Intake;
import com.sentinels.robot.subsystems.shooter.Shooter;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {

  // Subsystems
  private final Drivetrain drivetrain = new Drivetrain();
  private final Climber climber = new Climber();
  private final Intake intake = new Intake();
  private final Shooter shooter = new Shooter();

  // Input Devices
  private final CommandXboxController driver = new CommandXboxController(Ports.Controllers.kDriverController);
  private final CommandJoystick operator = new CommandJoystick(Ports.Controllers.kOperatorController);

  // Autonomous
  private static SendableChooser<Command> autonChooser = new SendableChooser<>();
  private static SendableChooser<Boolean> controlChooser = new SendableChooser<>();

  private Boolean arcadeDriveActive;

  public RobotContainer() {
    configureButtonBindings();
    configureDefaultCommands();
    configureAutonCommands();

    DriverStation.silenceJoystickConnectionWarning(true);
  }

  private void configureButtonBindings() {
    configureDriverBindings();
    configureOperatorBindings();
  }

  private void configureDriverBindings() {
    controlChooser.setDefaultOption("Tank Drive", false);
    controlChooser.addOption("Tank Drive", false);
    controlChooser.addOption("Arcade Drive", true);

    SmartDashboard.putData("Control Scheme", controlChooser);
    arcadeDriveActive = controlChooser.getSelected();
  }

  private void configureOperatorBindings() {
    // SHOOTER



    // CLIMBER



    // INTAKE
  }

  private void configureDefaultCommands() {
    drivetrain.setDefaultCommand(new DrivetrainDrive(drivetrain, driver, arcadeDriveActive));
    intake.setDefaultCommand(new IntakeSpin(intake, operator));
    shooter.setDefaultCommand(new ShooterShoot(shooter, operator));
  }

  private void configureAutonCommands() {
    autonChooser.addOption("Disabled", null);
    autonChooser.addOption("Simple Drive Forward", Autos.simpleTimedDrive(drivetrain, Settings.Drivetrain.kTimedDriveTime));

    autonChooser.setDefaultOption("Simple Drive Forward", Autos.simpleTimedDrive(drivetrain, Settings.Drivetrain.kTimedDriveTime));
    
    SmartDashboard.putData("Selected Autonomous", autonChooser);
  }

  public Command getAutonomousCommand() {
    return autonChooser.getSelected();
  }
}

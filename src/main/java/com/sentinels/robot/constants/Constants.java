// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.sentinels.robot.constants;

public interface Constants {

  public interface Ports {
    int kDriverController = 0;
    int kOperatorController = 1;

    // Motors
    int FRONTLEFT = 1;
    int BACKLEFT = 2;

    int FRONTRIGHT = 3;
    int BACKRIGHT = 4;
  }

  public interface Drivetrain {
    double kDriveSpeedCap = 0.7;
    double kTimedDriveVoltage = 2.5;
    double kTimedDriveTime = 3;
  }

}
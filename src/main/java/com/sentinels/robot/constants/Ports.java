/***************************************************************
                The Sentinels - FRC Team 5599
        Benjamin N. Cardozo High School Robotics Team

    This work is licensed under the terms of the MIT license.
    Copyright (c) 2023 The Sentinels. All rights reserved.
***************************************************************/

// Port numbers for robot devices, controllers/gamepads, subsystem/mechanism motor controllers, solenoids, and sensors are defined in this file. 

package com.sentinels.robot.constants;

public interface Ports {

  public interface Devices {
    // Power Distribution Panel (PDP)
    int PDP = 0;

    // Pneumatics Control Module (PCM)
    int PCM = 1;
  }

  public interface Controllers {
    // Controllers
    int kDriverController = 0;
    int kOperatorController = 1;
  }

  public interface Shooter {
    // Motors
    int SHOOTERLEFT = 6;
    int SHOOTERRIGHT = 7;
    int SHOOTERBACK = 8;
  }
  
  public interface Intake {
    // Motors
    int INTAKE = 5;
  }

  public interface Drivetrain {
    // Motors
    int FRONTLEFT = 1;
    int BACKLEFT = 2;

    int FRONTRIGHT = 3;
    int BACKRIGHT = 4;
  }
}
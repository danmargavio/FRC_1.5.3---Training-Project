// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

// We add this line to enable us to call and use a Joystick
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {

  // We add this line to create a new instance of a joystick object connected to USB port 0
  Joystick my_joystick = new Joystick();

  // We add this line to create a new instance of a "double" variable and set its value to 0
  double motor_control_input = 0.0;

  // PID coefficients
  double kP = 6e-5; 
  double kI = 0;
  double kD = 0; 
  double kIz = 0; 
  double kFF = 0; 
  double kMaxOutput = 1; 
  double kMinOutput = -1;
  double maxRPM = 5700;
  
  @Override
  public void robotInit() {

  }

  @Override
  public void robotPeriodic() {
    // Get the current value of my joysticks left controller Y axis and set my motor_control_input variable to it
    motor_control_input = maxRPM * my_joystick.getRawAxis(1); // multiple by maxRPM so that the velocity never exceeds that
  }

  @Override
  public void teleopPeriodic() {
    System.out.print(motor_control_input);
  }
}
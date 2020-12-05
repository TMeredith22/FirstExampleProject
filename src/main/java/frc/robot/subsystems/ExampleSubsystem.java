/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  public ExampleSubsystem() {
  
    //There is a new solenoid
     public final ToggledSolenoid climberBrake = new ToggledSolenoid(Constants.CLIMBER_SOL, Constants.CLIMBER_SOL2)
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;

/**
 *
 * @author Nicster34
 */
public class DriveTrain extends Subsystem{
    RobotDrive robotDrive = new RobotDrive(RobotMap.leftFrontMotor, RobotMap.leftBackMotor, RobotMap.rightBackMotor, RobotMap.rightFrontMotor);
    
    public void initDefaultCommand() {
        setDefaultCommand(new ExampleCommand());
        
        
    }
    public void mecanumDrive() {
        robotDrive.mecanumDrive_Cartesian(RobotMap.leftBackMotor, RobotMap.rightBackMotor, RobotMap.rightFrontMotor, RobotMap.leftFrontMotor);
    }
    
}


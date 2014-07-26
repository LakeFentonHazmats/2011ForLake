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
import edu.wpi.first.wpilibj.templates.commands.DriveWithController;

/**
 *
 * @author Nicster34
 */
public class DriveTrain extends Subsystem{
    RobotDrive robotDrive = new RobotDrive(RobotMap.leftFrontMotor, RobotMap.leftBackMotor, RobotMap.rightBackMotor, RobotMap.rightFrontMotor);
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithController());
        
        
    }
    public void mecanumDrive(double x, double y, double rotation, double gyro) {
        robotDrive.mecanumDrive_Cartesian(x, y, rotation, gyro);
        }
    
}


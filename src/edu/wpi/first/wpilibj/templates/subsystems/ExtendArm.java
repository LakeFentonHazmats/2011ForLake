/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.Extend;
import edu.wpi.first.wpilibj.templates.RobotMap;


/**
 *
 * @author Nicster34
 */
public class ExtendArm extends Subsystem {
    Victor extendArmed = new Victor(RobotMap.extendMotor);
    public ExtendArm(){
        
    }
            
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Extend());
    }
    public void upDown(double move) {
        extendArmed.set(move);
    }
}


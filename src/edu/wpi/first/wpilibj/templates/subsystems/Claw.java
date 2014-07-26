/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.PWM;

/**
 *
 * @author Nicster34
 */
public class Claw extends Subsystem {
    PWM clawMotor = new PWM(RobotMap.clawMotor);
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ExampleCommand());
        
    }
    
    public void clawOpen (){
        clawMotor.setRaw(-1);
    }
    
    public void clawClose (){
        clawMotor.setRaw(1);
    }
    
    public void clawStop (){
        clawMotor.setRaw(0);
    }
}

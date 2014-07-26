/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.templates.commands.Raise;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
/**
 *
 * @author Nicster34
 */
public class UpDownArm extends Subsystem {
   Victor upDownArmed = new Victor(RobotMap.raiseMotor);
    public UpDownArm(){
        
    }
            
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Raise());
    }
    public void upDown(double moveup) {
        upDownArmed.set(moveup);
    }
}

package frc.robot*;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.UserDrive;



public class Drive extends Subsystem{

    DifferentialDrive base_drive = new DifferentialDrive(RobotMap.leftGroup, RobotMap.rightGroup); //takes inputs of 2 motor controller groups


public void teleopDrive(){

}
}
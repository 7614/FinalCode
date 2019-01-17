package frc.robot*;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.UserDrive;
import org.usfirst.frc.team1.robot.Robot;
public class Arm extends Subsystem{
    
        //initialize arm motors
        private WPI_VictorSPX wrist = new WPI_VictorSPX(RobotMap.WRISTMOTOR);
        private WPI_VictorSPX elbow = new WPI_VictorSPX(RobotMap.ELBOWMOTOR);
        private WPI_VictorSPX shoulder = new WPI_VictorSPX(RobotMap.SHOULDERMOTOR);
   public void initDefaultCommandWrist() {
    }

    public void open() {
    	wrist.set(1);
    }

    public void close() {
    	wrist.set(-1);
    }

    public void stop() {
    	wrist.set(0);
    }
       public void initDefaultCommandElbow() {
    }

    public void open() {
    	elbow.set(1);
    }

    public void close() {
    	elbow.set(-1);
    }

    public void stop() {
    	elbow.set(0);
    }
    
       public void initDefaultCommandShoulder() {
    }

    public void open() {
    	shoulder.set(1);
    }

    public void close() {
    	shoulder.set(-1);
    }

    public void stop() {
    	shoulder.set(0);
    }
    
    
  //how to tell arm to move based on joystick??
}
package frc.robot*;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.UserDrive;
public class BallIntake extends Subsystem{
    private WPI_VictorSPX motor1 = new WPI_VictorSPX(RobotMap.BallIntake1);
    private WPI_VictorSPX motor2 = new WPI_VictorSPX(RobotMap.BallIntake2);
    public static void forwardMotor1(){
        motor1.set(1);
    }
    public static void forwardMotor2(){
        motor2.set(1);
    }
    public static void backwardMotor1(){
        motor1.set(1);
    }
    public static void backwardMotor2(){
        motor2.set(1);
    }
    public static void disableMotors(){
        motor1.set(0);
        motor2.set(0);
    }
}
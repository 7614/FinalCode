package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
public class BallSucc extends Command{
    public BallSucc(){
        require(Robot.BallIntake)
    }
    
    
    @Overide
    protected static boolean isFinished(){
        return false;
    }
    @Overide
    protected static void execute(){
        BallIntake.forwardMotor1();
        BallIntake.backwardMotor2();
    }
}

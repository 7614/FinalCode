package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
public class BallBlow extends Command{
    public BallBlow(){
        requires(Robot.BallIntake);
    }
    @Overide
    protected static boolean isFinished(){
        return false;
    }
    @Overide
    protected static void execute(){
        BallIntake.backwardMotor1();
        BallIntake.forwardMotor2();
    }
}





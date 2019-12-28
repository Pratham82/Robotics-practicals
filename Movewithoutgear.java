import ch.aplu.robotsim.*;
class Movewithoutgear
{
  Movewithoutgear()
  {
    TurtleRobot robot = new TurtleRobot();
    robot.forward(100);
    robot.left(90);
    robot.forward(100);
    robot.right(90);
    robot.forward(100);
    robot.exit();
  }
  public static void main(String[]args)
  {
    new Movewithoutgear();
  }
}            
                                               

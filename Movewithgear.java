import ch.aplu.robotsim.*;
class Movewithgear
{
  Movewithgear()
  {
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    robot.addPart(gear);
    gear.forward(2000);
    gear.setSpeed(30);
    gear.left(480);
    gear.forward(2000);
    gear.right(480);
    gear.forward();
    robot.exit();
  }
  public static void main(String[] args)
  {
    new Movewithgear();
  }
}


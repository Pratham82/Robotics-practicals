import ch.aplu.robotsim.*;
class Movewithgear{
    Movewithgear(){
        NxtRobot robot= new NxtRobot();
        Gear gear= new Gear();
        robot.forward(1000);
        gear.setspeed(30);
        gear.forward(500);
        gear.left(90);
        gear.right(90);
        gear.forward(1000);
        gear.left(90);
        robot.exit();
    }
    public static void main (Stirng[]args){
        new Movewithgear();
    }
}

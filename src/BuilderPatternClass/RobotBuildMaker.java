package BuilderPatternClass;

/*
 The RobotBuilder maker class
 has now implemented the methods
 required to make a robot and
 provided the creation implementation
 via the Robot object. The Robot
 object instantiate in the via
 the constructor

 */
public class RobotBuildMaker implements RobotBuilder {

    private Robot robot;

    public RobotBuildMaker() {
        this.robot = new Robot();
    }


    @Override
    public void buildArms() {
        robot.setRobotArms("Tin Arms");
    }

    @Override
    public void buildLegs() {
      robot.setRobotLegs("Iron Legs");
    }

    @Override
    public void buildBody() {
        robot.setRobotBody("Carbon Body");
    }

    @Override
    public void buildHead() {
      robot.setRobertHead("Carbon Head");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}

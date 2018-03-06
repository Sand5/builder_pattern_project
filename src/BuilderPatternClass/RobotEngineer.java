package BuilderPatternClass;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotbuilder){
        this.robotBuilder = robotbuilder;

    }

    public Robot getRobort(){

        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {

        robotBuilder.buildArms();
        robotBuilder.buildBody();
        robotBuilder.buildHead();
        robotBuilder.buildLegs();
    }
}

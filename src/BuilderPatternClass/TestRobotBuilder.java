package BuilderPatternClass;



public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new RobotBuildMaker();

        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot robot_one = robotEngineer.getRobort();

        System.out.println(robot_one.getArms());
        System.out.println(robot_one.getLegs());
        System.out.println(robot_one.getBody());
        System.out.println(robot_one.getHead());



        }
    }

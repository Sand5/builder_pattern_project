package BuilderPatternClass;
/*
This is our Robot builder interface
which will list out all of the methods
our robot class needs to someday make
a robot
 */

public interface RobotBuilder {

    void buildArms();
    void buildLegs();
    void buildBody();
    void buildHead();
     Robot getRobot();
}

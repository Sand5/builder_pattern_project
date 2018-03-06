package BuilderPatternClass;


/*
The Robot class is going to
implement the RobotPlan
methods and create some
implementation for the methods
with some setter methods
and provide some getter methods
 */
public class Robot implements RobotPlan {

    private String head;
    private String arms;
    private String body;
    private String legs;

    @Override
    public void setRobertHead(String head) {
      this.head = head;
    }

    @Override
    public void setRobotArms(String arms) {
    this.arms = arms;
    }

    @Override
    public void setRobotBody(String body) {
     this.body = body;
    }

    @Override
    public void setRobotLegs(String legs) {
     this.legs = legs;
    }

    public String getHead() {
        return head;
    }

    public String getArms() {
        return arms;
    }

    public String getBody() {
        return body;
    }

    public String getLegs() {
        return legs;
    }
}

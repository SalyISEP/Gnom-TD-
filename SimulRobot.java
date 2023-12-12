public class SimulRobot{
  public static void main(String[]args){
    Robot robot1=new Robot("Djamil 2.0");
    robot1.sePromener();
    robot1.stop();
    System.out.println("Niveau de combus :" + robot1.getNiveau());
  }  
}

import java.awt.*;
public class Robot{
  String nom;
  Point position;
  int vitesse;
  private int Niveau;
  
  public Robot(String MonRobot){
    nom=MonRobot ;
    position=new Point(0,0);
    vitesse=0;  
  }
  public Robot(String MonRobot,int x, int y, int vitesse){
    nom=MonRobot;
    position=new Point(x,y);
    this.vitesse=vitesse;
  }
  public void AllerALEST(){
    position.translate(vitesse,0);
  }
  
   public void AllerALOUEST(){
    position.translate(-vitesse,0);
  }
  
  public void AllerAuNord(){
    position.translate(0,vitesse);
  }
  
  public void AllerAuSud(){
    position.translate(0,-vitesse);
  }
  
  public void accelerer(){
    if(vitesse<10)
    {
      vitesse++;
    }
  }
  
  public void decelerer(){
    vitesse--;
    if (vitesse==0)
    {
      stop();
    }
  }
  
   public void stop(){
    vitesse=0;
  }
  
  public Point getPosition(){
    return position;
  }
  
  public void sePresenter(){
    System.out.println("nom:"+ nom +" position: " +position);
  }
  public void setNiveau(int n){
    this.Niveau=0+ ((int)Math.random()*100);
  }
  public int getNiveau(){
    int n=0;
    if(n>0)
    {
      System.out.println("le robot ne se deplace pas");
    }
    return Niveau;
  }
  public void sePromener(){
    int randomDirection=0+ (int)(Math.random()*3);
    switch (randomDirection)
    {
      case 0:
        AllerALEST();
        break;
      case 1:
        AllerALOUEST();
        break;
      case 2:
        AllerAuNord();
        break;
      case 3:
        AllerAuSud();
        break;
      }
  }
}

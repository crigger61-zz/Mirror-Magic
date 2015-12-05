public class GameObject{
     //Moveable parameters
     private double positionX;
     private double positionY;
     private double speedX;
     private double speedY;
     
     //Constructor for just position given;
     public GameObject(double px,double py){
          positionX=px;
          positionY=py;
          speedX=0;
          speedY=0;
     }
     //Constructor for all given;
     public GameObject(double px,double py,double sx,double sy){
          positionX=px;
          positionY=py;
          speedX=sx;
          speedY=sy;
     }
     public void update(){
          
     }
}
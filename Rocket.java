import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Actor
{
    public Rocket(){
        setRotation(180);
    }
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        
        if(getX() <= 0){
            resetLocation();
        }
    }
    
    public void resetLocation(){
        int num = Greenfoot.getRandomNumber(2);
        
        if(num == 0){
            setLocation(600,100);
        }else{
            setLocation(600,300);
        }
    }
}

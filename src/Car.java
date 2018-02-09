
public class Car 
    {
    static int distanse;
 
    public void start(){
        
    }
    public void stop(){
        
    }
    public static int drive(int howlong){
        distanse=howlong*60;
        return(1);
            
    }
    public static void main(String[] args) 
    {   
        Car myCar=new Car();
        myCar.drive(55);
        System.out.println(distanse);   
    }
    
        
    }
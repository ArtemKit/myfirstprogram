
public class JamesBondCar extends Car {
		//��� ������� �������������� �����  
		         public int drive(int howlong)
		        {
		        distanse=howlong*180;
		        return(1);
		        }
		 
		    
		    public static void main(String[] args)
		        {
		        Car myCar=new Car();
		        myCar.drive(2);
		        System.out.println(distanse);
		        }
}

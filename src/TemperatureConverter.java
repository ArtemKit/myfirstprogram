public class TemperatureConverter {
 
public float convertTemp (int temperature, char convertTo){
	int convertTemp = 0;
	if (convertTo=='F')
	{
	convertTemp = temperature*9/5+32;
}
	else if (convertTo=='C')
	{
	convertTemp = (temperature-32)*5/9;
}
return convertTemp;
}
 
public static void main(String[] args){
TemperatureConverter rc = new TemperatureConverter();
float yourTemp = rc.convertTemp(88,'F');
System.out.println(yourTemp);
}
}
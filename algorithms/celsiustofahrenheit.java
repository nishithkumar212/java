package algorithms;
import bridgeit.utility;
public class celsiustofahrenheit
{
public static void main(String[] args)
{
	System.out.println("enter the temperature you want either celcius or fahreinheit");
	double temp=utility.getdouble();
	utility.temperatureconvert(temp);
}
}

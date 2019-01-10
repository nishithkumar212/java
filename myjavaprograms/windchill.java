package myjavaprograms;
import bridgeit.utility;
public class windchill 
{
public static void main(String[] args) 
{
System.out.println("enter the temperature value");
double t=utility.getdouble();
if(t<50&&t>3)
{
System.out.println("enter the wind speed");
double v=utility.getdouble();
double vindspeed=Math.pow(t, v);
System.out.println("the vind speed is"+vindspeed);
double formula=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
System.out.println("the effective temperature is"+formula);
}
else
{
	System.out.println("temperature should be less than 50 and and greater than 3");
}
}
}



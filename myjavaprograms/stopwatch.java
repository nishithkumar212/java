package myjavaprograms;
import bridgeit.utility;
public class stopwatch
{
	private long startTime=0;
	private long stoptime=0;
	boolean status=false;
	public void start()
	{
		this.startTime=System.currentTimeMillis();
		this.status=true;
	}
	public void stop()
	{
		this.stoptime=utility.stop();
		this.status=false;
	}
	public long timedifference()
	{
		    long elapsed;
		    if (status) {
		         elapsed = (System.currentTimeMillis() - startTime);
		    }
		    else {
		        elapsed = (stoptime - startTime);
		    }
		    return elapsed;
		}
public static void main(String[] args)
{
	stopwatch s=new stopwatch();
	s.start();
	s.stop();
	System.out.println(s.timedifference());
}
}





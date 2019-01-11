package oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Json 
{
public static void main(String[] args) throws FileNotFoundException
{
	JSONObject rice =new JSONObject();
	rice.put("name", "basmathi");
	rice.put("weight", "30kg");
	rice.put("price", "3000");
	JSONObject Rice1=new JSONObject();
	Rice1.put("rice", rice);
	JSONObject pulses =new JSONObject();
	pulses.put("name", "pesar");
	pulses.put("weight", "5kg");
	pulses.put("price", "120");
	JSONObject pulses1=new JSONObject();
	pulses1.put("pulses",pulses);
	JSONObject wheat=new JSONObject();
	wheat.put("name", "godham");
	wheat.put("weight", "5kg");
	wheat.put("price", "150");
	JSONObject wheat1=new JSONObject();
	wheat1.put("wheat", wheat);
	JSONArray array=new JSONArray();
	array.add(Rice1);
	array.add(pulses1);
	array.add(wheat1);
	try {
		FileWriter fw=new FileWriter("jsonfile");
		fw.write(array.toString());
		fw.flush();
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
	JSONParser jp=new JSONParser();
	FileReader fr=new FileReader("jsonfile");
	try {
		Object object1=jp.parse(fr);
		            JSONArray array1 =(JSONArray)object1;
		            System.out.println(array1);
		            array1.forEach( emp -> parseData( (JSONObject) emp ));
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void parseData(JSONObject array1 )
	{
}
}











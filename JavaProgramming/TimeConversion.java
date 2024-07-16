import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class TimeConversion {
	
	public static void main(String[] args) 
	{
		 IST_UTC();
		IST_Unix(); 
		 UTC_Local();
	    }


	
	       static void IST_UTC() 
	       {
	       
	        String userInput = "29/01/2024 01:00";
	        SimpleDateFormat istFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        istFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

	        try {
	            Date istDate = istFormat.parse(userInput);
	            SimpleDateFormat utcFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	            String utcTimestamp = utcFormat.format(istDate);
	            System.out.println("Local Timestamp (IST): " + userInput);
	            System.out.println("UTC Timestamp: " + utcTimestamp);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            
	        }
	    }
	       
	       static void IST_Unix() 
	       {
	        String userInput = "29/01/2024 01:00";

	        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");

	        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        inputDateFormat.setTimeZone(istTimeZone);

	        try 
	        {
	            
	            Date userDate = inputDateFormat.parse(userInput);
	            long unixTimestamp = userDate.getTime();
	            unixTimestamp /= 1000;
	            System.out.println("Local Timestamp (IST): " + userInput);
	            System.out.println("Unix Timestamp: " + unixTimestamp);
	        } catch (ParseException e)
	        {
	            e.printStackTrace();
	           
	        }
	      }
	       static void UTC_Local()
	       {
	           
	           String utcInput = "29/01/2024 01:00";
	           SimpleDateFormat utcFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	           utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

	           try
	           {
	            
	               Date utcDate = utcFormat.parse(utcInput);
	               SimpleDateFormat localFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	               localFormat.setTimeZone(TimeZone.getDefault()); 
	               String localTimestamp = localFormat.format(utcDate);
	               
	               System.out.println("UTC Timestamp: " + utcInput);
	               System.out.println("Local Timestamp: " + localTimestamp);
	           } 
	           catch (ParseException e)
	           {
	               e.printStackTrace();
	           }
	       }
}
	       
	

	




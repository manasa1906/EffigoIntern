import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateOperations {
	
	    static String addOneDay(String timestamp) 
	    {
	        return performOperation(timestamp, Calendar.DAY_OF_MONTH, 1);
	    }
	    static String subtractTenDays(String timestamp) {
	        return performOperation(timestamp, Calendar.DAY_OF_MONTH, -10);
	    }
	    static String addOneHour(String timestamp) {
	        return performOperation(timestamp, Calendar.HOUR_OF_DAY, 1);
	    }
	    static String subtractFiveHoursThirtyMinutes(String timestamp) {
	        Calendar calendar = parseToCalendar(timestamp);
	        calendar.add(Calendar.HOUR_OF_DAY, -5);
	        calendar.add(Calendar.MINUTE, -30);
	        return formatFromCalendar(calendar);
	    }
	    static List<String> sortTimestamps(List<String> timestamps) {
	        List<Date> dates = new ArrayList<>();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        for (String timestamp : timestamps) {
	            try {
	                Date date = formatter.parse(timestamp);
	                dates.add(date);
	            } catch (ParseException e) {
	                e.printStackTrace();
	            }
	        }
	        dates.sort(Comparator.naturalOrder());
	        List<String> sortedTimestamps = new ArrayList<>();
	        for (Date date : dates) {
	            sortedTimestamps.add(formatter.format(date));
	        }

	        return sortedTimestamps;
	    }
	    private static String performOperation(String day, int field, int amount) {
	        Calendar calendar = parseToCalendar(day);
	        calendar.add(field, amount);
	        return formatFromCalendar(calendar);
	    }
	    private static Calendar parseToCalendar(String timestamp) {
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        try {
	            Date date = formatter.parse(timestamp);
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date);
	            return calendar;
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	    private static String formatFromCalendar(Calendar calendar) {
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        return formatter.format(calendar.getTime());
	    }

	    public static void main(String[] args) {
	        String userInput = "29/01/2024 01:00";
	        String result1 = addOneDay(userInput);
	        System.out.println("After adding one day: " + result1);
	        String result2 = subtractTenDays(userInput);
	        System.out.println("After subtracting 10 days: " + result2);
	        String result3 = addOneHour(userInput);
	        System.out.println("After adding one hour: " + result3);
	        String result4 = subtractFiveHoursThirtyMinutes(userInput);
	        System.out.println("After subtracting 5 hours and 30 minutes: " + result4);
	        List<String> timestamps = Arrays.asList(userInput, result1, result2, result3, result4);
	        List<String> sortedTimestamps = sortTimestamps(timestamps);
	        System.out.println("Sorted Timestamps: " + sortedTimestamps);
	    }
	}




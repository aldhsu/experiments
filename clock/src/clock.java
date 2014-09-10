import java.util.*;

class Clock {
	public static void main (String[] args) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);
		int seconds = now.get(Calendar.SECOND);
		int dayornight = now.get(Calendar.AM_PM);
		String greeting = (hour < 12)? "Good morning" : (hour < 5)? "Good afternoon": "Good evening";
		System.out.println(greeting);
		System.out.println(dayornight);		
	}
}
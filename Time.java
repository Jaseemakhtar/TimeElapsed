import java.util.*;
import java.util.concurrent.*;
class Time{
	public static void main(String[] args){
		Calendar cur = Calendar.getInstance();
		long curr = cur.getTimeInMillis();
		long pass = 1546337520000l;

		long diff = curr - pass;

		Calendar elap = Calendar.getInstance();
		elap.setTimeInMillis(diff);
		
		System.out.println("Current: " + cur.get(Calendar.HOUR) + ":" + cur.get(Calendar.MINUTE) + ":" + cur.get(Calendar.SECOND));

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(diff);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diff);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(diff);
		long diffInDays = TimeUnit.MILLISECONDS.toDays(diff);

		System.out.println("Elapsed: " + diffInHours + ":" + diffInMinutes + ":" + diffInSeconds);

		
	}
}

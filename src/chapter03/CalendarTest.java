package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		printDate(calendar);
		
//		calendar.set(year, month, date, hourOfDay, minute, second);
		
		calendar.set(2015, 10, 18);              // 기준일
		calendar.add(Calendar.DATE, 700);		 // 700일 더한 일
		printDate(calendar);
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

	}
	
	public static void printDate(Calendar calendar){
		String[] days = {" 일","월","화","수","목","금","토"};
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);       // +1
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		int day = calendar.get(calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		System.out.println(year+ "년 " + (month+1) + "월" + date + "일" + days[day-1] + "요일" + hour + ":" + min + ":" + seconds);
		
		
	}
}

package calendar.model;

import java.time.LocalDateTime;

//Class for the date & time
public class Calendar 
{
	
	public String getDate()
	{
		String date = "The date is ";

		LocalDateTime currentDate = LocalDateTime.now();

		String day = currentDate.getDayOfWeek().toString();
		
		date += day + ", the ";

		day = currentDate.getDayOfMonth() + "";

		date += day;

		String month = " of " + currentDate.getMonth().toString();

		date += month;

		date += ", " + currentDate.getYear() + "\n";

			return date;
	}


	public String getTime()
	{	
		String time = "The time is ";
	
		LocalDateTime currentTime = LocalDateTime.now();
	
		time += currentTime.getHour() + ":";
		time += currentTime.getMinute() + "\n";
	

			return time;
	}
}

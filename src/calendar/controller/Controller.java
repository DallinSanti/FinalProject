package calendar.controller;

import javax.swing.JOptionPane;

import calendar.view.CalendarFrame;
import calendar.view.DaysPanel;
import calendar.model.Calendar;

/**
 * @author dsan1423
 * This will start the welcome panel and show the date & time
 */
public class Controller
{
private CalendarFrame frame;
private Calendar calendar;
	
	public Controller()
	{
		this.calendar = new Calendar();
		frame = new CalendarFrame(this);
	}
	
	/**
	 * Displays welcome message
	 */
	public void start()
	{
		String date = calendar.getDate();
		String time = calendar.getTime();
		JOptionPane.showMessageDialog(frame,  "Welcome to Java Calendar! \n" + date
				+ time + "Click the ''Calendar'' button to continue to the calendar!");
	}
	
	/**
	 * Handles errors
	 * @param error
	 */
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(frame,  error.getMessage(), "Calendar Error!",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public CalendarFrame getFrame()
	{
		return frame;
	}
	
	

}

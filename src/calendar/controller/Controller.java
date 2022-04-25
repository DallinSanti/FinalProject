package calendar.controller;

import javax.swing.JOptionPane;

import calendar.view.CalendarFrame;
import calendar.view.CalendarFrame;

public class Controller
{
private CalendarFrame frame;
	
	public Controller()
	{
		frame = new CalendarFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame,  "Welcome to Java Calendar!");
	}
	
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(frame,  error.getMessage(), "Calendar Error!",
				JOptionPane.ERROR_MESSAGE);
	}
}

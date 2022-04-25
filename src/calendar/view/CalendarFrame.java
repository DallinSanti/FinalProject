package calendar.view;

import calendar.controller.Controller;
import javax.swing.JFrame;

import calendar.view.CalendarPanel;

public class CalendarFrame extends JFrame 
{
	private Controller app;
	private CalendarPanel panel;
	
	public CalendarFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new CalendarPanel(this.app);
				
		setupFrame();
	}
		private void setupFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("Welcome to my Java calendar!");
		this.setVisible(true);
	}
}

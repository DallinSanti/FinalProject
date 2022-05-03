package calendar.view;

import calendar.controller.Controller;

import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import calendar.view.CalendarPanel;

public class CalendarFrame extends JFrame 
{
	public static final String CALENDAR_SCREEN = "Calendar";
	public static final String DAYS_SCREEN = "Days";
	
	private JPanel cardPanel;
	private DaysPanel days;
	private Controller app;
	private CalendarPanel panel;
	private JMenuBar calendarMenuBar;
	
	public CalendarFrame(Controller app)
	{
		super();
		this.app = app;
		
		this.panel = new CalendarPanel(this.app);
		
//		Using CardLayout with a MenuBar
		this.days = new DaysPanel(this.app);
		
		this.cardPanel = new JPanel(new CardLayout());
		this.calendarMenuBar = new JMenuBar();
				
		setupMenu();
		setupFrame();
	}
	
		private void setupMenu()
		{
			JMenu screenMenu = new JMenu("Screens");
			JMenuItem calendarScreen = new JMenuItem("Welcome Screen");
			JMenuItem daysScreen = new JMenuItem("Calendar Display");
			
			calendarScreen.setMnemonic(KeyEvent.VK_A);
			daysScreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, 
					ActionEvent.SHIFT_MASK));
			
			calendarScreen.addActionListener(select -> changeScreen(CALENDAR_SCREEN));
			daysScreen.addActionListener(select -> changeScreen(DAYS_SCREEN));
			
			screenMenu.add(calendarScreen);
			screenMenu.add(new JSeparator());
			screenMenu.add(daysScreen);
			calendarMenuBar.add(screenMenu);
		}
		
		public void changeScreen(String screen)
		{
			((CardLayout) cardPanel.getLayout()).show(cardPanel, screen);
		}
	
		private void setupFrame()
	{
//		Setup for the card layout
		cardPanel.add(panel, CALENDAR_SCREEN);
		cardPanel.add(days, DAYS_SCREEN);
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(cardPanel);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("Welcome to my Java calendar!");
		this.setVisible(true);
	}
}

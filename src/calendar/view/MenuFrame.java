package calendar.view;

import calendar.controller.Controller;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame
{
	private Controller controller;
	private CalendarPanel panel;
	
	private JMenuBar menuBar;
	
	public MenuFrame(Controller controller)
	{
		super();
		this.controller = controller;
		this.panel = new CalendarPanel(this.controller);
		this.menuBar = new JMenuBar();
		
		setupMenu();
		setupFrame();
	}
	/**
	 * Dimensions for the JPanel
	 */
	
	private void setupFrame()
	{
		this.setJMenuBar(menuBar);
		this.setTitle("Calendar Project");
		this.setSize(800, 600);
		this.setContentPane(panel);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void setupMenu()
	{
		JMenu calendarMenu = new JMenu("Calendar Menu");
		JMenuItem quitItem = new JMenuItem("Quit Application");
		
		quitItem.addActionListener(select -> System.exit(0));
		
		calendarMenu.add(quitItem);
		menuBar.add(calendarMenu);
	}
	
}

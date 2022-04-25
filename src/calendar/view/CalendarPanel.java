package calendar.view;

import calendar.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.event;
import javax.swing.table;


import javax.swing.SpringLayout;
import java.awt.GridLayout;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


public class CalendarPanel extends JPanel
{
	private Controller controller;
	private JPanel menuPanel;
	private JButton previousButton;
	private JButton nextButton;
	private SpringLayout layout;
	private CalendarPanel calendar;
	private JButton saveButton;


	public CalendarPanel(Controller controller)
	{
		super();
		this.controller = controller;
		this.saveButton = new JButton("Save");
		this.layout = new SpringLayout();
		this.menuPanel = new JPanel(new GridLayout(0,1));
	
		this.calendar = new CalendarPanel(controller);
	
			setupPanel();
			setupListeners();
			setupLayout();
	}

	private void setupPanel()
	{
		
	}

	private void setupListeners()
	{
		
	}

	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.EAST, menuPanel, -25, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, calendar);
		layout.putConstraint(SpringLayout.WEST, menuPanel, 10, SpringLayout.EAST, calendar);
		layout.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, calendar);
		layout.putConstraint(SpringLayout.NORTH, calendar, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, calendar, 25, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, calendar, -25, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, calendar, -125, SpringLayout.EAST, this);
	}

}
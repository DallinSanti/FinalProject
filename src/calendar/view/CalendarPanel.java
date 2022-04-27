package calendar.view;

import calendar.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import javax.swing.SpringLayout;
import java.awt.GridLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.Calendar;


import javax.swing.*;

//public class CurrentDateTime
//{
//	public static void main(String[] args) 
//	{  
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));
//		
//		Calendar calObject = Calendar.getInstance();
//		System.out.println(dtf.format(calObject.getTime()));
//	}  
//}

public class CalendarPanel extends JPanel
{
	private Controller controller;
	private JPanel menuPanel;
	private JButton previousButton;
	private JButton nextButton;
	private SpringLayout layout;
	private JButton saveButton;


	public CalendarPanel(Controller controller)
	{
		super();
		this.controller = controller;
		this.saveButton = new JButton("Save");
		this.layout = new SpringLayout();
		this.menuPanel = new JPanel(new GridLayout(0,1));
	
	
			setupPanel();
			setupListeners();
			setupLayout();
	}

	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.DARK_GRAY);;
		
		this.add(menuPanel);
		menuPanel.add(saveButton);
	}

	private void setupListeners()
	{
		
	}

	private void setupLayout()
	{
		
	}

}
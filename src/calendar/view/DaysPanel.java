package calendar.view;

import javax.swing.JPanel;
import calendar.controller.Controller;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

import java.io.*;
import java.util.Scanner;

import java.awt.Color;

/**
 * @author dsan1423
 * This panel controls everything that happens after the "Calendar" button is pressed
 */
public class DaysPanel extends JPanel
{
//	Color
	public DaysPanel(Controller controller)
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		this.gatherInfo();
	}
	
	private void gatherInfo()
	{
	Scanner sc = new Scanner(System.in);
	
	
	
	String yearText = JOptionPane.showInputDialog(null, "What year?");
	int  yearNum = Integer.parseInt(yearText);
	

	String monthText = JOptionPane.showInputDialog(null, "What month(digits)");
	int monthNum = Integer.parseInt(monthText);
	String dateInfo = "";
	
	/**
	 * Ints for the days
	 */

	int d = 1;
	int m = 1;
	int y = 1;
	int dy = 1;
	
	String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	
	String month[] = 
		{ 
				"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" 
		};
		
	/**
	 * Array list for the amount of days in the month	
	 */
	int ar[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int monthOffset[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	
	while (true)
	{
		if (d == 1 && m == monthNum && y == yearNum)
		{
			break;
		}
		
		if (y % 4 == 0 && y % 100 != 0 || y % 100 == 0)
		{
			ar[1] = 29;
			monthOffset = new int[] { 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };
		}
		
		else
		{
			ar[1] = 28;
			monthOffset = new int[] { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		}
		d++;
		
		if (d > ar[m - 1])
		{
			m++;
			d = 1;
		}
		
		if (m > 12)
		{
			m = 1;
			y++;
		}
		

	}
	

	
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	{
		ar[1] = 29;
		monthOffset = new int[] { 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };
	}
	
	else
	{
		ar[1] = 28;
		monthOffset = new int[] { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	}
	
	dateInfo += "Month: " + month[monthNum -1] +"\n" + "";
	
	JLabel dateInfoLabel = new JLabel();
	dateInfoLabel.setText(dateInfo);
	add(dateInfoLabel);
	System.out.println(dateInfo);
	
	JLabel daysOfTheMonthLabel = new JLabel();
	String daysOfTheMonth = "";

	for (int k = 0; k < 7; k++)
	{
		daysOfTheMonth += "   " + day[k];
		System.out.printf("   " + day[k]);

	}
	daysOfTheMonthLabel.setText(daysOfTheMonth);
	add(daysOfTheMonthLabel);
	
	System.out.println();
	
	/**
	 * Below is the equation to get the start of the month using a gregorian calendar
	 */
	int year = yearNum - 1;
	int beginningDay = (1 + monthOffset[monthNum - 1] + 5*(year % 4) + 4*(year % 100) + 6*(year % 400)) % 7;
	System.out.println();
	System.out.println(beginningDay);
	
	int spaces = beginningDay;
	System.out.println(spaces);
	if (spaces < 0)
	{
		spaces = 6;
	}
	JLabel daysLabel = new JLabel();
	String daysLayout = "<HTML>";

	/**
	 * HMTL code for the spacing in the actual calendar part
	 */
	
	for (int i = 0; i < spaces; i++)
	{
		daysLayout += "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
	}
	for (int i = 1; i <= ar[monthNum - 1]; i++)
	{
		if (i <= 9)
		{
			daysLayout += "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;" + i;
		} 
		else
		{
			daysLayout += "&nbsp&nbsp&nbsp&nbsp&nbsp;" + i;
		}
		System.out.printf(" %4d ", i);
		
		if (((i + spaces) % 7 == 0) || (i == ar[monthNum - 1]))
		{
			daysLayout += "<br/>";
		}
			
			

	}
	daysLayout += "</html>";
		daysLabel.setText(daysLayout);
		add(daysLabel);
		
 }
}

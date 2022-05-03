package calendar.view;

import javax.swing.JPanel;
import calendar.controller.Controller;
import javax.swing.JOptionPane;

import java.io.*;
import java.util.Scanner;

import java.awt.Color;

public class DaysPanel extends JPanel
{
//	Color
	public DaysPanel(Controller controller)
	{
		this.setBackground(Color.RED);
	}
	
	private void gatherInfo()
	{
	
	Scanner sc = new Scanner(System.in);
	
	//System.out.println("Enter the year: ");
	
	String yearText = JOptionPane.showInputDialog(null, "What year?");
	int  yearNum = Integer.parseInt(yearText);
	
	//int yy = sc.nextInt();
	
	//System.out.println("Enter month: ");
	String monthText = JOptionPane.showInputDialog(null, "What month(digits)");
	int monthNum = Integer.parseInt(monthText);
	String dateInfo = "";
	
	//int mm = sc.nextInt();
	int d = 1;
	int m = 1;
	int y = 1;
	int dy = 1;
	
	String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	
	String month[] = 
		{ 
				"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "Novemeber", "December" 
		};
		
		
	int ar[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	while (true)
	{
		if (d == 1 && m == monthNum && y == yearNum)
		{
			break;
		}
		
		if (y % 4 == 0 && y % 100 != 0 || y % 100 == 0)
		{
			ar[1] = 29;
		}
		
		else
		{
			ar[1] = 28;
		}
		dy++;
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
		
		if (dy == 7)
		{
			dy = 0;
		}
	}
	
	int c = dy;
	
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	{
		ar[1] = 29;	
	}
	else
	{
		ar[1] = 28;
	}
	
	dateInfo += "Month:" + month[monthNum -1] +"\n";
	
	for (int k = 0; k < 7; k++)
	{
		dateInfo += " " + day[k];
	}
	
	System.out.println();
	
	for (int j = 1; j <= (ar[monthNum - 1] + dy); j++)
	{
		if (j < 6) 
		{
			dy = dy % 6;
		}
	}
	
	int spaces = dy;
	if (spaces < 0)
		spaces = 6;
	
	for (int i = 0; i < spaces; i++)
		System.out.println("  ");
	for (int i = 1; i <= ar[monthNum - 1]; i++)
	{
		System.out.printf(" %4d ", i);
		
		if (((i + spaces) % 7 == 0) || (i == ar[monthNum - 1]))
			System.out.println();
	}
	
	
	}	
}

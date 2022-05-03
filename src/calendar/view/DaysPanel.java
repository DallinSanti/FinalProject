package calendar.view;

import javax.swing.JPanel;
import calendar.controller.Controller;

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
	
	public static void main(String a[])
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the year : ");
	int yy = sc.nextInt();
	
	System.out.println("Enter month : ");
	
	int mm = sc.nextInt();
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
		if (d == 1 && m == mm && y == yy)
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
	
	System.out.println("Month:" + month[mm -1]);
	
	for (int k = 0; k < 7; k++)
	{
		System.out.println(" " + day[k]);
	}
	
	System.out.println();
	
	for (int j = 1; j <= (ar[mm - 1] + dy); j++)
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
	for (int i = 1; i <= ar[mm - 1]; i++)
	{
		System.out.printf(" %4d ", i);
		
		if (((i + spaces) % 7 == 0) || (i == ar[mm - 1]))
			System.out.println();
	}
	
	
}
}

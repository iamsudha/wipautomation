package com.wip.training;

public class convdaystomonthsnweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noofdays =459;
		int days = 0;
		int year = 0;
		int month = 0;
		int week = 0;

//System.out.println("Enter the number of days to be converted");
//noofdays = input.nextInt();

for(int i=1; i < noofdays; i++)
{
	if((i % 30) == 0)
		month++;
	if((i % 7) == 0)
        week++;
	if((i % 365) == 0)
		++year;
	if((i % 1) == 0)
		days++;
}

System.out.println("Year: " + year);
System.out.println("Month: " + month);
System.out.println("Week: " + week);
System.out.println("Days: " + days);
	}

}

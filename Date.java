package project;

public class Date 
{
	private int month;
	private int day;
	private int year;
	
	public Date(int day, int month, int year) 
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getMonth() 
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public void setDay(int day) 
	{
		this.day = day;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public Date() 
	{
		this.month = 01;
		this.day = 01;
	 	this.year = 2000;
	}
	   
	public String standardDateEquivalent() 
	{
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		return String.format("%02d-%s-%04d", day, months[month - 1], year);
	}

}

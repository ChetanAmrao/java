package assignment1;

public class Date {

	private int day, month, year;

	public Date() {
		super();
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	public String toString()
	{
		return " Date: "+day+"/"+month+"/"+year;
	}
	
}



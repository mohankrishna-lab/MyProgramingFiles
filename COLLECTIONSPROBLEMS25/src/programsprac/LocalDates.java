package programsprac;

import java.time.LocalDate;

public class LocalDates
{

	public static void main(String[] args) 
	{
		int y = 1998;
		int m = 11;
		int da = 06;
		LocalDate d = LocalDate.of(y,m,da);
		System.out.println(d.getDayOfWeek());
	}

}

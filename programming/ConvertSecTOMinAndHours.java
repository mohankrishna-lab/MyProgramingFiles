import java.util.Scanner;
class ConvertSecTOMinAndHours 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the seconds");
		int sec = sc.nextInt();
		int hours = toHour(sec);
		int min1 = (sec - hours*3600)/60;
		int sec1 = sec - (hours*3600 + min1*60);
		System.out.println(hours + ":" + min1 + ":" + sec1);
		
	}

	public static int toHour(int sec)
	{
		int hours = sec/3600;
		return hours;
	}
}

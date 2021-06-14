package programsofjava;

public class Watches 
{
	private int hours;
	private int min;
	private int sec;
	public Watches(int hours, int min, int sec) {
		super();
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public String toString()
	{
		return hours+ ":" +min+ ":" + sec;
	}
	
	public boolean equals(Object obj)
	{
		Watches w = (Watches)obj;
		return this.hours == w.hours && this.min == w.min && this.sec == w.sec;
	}
}

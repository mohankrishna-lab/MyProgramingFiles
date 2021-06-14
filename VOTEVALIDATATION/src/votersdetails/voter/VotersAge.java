package votersdetails.voter;

public class VotersAge
{
	public static void main(String[] args)
	{
		Voters v1 = new Voters("krishna" , 22);
		v1.eligibleOrNot();
		Voters v2 = new Voters("mohan" , 12);
		v2.eligibleOrNot();
		System.out.println(v2.getAge());
		v2.SetAge(33);
		System.out.println(v2.getAge());
		v2.eligibleOrNot();
	}
}

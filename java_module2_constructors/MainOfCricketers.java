class MainOfCricketers 
{
	public static void main(String[] args) 
	{
		Cricketers c1 = new Cricketers("Virat Kohli" , 32 , "India" , 12040);
		Cricketers c2 = new Cricketers("Rohit Sharma" , 33 , "India" , 9115);
		Cricketers c3 = new Cricketers("Steve Smith" , 31 , "Australia" , 4378);
		Cricketers c4 = new Cricketers("Chris Gayle" , 41 , "West Indies" , 7215);
		Cricketers c5 = new Cricketers("Ajinkya Rahane" , 32 , "India" , 2962);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Name\t\t\tAge\t\tCountry\t\t\tTotal Runs");
		System.out.println("--------------------------------------------------------------------------");

		System.out.print(c1.name);
		System.out.print("\t\t" + c1.age);
		System.out.print("\t\t" + c1.country);
		System.out.println("\t\t\t" + c1.totalRuns);
		System.out.println("");

		System.out.print(c2.name);
		System.out.print("\t\t" + c2.age);
		System.out.print("\t\t" + c2.country);
		System.out.println("\t\t\t" + c2.totalRuns);
		System.out.println("");

		System.out.print(c3.name);
		System.out.print("\t\t" + c3.age);
		System.out.print("\t\t" + c3.country);
		System.out.println("\t\t" + c3.totalRuns);
		System.out.println("");

		System.out.print(c4.name);
		System.out.print("\t\t" + c4.age);
		System.out.print("\t\t" + c4.country);
		System.out.println("\t\t" + c4.totalRuns);
		System.out.println("");

		System.out.print(c5.name);
		System.out.print("\t\t" + c5.age);
		System.out.print("\t\t" + c5.country);
		System.out.println("\t\t\t" + c5.totalRuns);
		System.out.println("");
	}
}

class Cricketers
{
	String name;
	int age;
	String country;
	int totalRuns;

	public Cricketers(String a , int b , String c , int d)
	{
		name = a;
		age = b;
		country = c;
		totalRuns = d;
	}
}

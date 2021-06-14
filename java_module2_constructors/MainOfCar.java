class MainOfCar 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("range rover" , 444444.00 , "red" , 1998);
		Car c2 = new Car("benz" , 55555555.00 , "white" , 1994);
		Car c3 = new Car("ford" , 66666666.66 , "green" , 1996);
		
		System.out.println("three different car I like");
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.yOM);
		System.out.println("-------------------");

		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.color);
		System.out.println(c2.yOM);
		System.out.println("-------------------");

		System.out.println(c3.name);
		System.out.println(c3.price);
		System.out.println(c3.color);
		System.out.println(c3.yOM);
		System.out.println("-------------------");

	}
}

class Car
{
	String name;
	double price;
	String color;
	int yOM;//year Of Manufacture

	public Car(String a , double b , String c , int d)
	{
		name = a;
		price = b;
		color = c;
		yOM = d;
	}
}

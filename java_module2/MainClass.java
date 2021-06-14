class Student 
{
	int id;
	String name;
	Double marks;

	{
		id = 111;
		name = "Dinga";
		marks = 66.6;
	}
}

class Car
{
	String name;
	Double price;
	String color;

	{
		name = "Ranger";
		price = 44444.46;
		color = "Green";
	}
}
 
 class Faculty
 {
	 int id;
	 String name;
	 Double sal;

	 {
		 id = 11;
		 name = "Shubham";
		 sal = 90.9;
	 }
 }

 class MainClass
 {
	 public static void main(String[] args)
	 {
		  Student s=new Student();
		 System.out.println("sid=" + s.id);
		 System.out.println("sname=" + s.name);
		 System.out.println("smarks=" + s.marks);
		 System.out.println("---------------------------");

		  Car c=new Car();
		 System.out.println("cname=" + c.name);
		 System.out.println("cprice=" + c.price);
		 System.out.println("ccolor=" + c.color);
		 System.out.println("---------------------------");


		  Faculty f=new Faculty();
		 System.out.println("fid=" + f.id);
		 System.out.println("fname=" + f.name);
		 System.out.println("fsal=" + f.sal);
	 }
 }
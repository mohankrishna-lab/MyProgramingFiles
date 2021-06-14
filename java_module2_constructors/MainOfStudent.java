class MainOfStudent 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(111,"dinga",55.78);
		Student s2 = new Student(112,"dingi",65.89);
		Student s3 = new Student(113,"pinga",66.66);
		Student s4 = new Student(114,"pingi",69.76);

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println("-----------------------------");

		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println("-----------------------------");

		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.marks);
		System.out.println("-----------------------------");

		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println(s4.marks);
	}
}

class Student
{
	int id;
	String name;
	double marks;

	public Student(int a,String b,double c)
	{
		id = a;
		name = b; 
		marks = c;
	}
}

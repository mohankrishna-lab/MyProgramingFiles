class MainStudent 
{
	public static void main(String[] args) 
	{
		Student.cname="NHCE";
		Student.caddress="Bellandur";
		Student s1=new Student();
		s1.id=111;
		s1.name="dinga";
		s1.marks=58.9;
		System.out.println("---------------------------------");
		System.out.println("Student id:"+s1.id);
		System.out.println("Student name:"+s1.name);
		System.out.println("Student marks:"+s1.marks);
		System.out.println("Student college name:"+Student.cname);
		System.out.println("Student college address:"+Student.caddress);
		Student s2=new Student();
		s2.id=112;
		s2.name="pinga";
		s2.marks=78.9;
		System.out.println("---------------------------------");
		System.out.println("Student id:"+s2.id);
		System.out.println("Student name:"+s2.name);
		System.out.println("Student marks:"+s2.marks);
		System.out.println("Student college name:"+Student.cname);
		System.out.println("Student college address:"+Student.caddress);
		Student s3=new Student();
		s3.id=113;
		s3.name="malinga";
		s3.marks=76.99;
		System.out.println("---------------------------------");
		System.out.println("Student id:"+s3.id);
		System.out.println("Student name:"+s3.name);
		System.out.println("Student marks:"+s3.marks);
		System.out.println("Student college name:"+Student.cname);
		System.out.println("Student college address:"+Student.caddress);


	}
}
class Student
{
	int id;
	String name;
	double marks;
	static String cname;
	static String caddress;

}

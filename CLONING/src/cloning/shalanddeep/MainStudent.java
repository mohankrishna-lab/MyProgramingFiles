package cloning.shalanddeep;

public class MainStudent 
{

	public static void main(String[] args) 
	{
		Address a  = new Address(12,32,2);
		Student s = new Student("diga",111,34.54,a);
		
		Student s1 = (Student)s.clone();
		
		s1.setName("pinga");
		s1.a.setDoorNo(30);
		
		s1.setid(112);
		
		System.out.println(s);
		System.out.println(s1);
		
	}
}

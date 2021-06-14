class Faculty
{
	int id;
	String name;
	double salary;
	static String company;
}

class MainFaculty 
{
	public static void main(String[] args) 
	{
		Faculty.company="J-Spiders";
		System.out.println(" ");
		System.out.println("Faculty Details are");
		System.out.println("______________________________");
		System.out.println("------------------------------");
		System.out.print("Id");
		System.out.print("\t\tName");
		System.out.print("\t\tSalary");
		System.out.println("\t\tCompany");
		System.out.println("----------------------------------------------------------");
		Faculty f1=new Faculty();
		f1.id=11;
		f1.name="Imtiaz";
		f1.salary=100.0;
        System.out.print(f1.id);
		System.out.print("\t\t"+f1.name);
		System.out.print("\t\t"+f1.salary);
		System.out.println("\t\t"+Faculty.company);
		Faculty f2=new Faculty();
		f2.id=12;
		f2.name="Shubham";
		f2.salary=90.0;
        System.out.print(f2.id);
		System.out.print("\t\t"+f2.name);
		System.out.print("\t\t"+f2.salary);
		System.out.println("\t\t"+Faculty.company);
		Faculty f3=new Faculty();
		f3.id=13;
		f3.name="Keith";
		f3.salary=90.0;
        System.out.print(f3.id);
		System.out.print("\t\t"+f3.name);
		System.out.print("\t\t"+f3.salary);
		System.out.println("\t\t"+Faculty.company);
		Faculty f4=new Faculty();
		f4.id=14;
		f4.name="Pinga";
		f4.salary=1000.0;
        System.out.print(f4.id);
		System.out.print("\t\t"+f4.name);
		System.out.print("\t\t"+f4.salary);
		System.out.println("\t\t"+Faculty.company);
		Faculty f5=new Faculty();
		f5.id=15;
		f5.name="Malinga";
		f5.salary=99.99;
        System.out.print(f5.id);
		System.out.print("\t\t"+f5.name);
		System.out.print("\t\t"+f5.salary);
		System.out.println("\t\t"+Faculty.company);

		}
}

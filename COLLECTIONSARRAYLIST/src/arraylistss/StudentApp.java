package arraylistss;

import java.util.*;

public class StudentApp
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StudentDatabase s = new StudentDatabase(new ArrayList<Student>(), sc);
		
		while (true)
		{
			System.out.println("1.add\n2.remove\n3.search\n4.update\n5.display\n6.sortStudent\n7.exit");
			int option = sc.nextInt();
			
			switch (option)
			{
			case 1:s.add();
					break;
			case 2:s.remove();
					break;
			case 3:s.searchStudent();
					break;
			case 4:s.update();
					break;
			case 5:s.display();
					break;
			case 6:s.sortStudent();
					break;
			case 7:System.exit(0);
					break;
			}
		}
	}

}

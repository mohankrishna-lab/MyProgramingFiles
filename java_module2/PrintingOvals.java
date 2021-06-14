import java.util.Scanner;
class Vowels
{
	public void checkingVowels(char ch) 
	{
		if (ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
		{
			System.out.println(ch);
		}
	}
}

class PrintingVowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
		int size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("enter the char values into the array");
		for (int i=0;i<ch.length;i++ )
		{
			ch[i]=sc.next().charAt(0);
		}
		Vowels o=new Vowels();
		System.out.println("vowels in the given array:");
		for (int i=0;i<ch.length ;i++ )
			o.checkingVowels(ch[i]);
		

	}
}

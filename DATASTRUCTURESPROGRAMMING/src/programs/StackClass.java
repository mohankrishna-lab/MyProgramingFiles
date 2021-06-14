package programs;

public class StackClass
{
	private int top;
	
	private int[] s;
	
	public StackClass(int size)
	{
		top = -1;
		s =  new int[size];
	}
	
	public void push(int a)
	{
		if (top == s.length - 1) 
		{
			System.out.println("stack is full !!");
		}
		else 
		{
		s[++top] = a;
		}
	}
	
	public int pop()
	{
		if (top == -1)
		{
			System.out.println("Stack is empty !!");
			return 0;
		}
		else
		{
		return s[top--];
		}
	}
	
	public void display()
	{
		if (top == -1) 
		{
			System.out.println("stack is empty");
		}
		else
		{
			for (int i = top; i >= 0; i--)
			{
				System.out.println(s[i]);
			}
		}
	}
}

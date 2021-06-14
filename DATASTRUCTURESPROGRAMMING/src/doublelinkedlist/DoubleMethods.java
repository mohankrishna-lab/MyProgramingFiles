package doublelinkedlist;

import java.util.Scanner;
public class DoubleMethods 
{
	Node first = null;
	
	public Node createNode()
	{
		Node temp = new Node();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data");
		temp.data = sc.nextInt();
		
		temp.llink = null;
		temp.rlink = null;
		
		return temp;
	}
	
	public void insertFront()
	{
		Node temp = createNode();
		
		if (first == null)
		{
			first = temp;
		}
		else
		{
			temp.rlink = first;
			first.llink = temp;
			first = temp;
			
		}
	}
	
	public void insertRear()
	{
		Node temp = createNode();
		
		if (first == null)
		{
			first = temp;
		}
		else
		{
			Node cur = first;
			while (cur.rlink != null)
			{
				cur = cur.rlink;
			}
			
			temp.llink = cur;
			cur.rlink = temp;
			cur = temp;
		}
	}
	
	public void deleteFront()
	{
		if (first == null) 
		{
			System.out.println("double is empty");
		}
		else if (first.rlink == null)
		{
			System.out.println("delete data : " + first.data);
			
			first = null;
		}
		
		else
		{
			System.out.println("delete data : " + first.data);
			first.rlink.llink = null;
			first = first.rlink;
		}
	}
	
	public void deleteRear()
	{
		if (first == null) 
		{
			System.out.println("double is empty");
		}
		else if (first.rlink == null)
		{
			System.out.println("delete data : " + first.data);
			
			first = null;
		}
		
		else
		{
			Node cur = first;
			
			while (cur.rlink.rlink != null)
			{
				cur = cur.rlink;
			}
			
			System.out.println("delete data : " + cur.rlink.data);
			cur.rlink = null;
		}
	}
	
	
	@Override
	public String toString()
	{
		if (first == null)
		{
			return "Double linked list is empty";
		}
		else
		{
			Node cur = first;
			
			String s = "[";
			
			while (cur != null)
			{
				s = s + cur.data + " ";
				
				cur = cur.rlink;
			}
			s = s + "]";
			return s;
		}
	}
}

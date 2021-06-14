package pracprogramss;

public class PracStaticBlock 
{
	int x;
	int y;
	static int a;
	static int b;
	
	{
		a = 40;
		b = 50;
	}
	
	public PracStaticBlock() {}

	public PracStaticBlock(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	static
	{
		PracStaticBlock p = new PracStaticBlock();
		p.x = 30;
		p.y = 40;
		
		System.out.println(p.x);
		System.out.println(p.y);
	}


	public static void main(String[] args) 
	{
		PracStaticBlock p = new PracStaticBlock();
		System.out.println(p.x);
		System.out.println(p.y);
		
		System.out.println(a);
		System.out.println(b);
	}

}

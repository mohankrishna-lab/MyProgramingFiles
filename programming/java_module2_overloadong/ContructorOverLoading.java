class ContructorOverLoading 
{
	public static void main(String[] args) 
	{
		contructoroverloading=new contructoroverloading();
		contructoroverloading=new contructoroverloading(int x);
		contructoroverloading=new contructoroverloading(int x,int y);
	}

		public contructoroverloading()
		{
		System.out.println("");
		}
		public constructoroverloading()
		{
		system.out.println("no args");
		}
		public constructoroverloading(int x)
		{
		Sysetm.out.println(x);
		}
		public constructoroverloading(int x,int y)
		{
		System.out.println(x+" "+y);
		}
		public constructoroverloading(int y,int x)
		{	
		System.out.println(x+" "+y);
		}
}

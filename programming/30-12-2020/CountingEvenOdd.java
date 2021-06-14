// Counting Even Numbers From 1 To 100

class  CountingEvenOdd
{
	public static void main(String[] args) 
	{
		countEvenOdd();
	}
	public static void countEvenOdd()
	{
		int evenCount=0;
		int oddCount=0;
		for (int i=1 ;i<=100 ;i++ )
		{
			
			if ( i % 2 ==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}

		}
		System.out.println("even numbers from 1 to 100 are:" + evenCount);
		System.out.println("even numbers from 1 to 100 are:" + oddCount);
	}
}

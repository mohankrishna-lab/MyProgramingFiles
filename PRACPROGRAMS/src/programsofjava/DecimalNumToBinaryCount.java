package programsofjava;

public class DecimalNumToBinaryCount 
{

	public static void main(String[] args) 
	{
		Double d = 332090.004;
		double d1 = d;
		Integer i = (int)d1;
		String a = i.toBinaryString(i);
		
		System.out.println(a);
		char ch[] =a.toCharArray();
		
		int count = 0;
		
		for (int j = 0; j < ch.length; j++) 
		{
			if (ch[j] == '0')
			{
				count++;
			}
		}
		
		System.out.println("count of zeros:" + count);
		consecutiveOccuranceZeros(ch);
	
	}
	
	public static void consecutiveOccuranceZeros(char[] ch)
	{
		int count = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == '0')
			{
				for (int j = i + 1; j < ch.length; j++) 
				{
					if (ch[i] == ch[j])
					{
						count++;
						break;
					}
					else
					{
						break;
					}
				}
			}
		}
		
		if (count > 1)
		{
		System.out.println("consecutive zeros are:" + count);
		}
		else
		{
			System.out.println("there are none");
		}
	}

}

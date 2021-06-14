//Program to remove an element from the specified index in a given array of double

class RemovingElementArrayDouble
{
	public static void main(String[] args) 
	{
		double[] d1 = {99.9 , 78.9 , 88.9 , 77.7 , 33.3 , 66.6};

		int pos = 4;

		double[] d2 = removeElementDoubleArray(d1 , pos);

		for (int i = 0;i < d2.length ;i++ )
		{
			System.out.println(d2[i]);
		}
	}

	public static double[] removeElementDoubleArray(double[] d1 , int pos)
	{
		double[] d2 = new double[d1.length - 1];

		int i;
		for (i = 0;i <pos ;i++ )
		{
			d2[i] = d1[i];
		}
		for (;i < d1.length - 1 ;i++ )
		{
			d2[i] = d1[i + 1]; 
		}
		return d2;
	}
}

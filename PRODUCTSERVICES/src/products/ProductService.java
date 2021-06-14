package products;

public class ProductService 
{
	private static final String Prod = null;

	public String findNameByCode(int a)
	{
		String s ="" ;
		for (Product p : ProductRepository.getProduct()) 
		{
			if (a == p.getProductCode()) 
			{
				s = p.getName();
			}
		}
		return s;
	}
	
	public Product maxPriceProduct(String s ,Product[] prod )
	{
		Product p = null; 
		double maxPrice = 0.0;
		
		for (Product pr : prod)
		{
			if (s.equalsIgnoreCase(pr.getCategory()))
			{
				if (maxPrice == 0.0)
				{
					maxPrice = pr.getPrice();
					p = pr;
				}
				else if (maxPrice < pr.getPrice())
				{
					maxPrice = pr.getPrice();
					p = pr;
				}
			}
		}
		return p;
	}
	
	public Product[] getProductByCategory(String s , Product[] prod)
	{
		int count = 0;	
		
		for (Product pr : prod)
		{
			if (s.equalsIgnoreCase(pr.getCategory()))
			{
				count++;
			}
		}
		
		int i = 0;
		Product[] p = new Product[count];
		
		for (Product pr : prod)
		{
			if (s.equalsIgnoreCase(pr.getCategory()))
			{
				p[i++] = pr;
			}
		}
		
		return p;
	}
}

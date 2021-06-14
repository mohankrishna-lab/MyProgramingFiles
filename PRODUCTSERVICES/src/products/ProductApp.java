package products;

public class ProductApp {

	public static void main(String[] args) 
	{
		ProductService p = new ProductService();
		
		System.out.println(p.findNameByCode(101));
		//System.out.println(p.findNameByCode(108, ProductRepository.getProduct()));
		
		System.out.println(p.maxPriceProduct("toys" , ProductRepository.getProduct()));
		
		Product[] pr = p.getProductByCategory("TOYS", ProductRepository.getProduct());
		
		for (int i = 0; i < pr.length; i++)
		{
			System.out.println(pr[i]);
		}
	}

}

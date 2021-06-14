package products;

public class ProductRepository
{
	private static final Product[] products;
	private static final String COMPUTERS = "computers";
	private static final String CLOTHING = "clothing";
	private static final String TOYS = "toys";
	
	static 
	{
		products = new Product[8];
		products[0] = new Product(101,"keyboards",300,COMPUTERS);
		products[1] = new Product(102,"mouse",600,COMPUTERS);
		products[2] = new Product(103,"monitor",5000,COMPUTERS);
		products[3] = new Product(104,"t-shirt",500,CLOTHING);
		products[4] = new Product(105,"jeans",2000,CLOTHING);
		products[5] = new Product(106,"sweater",1000,CLOTHING);
		products[6] = new Product(107,"doll",500,TOYS);
		products[7] = new Product(108,"car",1000,TOYS);
	}
	
	public static Product[] getProduct()
	{
		return products;
	}
}

package arraylistss;

public class Car
{
	private String name;
	private double price;
	private String color;
	private int yOM;
	private String model;
	
	public Car(String name, double price, String color, int yOM, String model) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.yOM = yOM;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getyOM() {
		return yOM;
	}

	public void setyOM(int yOM) {
		this.yOM = yOM;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + price + "\t\t" + color + "\t\t" + yOM + "\t\t" + model;
	}
}

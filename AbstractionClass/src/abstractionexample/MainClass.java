package abstractionexample;

public class MainClass {

	public static void main(String[] args) 
	{
		FactoryClass f = new FactoryClass();
		f.getObject('A').print();
		f.getObject('B').print();
	}

}

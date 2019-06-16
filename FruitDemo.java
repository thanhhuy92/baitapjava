import java.io.*;
class Fruit
{
	boolean Seedness;
	boolean Seasonal;
	int Price;
	
	public Fruit()
	{
		Seedness = false;
		Seasonal = false;
		Price = 0;
	}
	
	public Fruit(boolean aSeedness, boolean aSeasonal, int aPrice)
	{
		Seedness = aSeedness;
		Seasonal = aSeasonal;
		Price = aPrice;
	}
	
	public void SetProperties(boolean aSeedness, boolean aSeasonal, int aPrice)
	{
		Seedness = aSeedness;
		Seasonal = aSeasonal;
		Price = aPrice;
	}
	
	void PrintProperties()
	{
		if(Seedness)
			System.out.println("Fruit is seedness.");
		else
			System.out.println("Fruit is seeded");
		
		if(Seasonal)
			System.out.println("Fruit is seasonal.");
		else
			System.out.println("Fruit is not seasonal");
		
		System.out.println("Price is: "+Price);
	}
}
class FruitDemo
	{
		public static void main(String[] args)
		{
			System.out.println("First fruit:");
			Fruit f1 = new Fruit();
			f1.PrintProperties();
			
			System.out.println("Second fruit:");
			Fruit f2 = new Fruit(true,false,10000);
			f2.PrintProperties();
		}
	}
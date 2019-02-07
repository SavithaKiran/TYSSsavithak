package feb1;

public class Dress {
	private double price;
	public String tops(String west)
	{
		System.out.println(west+" are Traditional tops");
		return west;
	}
	public String tops1(String west, String tun)
	{
		System.out.println(west +" and "+ tun+" comes under Ethnic Tops");
		return tun;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public double getPrice()
	{
		return price;
		
	}
}

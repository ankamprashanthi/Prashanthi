package hello;

public class Smartphone {
	private String brand = "Samsung";
	public Smartphone(String brand)
	{
		this.brand=brand;
		System.out.println(brand);
	}
	 
	public String getBrand() {
		return brand;

}
}
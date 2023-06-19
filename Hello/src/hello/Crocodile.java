package hello;

public class Crocodile extends Reptile{
	public String name;

	public Crocodile() {
		super();
		name = "Crocodile";
	}

	@Override
	public String seeInfo() {
		return "Crocodile [name=" + name + ", type=" + type + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}

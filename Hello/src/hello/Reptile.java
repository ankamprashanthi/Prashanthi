package hello;

public class Reptile extends Animal{
	public String type;

	public Reptile() {
		height="long";
		weight=20;
		type ="animal";
	}

	@Override
	public String seeInfo() {
		return "Reptile [type=" + type + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}

package inheritanceTest;

public class Motorbike extends Bike{
	private String roofType;
	
	public Motorbike(int numWheels,String roofType) {
		super(numWheels,roofType);
		this.roofType=roofType;
	}
	
	public String getRoofType() {
		return roofType;
	}
}

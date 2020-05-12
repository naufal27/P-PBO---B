package Shape;

public class Circle{
	int jari;
	
	//mutator
	public void setCircle(int jari){
		this.jari=jari;
	}
	
	//accessor
	public float getCircle() {
		return (float) (Math.PI*jari*jari);
	}
}

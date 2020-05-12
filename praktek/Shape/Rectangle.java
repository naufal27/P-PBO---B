package Shape;

public class Rectangle {
	int panjang;
	int lebar;
	
	public void setRectangle(int panjang,int lebar) {
		this.panjang=panjang;
		this.lebar=lebar;
	}
	
	public float getRectangle() {
		return this.panjang*this.lebar;
	}
}

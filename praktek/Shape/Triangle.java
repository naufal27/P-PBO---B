package Shape;

public class Triangle {
	int alas;
	int tinggi;
	
	public void setTriangle(int alas,int tinggi) {
		this.alas=alas;
		this.tinggi=tinggi;
	}
	
	public float getTriangle() {
		return this.alas*this.tinggi*1/2;
	}
}

package Shape;

public class ShapePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle lingkaran=new Circle();
		Parallelogram jg=new Parallelogram();
		Rectangle spanjang=new Rectangle();
		Rhombus bketupat=new Rhombus();
		Square persegi=new Square();
		Triangle stiga=new Triangle();
		
		lingkaran.setCircle(4);
		jg.setParallelogram(3, 4);
		spanjang.setRectangle(6, 7);
		bketupat.setRhombus(10, 8);
		persegi.setSquare(5);
		stiga.setTriangle(5, 2);
		
		System.out.println("luas lingkaran			: "+lingkaran.getCircle());
		System.out.println("luas jajar genjang		: "+jg.getParallelogram());
		System.out.println("luas persegi panjang		: "+spanjang.getRectangle());
		System.out.println("luas belah ketupat		: "+bketupat.getRhombus());
		System.out.println("luas persegi			: "+persegi.getSquare());
		System.out.println("luas segitiga			: "+stiga.getTriangle());
	}

}

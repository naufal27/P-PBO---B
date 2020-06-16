package inheritanceTest;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota = new Car(4,5,false);
		System.out.println("Number of Doors on Toyota's Car : "+Toyota.getNumDoors());
		System.out.println("Number of Wheels on Toyota's Car : "+Toyota.getWheels());
		String electric= Toyota.getIsElectric() ? "yes":"no";
		System.out.println("is the Toyota's Car Electric ? "+electric);
		System.out.println();
		Bike bike = new Bike(4,"baru");
		Motorbike mbike=new Motorbike(5,"lama");
		System.out.println("status motor : "+bike.getBikeType());
		System.out.println("status motor : "+mbike.getRoofType());
		

	}

}

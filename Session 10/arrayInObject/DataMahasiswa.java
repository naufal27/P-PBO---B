package arrayInObject;

public class DataMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize=100;
		ManageMahasiswa obj=new ManageMahasiswa(maxSize);
		obj.insert("118705001", "Adi", 19);
		obj.insert("118705002", "Andi", 20);
		obj.insert("118705003", "Adit", 19);
		obj.insert("118705004", "Adli", 22);
		obj.insert("118705005", "Adil", 21);
		System.out.println("Data Mahasiswa : ");
		obj.display();
	}

}

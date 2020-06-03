package eksepsiTes;



class DemoThrow {	
	public static void main(String[] args) {
		Mahasiswa mhs=new Mahasiswa();
		mhs.setNIM(null);
		mhs.setName("Naufal");
		System.out.println("\nNIM	: "+mhs.getNIM());
		System.out.println("Nama	: "+mhs.getName());
	}
}
class Mahasiswa{
	private String nim;
	private String nama;
	
	public void setName(String inputName) {
		nama=inputName;
	}
	
	public String getName() {
		return nama;
	}
	
	public void setNIM(String inputNIM) {
		nim=inputNIM;
	}
	
	public String getNIM() {
		return nim;
	}
}
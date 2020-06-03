package eksepsiTes;

public class ContohMultiEksepsi {
	public static void cobaEksepsi(int pembilang, int penyebut) {
		try {
			int hasil=pembilang/penyebut;
			System.out.println("hasil bagi : "+hasil);
		}
		catch(ArithmeticException eksepsi1) {
			System.out.println("Terdapat pembagian dengan 0");
		}
	}
	
	public static void main(String args[]) {
		cobaEksepsi(4,0);
		System.out.println();
		
		cobaEksepsi(12,4);
	}
}
package enkapsulasiDemo;
import java.text.DecimalFormat;

public class DemoEnkapsulasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat digitpresisi=new DecimalFormat("0,00");
		System.out.println("\nDEMO ENKAPSULASI");
		System.out.println("=====================");
		HitungGaji toni=new HitungGaji();
		toni.setGaji(25000000);
		toni.hitungGaji();
		System.out.println("informasi gaji pegawai :");
		System.out.println("\nbesar gaji kotor : "+digitpresisi.format(toni.getgajiKotor()));
		System.out.println("\nbesar gaji yang dibawa pulang : "+digitpresisi.format(toni.getgajiBersih()));
	}
}

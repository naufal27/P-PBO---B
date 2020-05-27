package controlStatementProject;
import java.util.*;

public class leapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("masukan tahun : ");
		int tahun=in.nextInt();
		System.out.print("masukan bulan berupa angka : ");
		int bulan=in.nextInt();
		if(tahun%4==0 && tahun%100!=0 || tahun%400==0)
			System.out.println("ini tahun kabisat");
		else
			System.out.println("ini bukan tahun kabisat");
		if(bulan>12 && bulan<1)
			System.out.println("Invalid Input");
		else {
			String bln= bulan%2==0 ? "genap":"ganjil";//ternary operator
			System.out.println("ini bulan : "+bln);
			switch(bln) {
				case "genap":
					if(bulan!=2)
						System.out.println("mempunyai 30 hari");
					else if(bulan==2 && (tahun%4==0 && tahun%100!=0 || tahun%400==0))
						System.out.println("mempunyai 29 hari");
					else
						System.out.println("mempunyai 28 hari");
					
					break;
				case "ganjil":
					System.out.println("mempunyai 31 hari");
					break;
			}
			
		}
	}
}

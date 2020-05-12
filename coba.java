package percobaan;
import java.util.Scanner;

public class coba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.print("enter a study term : ");
		termvar = scanterm.nextLine();
		Scanner scandef = new Scanner(System.in);
		String termdef;
		System.out.print("enter a definition : ");
		termdef = scandef.nextLine();
		
		System.out.println(termvar+" : "+termdef);
		
	}

}

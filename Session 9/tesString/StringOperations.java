package tesString;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="HEllo";
		String string2="Naufal";
		String string3="";
		string3="How Are You?".concat(string2); //concat
		System.out.println("string3 = "+string3);
		System.out.println("Length = "+string1.length());//length
		System.out.println("Sub = "+string3.substring(0,5));//substring
		System.out.println("Upper = "+string3.toUpperCase());//uppercase
		System.out.println("Lower = "+string3.toLowerCase());//lowercase
		
		String s1="abc";
		String s2="cde";
		System.out.println(s1.compareTo(s2));
		
		String s3="ABC";
		System.out.println(s1.equals(s3));
	}

}

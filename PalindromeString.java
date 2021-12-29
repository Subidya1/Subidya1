package week1.day2.Assignments;


public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "MADAM";
StringBuffer s = new StringBuffer(str1);
s.reverse();
System.out.println(str1);
System.out.println(s);
String str2 = s.toString();
if(str1.equals(str2)) {
	System.out.println("It is Palindrome");
}
else {
	System.out.println("It is not Palindrome");
}
	
	}
	

}

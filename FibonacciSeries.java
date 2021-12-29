package week1.day1;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1= 0 , n2 = 1, n3 ,i;
System.out.println(n1);
System.out.println(n2);
	

for(i=2 ; i<=8 ; i++) {
	n3 = n1 +  n2 ;
	
	System.out.println(n3);
	n1 = n2;
	n2 = n3;
			
	}
	}
}
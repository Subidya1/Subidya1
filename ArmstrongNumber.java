package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 153;
int sum =0;
int rem;
while(input>0) {
	rem = input % 10;
	sum = sum + rem;
	input = input/10;
} 
System.out.println(sum);
	}

}

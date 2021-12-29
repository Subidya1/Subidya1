package week1.day2;

public class Calculator {
	public double sub(double num1 , double num2) {
		return  num1-num2;		
	}
	public double mul(double num1 , double num2) {
		return  num1*num2;
	}
	public int divide(int num1 , int num2) {
	      return num1/num2;
     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();

		System.out.println(calc.sub(52345.34556, 34567.12345));
		System.out.println(calc.mul(5.5, 3.4));
		System.out.println(calc.divide (30,5));
	}

}

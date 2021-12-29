package week1.day2.Assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ("Welcome To Chennai");
		int count = 0;
		for (char ch : str.toCharArray()) {
			if(ch == 'e') {
				count++;
			}
		}
			System.out.println(count);
			}
	}



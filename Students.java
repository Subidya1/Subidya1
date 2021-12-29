package week3.day1.Assignments;

public class Students {

	public void getStudentInfo(int StuID) 
	   {
		System.out.println("Student ID is "+StuID);
		}	
		public void getStudentInfo(int StuID, String StuName)
		{
		 System.out.println("Student ID is "+StuID);
		 System.out.println("Student name is "+StuName);			
		}		
		public void getStudentInfo(String StuemailID,int StuPhno)
		{
		 System.out.println("Student Email ID is "+StuemailID);
		 System.out.println("Student Phone Number is "+StuPhno);
		}
		
		public static void main(String[] args) {
			
			Students obj = new Students();
			obj.getStudentInfo(12345);
			obj.getStudentInfo(12345,"Subidya");
			obj.getStudentInfo("subidya.s.pradhan@gmail.com",74501450);

		}

	}



package org.Student;

import org.Department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("StudentName is Subidya");
	}
	public void studentDept() {
		System.out.println("StudentDept is CSE");
	}
	public void studentId() {
		System.out.println("StudentID is 325");
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
	    obj.CollegeName();
	    obj.CollegeCode();
	    obj.CollegeRank();
		obj.DepartmentName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}

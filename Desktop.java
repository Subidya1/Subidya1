package org.system;

public class Desktop extends Computer {
	
	public void DesktopSize()
	{
		System.out.println("Desktop Size is 3.2inch");
	}

	public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		obj.ComputerModel();
		obj.DesktopSize();
		
	}
}
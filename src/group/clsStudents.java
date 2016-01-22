package group;

import java.util.ArrayList;

public class clsStudents {
	ArrayList<clsStudent> Students;
	
	clsStudents (int intStsAmnt)
	{
		Students = new ArrayList<clsStudent>(intStsAmnt);
	}
		
	public int Count;

	public void add(String Name, int Age, String Phone)
	{
		Students.add(new clsStudent(Name, Age, Phone));
		Count = Students.size();
	}
	public clsStudent getStudent (int intIndex)
	{
		clsStudent objStudent = Students.get(intIndex);
		return objStudent;
	}
}
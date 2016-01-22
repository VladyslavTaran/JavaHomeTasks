package group;

public class clsGroup {
	public String name;
	public clsStudents Students;
	clsGroup (int intStsAmnt)
	{
		Students = new clsStudents(intStsAmnt);
	}
	void showAllStudents ()
	{
		int i;
		clsStudent objStudent;
		for (i=0; i<Students.Count; i++)
		{
			objStudent = Students.getStudent(i);
			System.out.println("Student(s) #" + i + " name: " + objStudent.Name);
			System.out.println("Student(s) #" + i + " age: " + objStudent.Age);
			System.out.println("Student(s) #" + i + " phone: " + objStudent.Phone);
		}
	}
}

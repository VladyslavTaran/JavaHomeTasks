package group;

import java.util.Scanner;

public class runClass {

	public static void main(String[] args) {
		String strGrpName;
		int intStsAmt;
		int i=1;
		String strStdName;
		String strStdPhone;
		int intStdAge;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Input new group name");
		strGrpName = objScanner.nextLine();
		System.out.println("Input students amount in group " + strGrpName);
		intStsAmt = objScanner.nextInt();
		clsGroup objGRP = new clsGroup(intStsAmt);
		objGRP.name = strGrpName;
		System.out.println("Student(s) in group " + strGrpName + " is(are) " + intStsAmt);
		while (i<=intStsAmt)
		{
			System.out.println("Input student #" + i + " out of " + intStsAmt);
			System.out.println("Student #" + i + " name: ");
			strStdName = objScanner.next();
			System.out.println("Student #" + i + " age: ");
			intStdAge = objScanner.nextInt();
			System.out.println("Student #" + i + " phone: ");
			strStdPhone = objScanner.next();
			objGRP.Students.add(strStdName, intStsAmt, strStdPhone);
			i++;
		}
		System.out.println("All " +intStsAmt+ " students info:");
		objGRP.showAllStudents();
		objScanner.close();
	}
}
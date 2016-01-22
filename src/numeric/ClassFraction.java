package numeric;

public class ClassFraction {
	
	public static int[] getChislAndZnam(String strOper1,String strOper2)
	{
		int[] intArrRes = new int[4];
		int intO1chisl;
		int intO1znam;
		int intO2chisl;
		int intO2znam;		
		
		intO1chisl = Integer.parseInt(strOper1.split("/")[0]);
		intO1znam = Integer.parseInt(strOper1.split("/")[1]);
		intO2chisl = Integer.parseInt(strOper2.split("/")[0]);
		intO2znam = Integer.parseInt(strOper2.split("/")[1]);		
		
		intArrRes[0] = intO1chisl;
		intArrRes[1] = intO1znam;
		intArrRes[2] = intO2chisl;
		intArrRes[3] = intO2znam;
		
		return intArrRes;
	}
	
	public String add(String strOper1, String strOper2)
	{
		String strRes="";
		int intResChisl;
		int intResZnam;
		int[] intArrOpers = getChislAndZnam(strOper1, strOper2);
		
		intResZnam = intArrOpers[1] * intArrOpers[3];
		intResChisl = intArrOpers[0] * intArrOpers[3] + intArrOpers[2] * intArrOpers[1];
		
		strRes = intResChisl + "/" + intResZnam;
		
		return strRes;
	}
	
	public String subtract(String strOper1, String strOper2)
	{
		String strRes="";
		int intResChisl;
		int intResZnam;
		int[] intArrOpers = getChislAndZnam(strOper1, strOper2);
		
		intResZnam = intArrOpers[1] * intArrOpers[3];
		intResChisl = intArrOpers[0] * intArrOpers[3] - intArrOpers[2] * intArrOpers[1];
		
		strRes = intResChisl + "/" + intResZnam;
		
		return strRes;
	}
	
	public String mult(String strOper1, String strOper2)
	{
		String strRes="";
		int intResChisl;
		int intResZnam;
		int[] intArrOpers = getChislAndZnam(strOper1, strOper2);
		
		intResZnam = intArrOpers[1] * intArrOpers[3];
		intResChisl = intArrOpers[0] * intArrOpers[2];;
		
		strRes = intResChisl + "/" + intResZnam;
		
		return strRes;
	}
	
	public String divide(String strOper1, String strOper2)
	{
		String strRes="";
		int intResChisl;
		int intResZnam;
		int[] intArrOpers = getChislAndZnam(strOper1, strOper2);
		
		intResZnam = intArrOpers[1] * intArrOpers[2];
		intResChisl = intArrOpers[0] * intArrOpers[3];
		
		strRes = intResChisl + "/" + intResZnam;
		
		return strRes;
	}
	
	public boolean isFirstFractionGreater(String strOper1, String strOper2)
	{
		boolean blnRes=false;
		
		int[] intArrOpers = getChislAndZnam(strOper1, strOper2);
		
		if (intArrOpers[1]==intArrOpers[3])
		{
			if (intArrOpers[0]>intArrOpers[2]) blnRes = true;
		}
		else if (intArrOpers[0]==intArrOpers[2])
		{
			if (intArrOpers[1]<intArrOpers[3]) blnRes = true;
		}
		else
		{
			if (intArrOpers[0]*intArrOpers[3] > intArrOpers[2]*intArrOpers[1]) blnRes = true;
		}
		
		return blnRes;
	}
}

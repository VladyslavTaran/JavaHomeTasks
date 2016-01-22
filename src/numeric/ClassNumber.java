package numeric;

public class ClassNumber {
	public static int add(int intOper1, int intOper2)
	{
		int intRes=0;
		
		intRes = intOper1 + intOper2;
		
		return intRes;
	}
	
	public static int subtract(int intOper1, int intOper2)
	{
		int intRes=0;
		
		intRes = intOper1 - intOper2;
		
		return intRes;
	}
	
	public static int mult(int intOper1, int intOper2)
	{
		int intRes=0;
		
		intRes = intOper1 * intOper2;
		
		return intRes;
	}
	
	public static int divide(int intOper1, int intOper2)
	{
		int intRes=0;
		
		intRes = intOper1 / intOper2;
		
		return intRes;
	}
	
	public int involToDegree(int intNumber, int intDegree)
	{
		int intRes=1;
		int i;
		
		for (i=1; i<=intDegree; i++)
		{
			intRes*= intNumber;
		}
		
		return intRes;
	}
	
	public int factotial(int intNumber)
	{
		int intRes=1;
		int i;
		
		for (i=1; i<=intNumber; i++)
		{
			intRes*= i;
		}
		
		return intRes;
	}
	
	public int restOfDev(int intOper1, int intOper2)
	{
		int intRes=0;
		int intTemp=0;
		int i;
		
		for (i=1; i<intOper2; i++)
		{
			intTemp = intOper2*i;
			if ((intOper1 - intTemp) < intOper2)
			{
				intRes = intOper1 - intTemp;
				break;
			}
		}
		
		return intRes;
	}
	
	public boolean isFirstNumberGrater (int intOper1, int intOper2)
	{
		boolean blnRes=false;
		
		if (intOper1 > intOper2) blnRes = true;
		
		return blnRes;
	}
}

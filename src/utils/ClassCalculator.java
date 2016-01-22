package utils;

import numeric.ClassNumber;

import java.util.Scanner;


public class ClassCalculator {

	public static void main(String[] args) {
		String strExpressionToCalc;
		int intRes = 0;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Input expression to calc: ");
		strExpressionToCalc = objScanner.nextLine();
		objScanner.close();
		String[] strArrExpression = getOperandsAndOperation(strExpressionToCalc);
		if (strArrExpression[1].equals("+"))
		{
			intRes = ClassNumber.add(Integer.parseInt(strArrExpression[0]), Integer.parseInt(strArrExpression[2]));
		}
		else if (strArrExpression[1].equals("-"))
		{
			intRes = ClassNumber.subtract(Integer.parseInt(strArrExpression[0]), Integer.parseInt(strArrExpression[2]));
		}
		else if (strArrExpression[1].equals("*"))
		{
			intRes = ClassNumber.mult(Integer.parseInt(strArrExpression[0]), Integer.parseInt(strArrExpression[2]));
		}
		else if (strArrExpression[1].equals("/"))
		{
			intRes = ClassNumber.divide(Integer.parseInt(strArrExpression[0]), Integer.parseInt(strArrExpression[2]));
		}
		
		System.out.println("Result: " + intRes);
	}

	public static String[] getOperandsAndOperation(String strInput)
	{
		String[] strArrRes = new String[3];
		String strFirstOper="";
		String strSecondOper="";	
		char chrSymbol;
		char chrOper = '\0';
		boolean blnIsFirstOper = true;
		int i;
		
		for (i=0; i<strInput.length(); i++)
		{
			chrSymbol = strInput.charAt(i);
			if (chrSymbol >= '0' && strInput.charAt(i) <= '9')
			{
				if (blnIsFirstOper) strFirstOper += Character.toString(chrSymbol);
				else strSecondOper += Character.toString(chrSymbol);
			}
			else
			{
				chrOper = chrSymbol;
				blnIsFirstOper = false;
			}
		}
		
		strArrRes[0] = strFirstOper;
		strArrRes[1] = String.valueOf(chrOper);
		strArrRes[2] = strSecondOper;
		
		return strArrRes;
	}
}

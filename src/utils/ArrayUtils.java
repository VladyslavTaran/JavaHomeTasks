package utils;

public class ArrayUtils {

    // int[] -> String
    public static String toString(int[] intArray){
        String strOutput="";
        int i;
        
        for (i = 0; i < intArray.length; i++)
        {
        	strOutput += intArray[i];
        }
        	
    	return strOutput;
    }

    public static void print(int[] intArray){
    	int i=0;
    	while (i<intArray.length)
    	{
    		System.out.print(intArray[i]);
    		i++;
    	}
    }

    public static int min(int[] intArray){
    	int intMin;
    	int i=0;
    	
    	intMin = intArray[0];
    	while (i < intArray.length)
    	{
    		if (intArray[i]<intMin)
    		{
    			intMin = intArray[i];
    		}
    		i++;
    	}
        return intMin;
    }

    // find index of first el
    public static int indexOf(int[] intArrInput, int intElement){
        int intInd = -1;
        int i;
        
        for (i=0;i<intArrInput.length;i++)
        {
        	if (intArrInput[i] == intElement)
        	{
        		intInd = i;
        		break;
        	}
        		
        }
        
    	return intInd;
    }

    public static int lastIndexOf(int[] intArray, int intElement){
        int intInd = -1;
        int i = 1;
        
    	while (i<intArray.length)
    	{
    		if (intElement == intArray[i])
    		{
    			intInd = i;
    		}
    		i++;
    	}
    	return intInd;
    }

    // 1,2,3,4
    public static int[] subarray(int[] intArray, int intStartIndex, int intEndIndex){
        int intResArray[] = new int[intEndIndex-intStartIndex+1];
    	int i;
    	int j=0;
        
    	for (i=intStartIndex;i<=intEndIndex;i++)
    	{
    		intResArray[j] = intArray[i];
    		j++;
    	}
        
    	return intResArray;
    }

    public static int[] revert(int[] mas){
        return null;
    }

    public static int[] sym(int[] a, int[] b){
        return null;
    }

    // 1 2 3 4 * 3 = 3 + 6 + 9 + 12 =  30
    public static int multAndSum(int[] intArray, int intMultOperand){
        int intRes=0;
    	int i;
        
        for (i=0;i<intArray.length;i++)
        {
        	intRes+=intArray[i]*intMultOperand;
        }
    	return intRes;
    }

    public static void sort(int[] intArray){
    	int i;
    	int j;
    	int intTemp;

    	for (i = intArray.length - 1;i > 0; i--)
    	{
	    	for (j = 0;j < i;j++)
	    	{
	    		if (intArray[j] > intArray[j+1])
	    		{
	    			intTemp = intArray[j];
	    			intArray[j] = intArray[j+1];
	    			intArray[j+1] = intTemp;
	    		}
	    	}
    	}
    	
    	ArrayUtils.print(intArray);
    }






}

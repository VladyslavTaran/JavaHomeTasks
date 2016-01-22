package utils;

import java.util.Random;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassArray {
    public static void main(String[] args) {
        int intArr[] = {1,0,3,41,-5,6,2};
        print(sort(intArr));
    }

    public static int min(int[] intArray){
        int intMin = intArray[0];
        int i= 0;

        while (i < intArray.length)
        {
            if (intArray[i] < intMin)
            {
                intMin = intArray[i];
            }
            i++;
        }

        return intMin;
    }

    public static int max(int[] intArray){
        int intMax = intArray[0];
        int i=0;

        while (i < intArray.length)
        {
            if (intArray[i] > intMax)
            {
                intMax = intArray[i];
            }
            i++;
        }

        return intMax;
    }

    public static int[] random(int intStart, int intEnd, int intArrElements)
    {
        int intRes[] = new int[intArrElements];
        Random objRandom = new Random();

        for (int i=0; i<intArrElements; i++)
        {
            intRes[i] = objRandom.nextInt(intEnd - intStart + 1) + intStart;
        }

        return intRes;
    }

    public static void print(int[] intArr)
    {
        System.out.print("{");
        for (int i=0; i<intArr.length; i++)
        {
            if (i == intArr.length - 1) System.out.print(intArr[i]);
            else System.out.print(intArr[i] + " ");
        }
        System.out.print("}");
    }

    public static int[] redim(int intArr[], int intValToIncrease)
    {
        int intRes[] = new int[intArr.length + intValToIncrease];

        for (int i=0; i<intArr.length + intValToIncrease; i++)
        {
            if (i < intArr.length) intRes[i] = intArr[i];
        }

        return intRes;
    }

    public static int[] sort(int[] intArray){
        int i;
        int j;
        int intTemp;
        int intArrRes[] = new int[intArray.length];

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

        intArrRes = intArray;
        return intArrRes;
    }
}

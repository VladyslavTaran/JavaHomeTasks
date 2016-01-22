package utils;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassArray {
    public static void main(String[] args) {
        int[] intArr = {1,-32,3,0,54,0,7};

        System.out.println("Max: " + max(intArr));
        System.out.println("Min: " + min(intArr));
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
}

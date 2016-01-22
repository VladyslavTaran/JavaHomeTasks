package utils;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassString {
    public static void main(String[] args) {
        String[] strArr = {"2sss ", "dey6 ", "fff"};
        System.out.println(create(strArr));
    }

    public static String create(String[] strArray)
    {
        String strRes="";

        for (int i=0; i<strArray.length; i++)
        {
            strRes+=strArray[i];
        }

        return strRes;
    }

    public static void print(String strMessage)
    {
        System.out.println(strMessage);
    }
}

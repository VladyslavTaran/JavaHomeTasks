package utils;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassString {
    public static void main(String[] args) {
        System.out.println(concatent("string1 ","String2"));
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

    public static String concatent(String strString1, String strString2)
    {
        String strRes = "";

        strRes = strString1 + strString2;

        return strRes;
    }
}

package utils;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassString {
    public static void main(String[] args) {
        System.out.println(uppercase("sdfTTjj U"));
        System.out.println(lowercase("sdfTTjj U"));
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

    public static String uppercase(String strInput)
    {
        String strRes = "";

        strRes = strInput.toUpperCase();

        return strRes;
    }

    public static String lowercase(String strInput)
    {
        String strRes = "";

        strRes = strInput.toLowerCase();

        return strRes;
    }
}

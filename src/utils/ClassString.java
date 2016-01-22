package utils;

/**
 * Created by Vladislav on 22.01.2016.
 */
public class ClassString {
    public static void main(String[] args) {
        System.out.println(substring("asdfghrt","ghh"));
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

    public static int substring(String strInputString, String strSubString)
    {
        int intIndex = -1;
        int j=0;

        for (int i=0; i < strInputString.length(); i++)
        {
            if (j < strSubString.length())
            {
                if (strInputString.charAt(i) == strSubString.charAt(j))
                {
                    if (j == strSubString.length() - 1)
                    {
                        intIndex = i - j;
                        break;
                    }
                    j++;
                }
            }
        }

        return intIndex;
    }
}

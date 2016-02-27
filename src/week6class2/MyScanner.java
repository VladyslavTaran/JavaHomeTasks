package week6class2;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/**
 * Created by Vladislav on 24.02.2016.
 */
public class MyScanner implements Iterator {
    private int curr = 0;
    private StringBuilder strBuilder;
    private String str;
    private int strLen;

    public MyScanner(String str) {
        strBuilder = new StringBuilder();
        this.str = str;
        this.strLen = str.length();
    }

    public MyScanner(Reader reader){
        strBuilder = new StringBuilder();
        char[] buff = new char[1000];
        int count = -1;
        try{
            while ((count = reader.read(buff)) != -1){
                strBuilder.append(buff, 0, count);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }

        this.str = strBuilder.toString();
        this.strLen = strBuilder.toString().length();
    }


    @Override
    public boolean hasNext() {
        return (curr < strLen);
    }

    @Override
    public Object next() {
        String strTemp = "";
        int i = 0;
        if (hasNext()){
            for (i = 0; i < strLen; i++){
                if (str.substring(curr + i, curr + i + 1).equals(" ") || str.substring(curr + i, curr + i + 1).equals("\n")){
                    break;
                }else{
                    strTemp += str.substring(curr + i, curr + i + 1);
                }
            }
            curr = curr + i + 1;
            return strTemp;
        }
        return null;
    }

    public Object nextLine(){
        String strTemp = "";
        int i = 0;
        if (hasNext()){
            for (i = 0; i < strLen; i++){
                if (str.substring(curr + i, curr + i + 1).equals("\n")){
                    break;
                }else{
                    strTemp += str.substring(curr + i, curr + i + 1);
                }
            }
            curr = curr + i + 1;
            return strTemp;
        }
        return null;
    }

    @Override
    public void remove() {

    }
}

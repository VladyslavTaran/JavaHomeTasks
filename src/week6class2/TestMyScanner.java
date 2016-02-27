package week6class2;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Vladislav on 24.02.2016.
 */
public class TestMyScanner {

    public static void main(String[] args) throws FileNotFoundException {

        MyScanner myScannerReader = new MyScanner(new FileReader("C:\\Java\\testMyScanner.txt"));
        MyScanner myScannerString = new MyScanner("1 Line\n2 Line\n3 Line");

        //System.out.println(myScannerReader.hasNext());
        //System.out.println(myScannerReader.next());
        //System.out.println(myScannerReader.next());
        System.out.println(myScannerReader.nextLine());

        //System.out.println(myScannerString.hasNext());
        //System.out.println(myScannerString.next());
        //System.out.println(myScannerString.next());
        System.out.println(myScannerString.nextLine());
    }

}


package com.ameron32.importtesting;

import java.util.Scanner;

import com.ameron32.testing.ImportTesting;

public class ImportTest {

    static ImportTesting it;
    public static void main(String[] args) {
        it = new ImportTesting(
                new String[] {
                        "C:\\Users\\klemeilleur\\Dropbox\\Public\\GURPS\\GURPSBuilder\\156\\"
                }
                );
        it.main();
        System.out.println(ImportTesting.getSB());
    }
    
    /* LOOPABLE INPUT */
    private static void input() {
        String next = "";
        while (in.hasNext()) { 
            next = in.next();

            // perform loop
        }
        
    }
    static Scanner in = new Scanner(System.in);

}

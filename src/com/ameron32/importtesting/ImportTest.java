
package com.ameron32.importtesting;

import com.ameron32.testing.ImportTesting;

public class ImportTest {

    static ImportTesting it;
    public static void main(String[] args) {
        it = new ImportTesting(
                new String[] {
                        "C:\\Users\\klemeilleur\\Dropbox\\Public\\GURPS\\"
                }
                );
        it.main();
        System.out.println(ImportTesting.getSB());
    }

}


package com.ameron32.importtesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.ameron32.libgurps.attackoptions.AttackOption;
import com.ameron32.libgurps.attackoptions.MeleeAttackOption;
import com.ameron32.libgurps.items.design.Item;
import com.ameron32.libgurps.items.design.Weapon;
import com.ameron32.libgurps.tools.Importer;
import com.ameron32.libgurps.tools.Importer.ImportType;
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

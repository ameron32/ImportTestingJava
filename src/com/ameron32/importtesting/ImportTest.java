
package com.ameron32.importtesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.ameron32.gurpsbattleflow.Importer;
import com.ameron32.gurpsbattleflow.Importer.ImportType;
import com.ameron32.gurpsbattleflow.attackoptions.AttackOption;
import com.ameron32.gurpsbattleflow.attackoptions.MeleeAttackOption;
import com.ameron32.gurpsbattleflow.items.design.Item;
import com.ameron32.gurpsbattleflow.items.design.Weapon;
import com.ameron32.testing.ImportTesting;

public class ImportTest {

    /*
    static final List<Item> libraryArmor = new ArrayList<Item>();
    static final List<Item> libraryMeleeWeapon = new ArrayList<Item>();
    static final List<AttackOption> libraryMeleeWeaponOption = new ArrayList<AttackOption>();
    static final List<Item> libraryShield = new ArrayList<Item>();
    static final String dirPath = "C:\\Users\\klemeilleur\\Dropbox\\Public\\GURPS\\";

    public static void main(String[] args) {
        Importer i = new Importer();
        i.readCSVIntoList(dirPath + "item155-armor.csv", libraryArmor, ImportType.Armor);
        i.readCSVIntoList(dirPath + "item155-meleeattackoptions.csv", libraryMeleeWeaponOption,
                ImportType.MeleeWeaponOption);
        i.readCSVIntoList(dirPath + "item155-meleeweapons.csv", libraryMeleeWeapon,
                ImportType.MeleeWeapon);
        i.readCSVIntoList(dirPath + "item155-shield.csv", libraryShield, ImportType.Shield);

        addAttackOptionsForWeapons(libraryMeleeWeapon, libraryMeleeWeaponOption);

        p(libraryArmor.size() + " armors" + "\n");
        p(libraryMeleeWeapon.size() + " mWeapons" + "\n");
        p(libraryMeleeWeaponOption.size() + " mwOptions" + "\n");
        p(libraryShield.size() + " shields" + "\n\n");

        for (Item item : libraryArmor) {
            p(item.getName()
                    + "\n" + "    $" + item.getCost() + ", " + item.getWeight() + ", "
                    + item.getId()
                    + "\n" + "      " + item.getDescription()
                    + "\n" + "    " + item.toString()
                    + "\n\n");
        }

        for (Item item : libraryMeleeWeapon) {
            p(item.getName()
                    + "\n" + "    $" + item.getCost() + ", " + item.getWeight() + ", "
                    + item.getId()
                    + "\n" + "      " + item.getDescription()
                    + "\n" + "    " + item.toString()
                    + "\n\n");
        }

        for (AttackOption ao : libraryMeleeWeaponOption) {
            p(ao.toString() + "\n\n");
        }

        for (Item item : libraryShield) {
            p(item.getName()
                    + "\n" + "    $" + item.getCost() + ", " + item.getWeight() + ", "
                    + item.getId()
                    + "\n" + "      " + item.getDescription()
                    + "\n" + "    " + item.toString()
                    + "\n\n");
        }
        
        logClose();

    }

    public static void p(String s) {
        System.out.println(s);
        log(s);
    }

    public static void addAttackOptionsForWeapons(
            List<Item> weaponsOnly, List<AttackOption> attackOptions) {
        for (Item item : weaponsOnly) {
            for (AttackOption ao : attackOptions) {
                Weapon w = (Weapon) item;
                MeleeAttackOption mao = (MeleeAttackOption) ao;

                if (mao.getWeaponId().equalsIgnoreCase(w.getWeaponId()))
                    w.addAttackOption(mao);
            }
        }
    }

    static PrintWriter out;
    static final String newline = System.getProperty("line.separator");
    public static void log(String s) {
        
        if (out == null) {
            try {
                String outPath = dirPath + "completeList155.txt";
                File f = new File(outPath);
                if (f.exists()) 
                    f.delete();
                out = new PrintWriter(new FileWriter(outPath), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        if (out != null) {
            out.write(s.replaceAll("\n", newline));
        }
    }
    
    public static void logClose() {
        out.close();
    }
    */
    
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

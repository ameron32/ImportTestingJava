
package com.ameron32.importtesting;

import java.util.ArrayList;
import java.util.List;

import com.ameron32.gurpsbattleflow.Advantage;
import com.ameron32.gurpsbattleflow.Importer;
import com.ameron32.gurpsbattleflow.Importer.ImportType;
import com.ameron32.gurpsbattleflow.Skill;
import com.ameron32.gurpsbattleflow.character.CharacterRecord;
import com.ameron32.gurpsbattleflow.items.design.Item;

public class CharacterTester {
    static final List<Advantage> libraryAdv = new ArrayList<Advantage>();
    static final List<Skill> librarySkill = new ArrayList<Skill>();
    static final List<Item> libraryItem = new ArrayList<Item>();
    static final String dirPath = "C:\\Users\\klemeilleur\\Dropbox\\Public\\GURPS\\";
    
    public static void importFromCSV() {
        Importer i = new Importer();
        i.readCSVIntoList(dirPath + "adv155-modifications.csv", libraryAdv, ImportType.Advantage);
        i.readCSVIntoList(dirPath + "skills155-wdefaults.csv", librarySkill, ImportType.Skill);
//      i.readCSVIntoList(dirPath + "adv155-modifications.csv", libraryItem, ImportType.Advantage);
    }
    
    public static void main(String[] args) {
        importFromCSV();
        
        CharacterRecord cr = new CharacterRecord(10, 10, 10, 10);
        cr.finalize();
        
//        p(cr.toString());
        p(libraryAdv.size() + "");
        p(librarySkill.size() + "");
    }
    
    public static void p(String s) {
        System.out.println(s);
    }
}

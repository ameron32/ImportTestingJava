package com.ameron32.gurpsbattleflow;

import java.util.ArrayList;
import java.util.List;

public class StringTools {
    /**
     * Short method to convert a string separated with semicolons into a List of
     * Strings without semicolons
     * 
     * @param s
     * @return
     */
    public static List<String> genList(String s) {
        List<String> genList = new ArrayList<String>();
        char[] cc = s.toCharArray();
        short noOfSemicolons = 0;
        short[] semicolonAt = new short[100];
        short i = 0;
        for (i = 0; i < cc.length; i++) {
            if (cc[i] == ';') {
                // if ((";").equals(cc[i])) {
                semicolonAt[noOfSemicolons] = i;
                noOfSemicolons++;
            }
        }

        String add;
        for (i = 0; i < noOfSemicolons; i++) {
            // first
            if (i == 0)
                add = s.substring(0, semicolonAt[i]);
            else
                // +1 drops semicolon
                add = s.substring(semicolonAt[i - 1] + 1 
                        , semicolonAt[i]);
            if (add != null)
                genList.add(add);
        }
        return genList;
    }
}

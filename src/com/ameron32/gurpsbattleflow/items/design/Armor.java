
package com.ameron32.gurpsbattleflow.items.design;

import java.util.List;

import com.ameron32.gurpsbattleflow.StringTools;

public class Armor extends Item {
    private static final long serialVersionUID = 3592351610507935292L;
    
    String material;
    List<String> covers;
    short dr, don, holdout;
    // Addon[] addons;
    
    /**
     * Standard Constructor
     * 
     * @param name
     * @param id
     * @param cost
     * @param tl
     * @param weight
     * @param specialNotes
     * @param description
     * @param material
     * @param covers
     * @param dr
     * @param don
     * @param holdout
     */
    public Armor(String name, int id, int cost, short tl, float weight, String specialNotes,
            String description, String material, List<String> covers, short dr, short don, short holdout) {
        super(name, id, cost, tl, weight, specialNotes, description);
        this.material = material;
        this.covers = covers;
        this.dr = dr;
        this.don = don;
        this.holdout = holdout;
    }


    /**
     * Duplicate an existing armor
     * 
     * @param name
     */
    public Armor(Armor source) {
        super(source);
        this.material = source.material;
        this.covers = source.covers;
        this.dr = source.dr;
        this.don = source.don;
        this.holdout = source.holdout;
    }
    
    /**
     * Reserved for importer
     * 
     * @param id
     * @param name
     * @param material
     * @param covers
     * @param tl
     * @param dr
     * @param cost
     * @param weight
     * @param don
     * @param holdout
     */
    public Armor(int id, String name, String material, String covers, short tl, short dr, int cost, float weight, short don, short holdout) {
        super(name, id, cost, tl, weight, "", "");
        this.material = material;
        this.covers = StringTools.genList(covers);
        this.dr = dr;
        this.don = don;
        this.holdout = holdout;
    }

/*
 * SPECIAL CIRCUMSTANCES
 */
    short modCr, modImp, modCut;
    boolean isFlexArmor, isCombustible, isSemiAblative, makesReducedDX, isRequiredForPlate, 
        givesIgnoreBadTerrain, isDRUndersideOnly, givesHamFisted, givesBadGrip, givesStealth, 
        removesSnowStealthModifier;
    
    public void setSpecialModifiers(int cr, int imp, int cut, boolean flex, boolean combust, boolean semiAblative, 
            boolean reducedDX, boolean reqForPlate, boolean ignoreBadTerrain, boolean undersideDRonly, boolean hamFisted,
            boolean badGrip, boolean stealth, boolean snowStealthMod) {
        modCr = (short)cr;
        modImp = (short)imp;
        modCut = (short)cut;
        isFlexArmor = flex;
        isCombustible = combust;
        isSemiAblative = semiAblative;
        makesReducedDX = reducedDX;
        isRequiredForPlate = reqForPlate;
        givesIgnoreBadTerrain = ignoreBadTerrain;
        isDRUndersideOnly = undersideDRonly;
        givesHamFisted = hamFisted;
        givesBadGrip = badGrip;
        givesStealth = stealth;
        removesSnowStealthModifier = snowStealthMod;
    }
    
    /*
     * GETTERS AND SETTERS
     */

    public String getMaterial() {
        return material;
    }


    public List<String> getCovers() {
        return covers;
    }


    public short getDr() {
        return dr;
    }


    public short getDon() {
        return don;
    }


    public short getHoldout() {
        return holdout;
    }
}

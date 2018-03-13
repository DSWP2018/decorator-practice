package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
/**Membership. */
public abstract class Membership {
    /**Variables. */
    private static ArrayList addBenefits
            = new ArrayList<Object>(); /**Array list benefits. */
    private String description = ""; /**Descriptoin. */
    private static final int CONSCOST = 5; /**constante cost. */
    private int cost = CONSCOST; /**Cost default. */

    /**@return arraylist. */
    public final ArrayList getAllBenefits() {
        return this.addBenefits;
    }
    /**@param des */
    public final void setDescription(final String des) {
        this.description = des;
    }
    /**@return string */
    public abstract String getDescription();
    /**@param co */
    public final void setCost(final int co) {
        this.cost += co;
    }
    /**abstract setbenefits. */
    public abstract void setBenefits();
}

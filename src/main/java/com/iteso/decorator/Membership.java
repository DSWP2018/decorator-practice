package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Mariana Sierra
 * Abstract class.
 */
public abstract class Membership {

    /**Attributes of the basic Membership. */
    private String description = "Membership"; /**Description
     of the membership. */
    private double cost = 0; /**Actual cost of the membership. */
    private ArrayList benefits = new ArrayList(); /**List of all
     the benefits. */

    /**Method getDescription. /*
     *
     * @return a String with all the description.
     */
    public final String getDescription() {
        return description;
    }

    /**Method setDescription. /*
     *
     * @param newFeature string with the new feature.
     */
    public final void setDescription(final String newFeature) {
        this.description += " " + newFeature;
    }

    /**Method getAllBenefits. /*
     *
     * @return an ArrayList with all the benefits.
     */
    public final ArrayList getAllBenefits() {
        return this.benefits;
    }

    /**Method setBenefit. /*
     *
     * @param benefit name of the new benefit.
     */
    public final void setBenefits(final String benefit) {
        benefits.add(benefit);
    }

    /**Method getCost. /*
     *
     * @return get a double that represent the cost.
     */
    public final double getCost() {
        return cost;
    }

    /**Method setCost. /*
     * @param newCost add to the actual cost.
     */
    public final void setCost(final double newCost) {
        this.cost += newCost;
    }


}

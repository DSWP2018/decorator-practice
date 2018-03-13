package com.iteso.decorator;

import org.apache.commons.collections.iterators.ArrayListIterator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Mariana Sierra
 * Abstract class.
 */
public abstract class Membership {

    /**Attributes of the basic Membership. */
    private String description = "Membership"; /**Description of the membership. */
    private double cost = 0; /**Actual cost of the membership. */
    private ArrayList benefits; /**List of all the benefits. */

    /**Method getDescription. /*
     *
     * @return a String with all the description.
     */
    public String getDescription(){
        return description;
    }

    public void setDescription(String newFeature){
        this.description += newFeature;
    }

    /**Method getAllBenefits. /*
     *
     * @return an ArrayList with all the benefits.
     */
    public ArrayList getAllBenefits(){
        return this.benefits;
    }

    /**Method setBenefit. /*
     *
     * @param benefit
     */
    public void setBenefits(String benefit){
        benefits.add(benefit);
    }

    /**Method getCost. /*
     *
     * @return get a double that represent the cost.
     */
    public double getCost() {
        return cost;
    }

    /**Method setCost. /*
     *
     */
    public void setCost(double cost){
        this.cost += cost;
    }


}

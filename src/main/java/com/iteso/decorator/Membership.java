package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Membership {

    /**
     * List of al benefits.
     */
    private ArrayList<BenefitDecorator> beneficts;

    /**
     * Cost of the product.
     */
    private double cost = 0;

    /**
     * Description of the product.
     */
    private String description = "Any Membership";


    /**
     * @return description.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @param desc description.
     */
    public final void setDescription(final String desc) {
        description = desc;
    }

    /**
     * @return total cost.
     */
    public final  double getCost() {
        return cost;
    }

    /**
     * @param newCost new cost.
     */
    public final  void setCost(final double newCost) {
        cost = newCost;
    }

    /**
     * @return all the benefits.
     */
    public final ArrayList<BenefitDecorator> getBenefits() {
        return beneficts;
    }

}

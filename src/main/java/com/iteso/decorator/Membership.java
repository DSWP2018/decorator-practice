package com.iteso.decorator;

import java.util.Vector;

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
    private Vector<BenefitDecorator> beneficts = new Vector<BenefitDecorator>();

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
        String des = description;
        int x;

        for (x = 0; x < beneficts.size() - 1; x++) {
            des = des + "\n" + beneficts.elementAt(x).getDesc();
        }

        return des;
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
    public final Vector<BenefitDecorator> getBenefits() {
        return beneficts;
    }

}

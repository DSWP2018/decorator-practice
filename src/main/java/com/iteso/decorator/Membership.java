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
     * benefits.
     */
    private ArrayList benefits;

    /**
     * get.
     * @return benefits
     */
    public final ArrayList getBenefits() {
        return benefits;
    }

    /**
     * set.
     * @param b benefits
     */
    public final void setBenefits(final ArrayList b) {
        this.benefits = b;
    }

    /**
     * all.
     * @return benefits
     */
    public abstract ArrayList getAllBenefits();

    /**
     * cost.
     * @return cost
     */
    public abstract double getCost();
}

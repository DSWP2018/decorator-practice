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
     *
     */
    private ArrayList<Benefit> benefits;
    /**
     *
     */
    private String membershipDescription;
    /**
     *
     */
    private int membershipCost;

    /**
     *
     * @return the benefits
     */
    public final ArrayList<Benefit> getAllBenefits() {
        return benefits;
    }

    /**
     *
     */
    public abstract void setBenefits();

    /**
     *
     * @return cost
     */
    public final int getMembershipCost() {
        return membershipCost;
    }

    /**
     *
     * @return description
     */
    public final String getMembershipDescription() {
        return membershipDescription;
    }

    /**
     *
     * @param membCost to define cost
     */
    public final void setMembershipCost(final int membCost) {
        this.membershipCost = membCost;
    }

    /**
     *
     * @param membDesc to define description
     */
    public final void setMembershipDescription(final String membDesc) {
        this.membershipDescription = membDesc;
    }

    /**
     *
     */
    public final void initArrayList() {
        benefits = new ArrayList<Benefit>();
    }
}

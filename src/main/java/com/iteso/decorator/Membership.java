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

    private ArrayList<Object> benefits;
    private String membershipDescription;
    private int membershipCost;

    /**
     *
     * @return
     */
    public ArrayList getAllBenefits(){
        return benefits;
    }

    /**
     *
     */
    public abstract void setBenefits();

    /**
     *
     * @return
     */
    public int getMembershipCost(){
        return membershipCost;
    }

    /**
     *
     * @return
     */
    public String getMembershipDescription() {
        return membershipDescription;
    }

    /**
     *
     * @param membershipCost
     */
    public void setMembershipCost(int membershipCost) {
        this.membershipCost = membershipCost;
    }

    /**
     *
     * @param membershipDescription
     */
    public void setMembershipDescription(String membershipDescription) {
        this.membershipDescription = membershipDescription;
    }
}

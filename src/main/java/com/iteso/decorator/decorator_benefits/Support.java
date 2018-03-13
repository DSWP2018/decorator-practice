package com.iteso.decorator.decorator_benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Support.
 */
public class Support extends Benefits {
    /**
     * Cost per unit.
     */
    private static final double COST = 0.08;
    /**
     * Unlimited.
     */
    private boolean hasSupport;
    /**
     * Status support.
     */
    private String support;

    /**
     * Constructor.
     * @param membership Membership to be decorated
     * @param hasTechSupp Unlimited = True
     */
    public Support(final Membership membership,
                   final boolean hasTechSupp) {
        super(membership);
        this.hasSupport = hasTechSupp;
        if (hasSupport) {
            support = "Yes";
        } else {
            support = "No";
        }
        addBenefit();
    }

    /**
     *
     * @return Account DESCRIPTION.
     */
    public final String getDescription() {
        return getMembership().getDescription()
                + "Support = " + support + ", ";
    }

    /**
     * Adds a new benefit.
     */
    @Override
    public final void addBenefit() {
        getMembership().getAllBenefits().put("Support", support);
    }

    /**
     *
     * @return Returns account COST
     */
    public final double getCost() {
        if (hasSupport) {
            return getMembership().getCost() + COST;
        } else {
            return getMembership().getCost();
        }
    }
}

package com.iteso.decorator.decorator_benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Cloud Storage.
 */
public class CloudStorage extends Benefits {
    /**
     * Cost per unit.
     */
    private static final double COST = 0.02;
    /**
     * Desired amount.
     */
    private static double amount;

    /**
     * Constructor.
     * @param membership Membership to be decorated
     * @param requiredAmount Desired amount
     */
    public CloudStorage(final Membership membership, final int requiredAmount) {
        super(membership);
        this.amount = requiredAmount;
        addBenefit();
    }

    /**
     *
     * @return Account DESCRIPTION.
     */
    public final String getDescription() {
        return getMembership().getDescription()
                + "Cloud Storeage = " + amount + ", ";
    }

    /**
     * Adds a new benefit.
     */
    @Override
    public final void addBenefit() {
        getMembership().getAllBenefits().put("Cloud Storeage", "" + amount);
    }

    /**
     *
     * @return Returns account COST
     */
    public final double getCost() {
        return getMembership().getCost() + (COST * amount);
    }
}

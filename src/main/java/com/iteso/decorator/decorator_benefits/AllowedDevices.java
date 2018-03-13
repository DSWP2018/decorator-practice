package com.iteso.decorator.decorator_benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Allowed Devices.
 */
public class AllowedDevices extends Benefits {
    /**
     * Cost per unit.
     */
    private static final double COST = 0.03;
    /**
     * Desired amount.
     */
    private static double amount;

    /**
     * Constructor.
     * @param membership Membership to be decorated
     * @param requiredAmount Desired amount
     */
    public AllowedDevices(final Membership membership,
                          final int requiredAmount) {
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
                + "Allowed Devices = " + amount + ", ";
    }

    /**
     * Adds a new benefit.
     */
    @Override
    public final void addBenefit() {
        getMembership().getAllBenefits()
                .put("Allowed Devices", "" + amount);
    }

    /**
     *
     * @return Returns account COST
     */
    public final double getCost() {
        return getMembership().getCost() + (COST * amount);
    }
}

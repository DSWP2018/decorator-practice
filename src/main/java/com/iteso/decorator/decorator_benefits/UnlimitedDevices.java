package com.iteso.decorator.decorator_benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * UnlimitedDevices.
 */
public class UnlimitedDevices extends Benefits {
    /**
     * Cost per unit.
     */
    private static final double COST = 0.06;
    /**
     * Unlimited.
     */
    private boolean isUnlimited;
    /**
     * Status unlimited.
     */
    private String unlimited;

    /**
     * Constructor.
     * @param membership Membership to be decorated
     * @param unlimitedDevices Unlimited = True
     */
    public UnlimitedDevices(final Membership membership,
                            final boolean unlimitedDevices) {
        super(membership);
        this.isUnlimited = unlimitedDevices;
        if (isUnlimited) {
            unlimited = "Yes";
        } else {
            unlimited = "No";
        }
        addBenefit();
    }

    /**
     *
     * @return Account DESCRIPTION.
     */
    public final String getDescription() {
        return getMembership().getDescription()
                + "Unlimited Devices = " + unlimited + ", ";
    }

    /**
     * Adds a new benefit.
     */
    @Override
    public final void addBenefit() {
        getMembership().getAllBenefits().put("Unlimited Devices", unlimited);
    }

    /**
     *
     * @return Returns account COST
     */
    public final double getCost() {
        if (isUnlimited) {
            return getMembership().getCost() + COST;
        } else {
            return getMembership().getCost();
        }
    }
}

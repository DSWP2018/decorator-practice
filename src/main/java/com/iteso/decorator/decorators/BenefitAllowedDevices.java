package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/** Benefit that set AllowedDevices to 20. */
public class BenefitAllowedDevices extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public BenefitAllowedDevices(final Membership membership) {
        super(membership);
        super.setDescription("Allowed devices: 20");
        super.setAllowedDevices(20);
        super.setCost(90.30);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Allowed devices: 20";
    }

    /**
     * Get the Cost of this benefit.
     * @return the cost.
     */
    @Override
    public double getCost() {
        return super.getCost();
    }
}

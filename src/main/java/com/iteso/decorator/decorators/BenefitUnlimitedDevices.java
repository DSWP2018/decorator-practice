package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/** Benefit that set Unlimited devices. */
public class BenefitUnlimitedDevices extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public BenefitUnlimitedDevices(Membership membership) {
        super(membership);
        super.setDescription("Unlimited devices");
        super.setCost(120.10);
        super.setUnlimitedDevices(true);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Unlimited devices";
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

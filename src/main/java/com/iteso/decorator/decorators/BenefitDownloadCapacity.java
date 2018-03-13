package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/** Benefit that set the Download capacity to 90. */
public class BenefitDownloadCapacity extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public BenefitDownloadCapacity(Membership membership) {
        super(membership);
        super.setDescription("Download capacity: 90");
        super.setDownloadCapacity(90);
        super.setCost(100.30);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Download capacity: 90";
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

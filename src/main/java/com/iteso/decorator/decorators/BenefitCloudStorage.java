package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/** Benefit that set the Cloud Storage to 100. */
public class BenefitCloudStorage extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public BenefitCloudStorage(Membership membership) {
        super(membership);
        super.setDescription("Cloud storage: 100");
        super.setCloudStorage(100);
        super.setCost(99.99);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Cloud storage: 100";
    }


    @Override
    public void setCloudStorage(int cloudStorage) {

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

package com.iteso.decorator.decorator_benefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Support Coverage.
 */
public class SupportCoverage extends Benefits {
    /**
     * Cost per unit.
     */
    private static final double COST = 0.02;
    /**
     * Coverage.
     */
    private static String coverage;

    /**
     * Constructor.
     * @param membership Membership to be decorated
     * @param suppCoverage Desired amount
     */
    public SupportCoverage(final Membership membership,
                           final String suppCoverage) {
        super(membership);
        this.coverage = suppCoverage;
        addBenefit();
    }

    /**
     *
     * @return Account DESCRIPTION.
     */
    public final String getDescription() {
        return getMembership().getDescription()
                + "Support Coverage = " + coverage + ", ";
    }

    /**
     * Adds a new benefit.
     */
    @Override
    public final void addBenefit() {
        getMembership().getAllBenefits().put("Cloud Storeage", coverage);
    }

    /**
     *
     * @return Returns account COST
     */
    public final double getCost() {
        return getMembership().getCost() + COST;
    }
}

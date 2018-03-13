package com.iteso.decorator;

import java.util.ArrayList;

/**
 * asdfasdf.
 */
public class MembershipBase extends Membership {

    /**
     * constructor.
     */
    public MembershipBase() {
        setBenefits(new ArrayList());
    }
    @Override
    public final ArrayList getAllBenefits() {
        return getBenefits();
    }

    @Override
    public final double getCost() {
        return 0;
    }
}

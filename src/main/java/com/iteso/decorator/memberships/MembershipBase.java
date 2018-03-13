package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class MembershipBase extends Membership {

    /**
     * constructor
     */
    public MembershipBase() {
        setBenefits(new ArrayList());
    }
    @Override
    public ArrayList getAllBenefits() {
        return getBenefits();
    }

    @Override
    public double getCost() {
        return 0;
    }
}

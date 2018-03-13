package com.iteso.decorator.benefits;

import java.util.Map;

import com.iteso.decorator.Membership;

/** */
public class SimultaneousLoginsBenefit extends MembershipDecorator {
    /** */
    private static final double ADDEDCOST = 4;

    /**
     * @param mem mem
     */
    public SimultaneousLoginsBenefit(final Membership mem) {
        super(mem);
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        Map<String, String> m = getMembership().getAllBenefits();
        m.put("SimultaneousLogin", "true");
        return m;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return getMembership().getCost() + ADDEDCOST;
    }

}

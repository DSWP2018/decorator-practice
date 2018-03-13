package com.iteso.decorator.benefits;

import java.util.Map;

import com.iteso.decorator.Membership;

/** */
public class SupportBenefit extends MembershipDecorator {
    /** */
    private static final double ADDEDCOST = 16;

    /**
     * @param mem mem
     */
    public SupportBenefit(final Membership mem) {
        super(mem);
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        Map<String, String> m = getMembership().getAllBenefits();
        m.put("Support benefit", "true");
        m.put("Support Coverage", "Everything");
        return m;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return getMembership().getCost() + ADDEDCOST;
    }

}

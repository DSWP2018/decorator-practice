package com.iteso.decorator.benefits;

import java.util.Map;

import com.iteso.decorator.Membership;

/** */
public class CloudStorageBenefit extends MembershipDecorator {
    /** */
    private static final double ADDEDCOST = 3;

    /**
     * @param mem mem
     */
    public CloudStorageBenefit(final Membership mem) {
        super(mem);
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        Map<String, String> m = getMembership().getAllBenefits();
        m.put("Cloud Storage", "100");
        return m;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return getMembership().getCost() + ADDEDCOST;
    }

}

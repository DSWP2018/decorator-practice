package com.iteso.decorator.benefits;

import java.util.Map;

import com.iteso.decorator.Membership;

/** */
public class UnlimitedDevicesBenefit extends MembershipDecorator {
    /** */
    private static final double ADDEDCOST = 8;

    /**
     * @param mem mem
     */
    public UnlimitedDevicesBenefit(final Membership mem) {
        super(mem);
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        Map<String, String> m = getMembership().getAllBenefits();
        m.put("Unlimited devices", "true");
        return m;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return getMembership().getCost() + ADDEDCOST;
    }

}

package com.iteso.decorator.benefits;

import java.util.Map;

import com.iteso.decorator.Membership;

/** */
public class AllowedDevicesBenefit extends MembershipDecorator {
    /** */
    private static final double ADDEDCOST = 12;

    /**
     * @param mem mem
     */
    public AllowedDevicesBenefit(final Membership mem) {
        super(mem);
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        Map<String, String> m = getMembership().getAllBenefits();
        m.put("AllowedDevices", "10");
        return m;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return getMembership().getCost() + ADDEDCOST;
    }

}

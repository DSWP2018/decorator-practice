package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefit;
import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;


/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {


    //public static final int DOWNLOAD_CAPACITY = 3000;
    /**
     *
     */
    public static final int COST = 1299;
    /**
     *
     */
    public static final int CLOUD_STORAGE = 1000;
    /**
     *
     */
    public static final int ALLOWED_DEVICES = -1;
    /**
     *
     */
    public static final String ULTIMATE_MEMBERSHIP = "Ultimate Membership";

    //public static final int SIMULTANEOUS_LOGINS = 20;
    /**
     *
     */
    public static final boolean SUPPORT = true;

    /**
     *
     */
    public static final String ULTIMATE = "Ultimate";
    /**
     *
     */
    public static final boolean UNLIMITED_DEVICES = true;

    /**
     *
     * @param membership to define the membership
     */
    public UltimateMembership(final Membership membership) {
        initMembership(COST, ULTIMATE_MEMBERSHIP, membership.getAllBenefits());
        setBenefits();
    }

    /**
     *
     */
    public final void setBenefits() {
        getAllBenefits().add(new Benefit((Integer) CLOUD_STORAGE,
                "Cloud Storage"));
        getAllBenefits().add(new Benefit((Integer) ALLOWED_DEVICES,
                "Allowed Devices"));
        getAllBenefits().add(new Benefit((Boolean) SUPPORT,
                "Support"));
        getAllBenefits().add(new Benefit((Boolean) UNLIMITED_DEVICES,
                "Unlimited Devices"));
    }
}

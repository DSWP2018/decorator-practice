package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefit;
import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;


/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {


    //public static final int DOWNLOAD_CAPACITY = 1000;
    /**
     *
     */
    public static final int COST = 599;
    /**
     *
     */
    public static final int CLOUD_STORAGE = 500;
    /**
     *
     */
    public static final int ALLOWED_DEVICES = 10;
    /**
     *
     */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    //public static final int SIMULTANEOUS_LOGINS = 3;
    /**
     *
     */
    public static final boolean SUPPORT = true;
    /**
     *
     */
    public static final String GOLD = "Gold";
    /**
     *
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     *
     * @param membership to define the new membership
     */
    public GoldMembership(final Membership membership) {
        initMembership(COST, GOLD_MEMBERSHIP, membership.getAllBenefits());
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

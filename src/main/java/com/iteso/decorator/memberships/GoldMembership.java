package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {


    //public static final int DOWNLOAD_CAPACITY = 1000;
    public static final int COST = 599;
    public static final int CLOUD_STORAGE = 500;
    public static final int ALLOWED_DEVICES = 10;
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    //public static final int SIMULTANEOUS_LOGINS = 3;
    public static final boolean SUPPORT = true;
    public static final String GOLD = "Gold";
    public static final boolean UNLIMITED_DEVICES = false;

    public GoldMembership(Membership membership){
        membership.setMembershipDescription(GOLD_MEMBERSHIP);
        membership.setMembershipCost(COST);
        setMembership(membership);
        setBenefits();

    }

    /**
     *
     * @return
     */
    public void setBenefits() {
        getMembership().getAllBenefits().add((Integer) CLOUD_STORAGE);
        getMembership().getAllBenefits().add((Integer) ALLOWED_DEVICES);
        getMembership().getAllBenefits().add((Boolean) SUPPORT);
        getMembership().getAllBenefits().add((Boolean) UNLIMITED_DEVICES);
    }



}

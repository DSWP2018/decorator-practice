package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership extends Membership {


    public static final int DOWNLOAD_CAPACITY = 150;
    public static final int COST = 0;
    //public static final int CLOUD_STORAGE = 50;
    //public static final int ALLOWED_DEVICES = 1;
    //public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final int SIMULTANEOUS_LOGINS = 1;
    //public static final boolean SUPPORT = false;
    public static final String FREE = "Free";
    //public static final boolean UNLIMITED_DEVICES = false;

    BaseMembership(){
        setMembershipCost(COST);
        setMembershipDescription(FREE);
        setBenefits();
    }

    @Override
    public void setBenefits() {
        getAllBenefits().add((Integer)DOWNLOAD_CAPACITY);
        getAllBenefits().add((Integer)SIMULTANEOUS_LOGINS);
    }
}

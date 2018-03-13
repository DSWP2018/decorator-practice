package com.iteso.decorator;



/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership extends Membership {

    /**
     *
     */
    public static final int DOWNLOAD_CAPACITY = 150;
    /**
     *
     */
    public static final int COST = 0;
    //public static final int CLOUD_STORAGE = 50;
    //public static final int ALLOWED_DEVICES = 1;
    /**
     *
     */
    public static final String FREE_MEMBERSHIP = "Free Membership";
    /**
     *
     */
    public static final int SIMULTANEOUS_LOGINS = 1;
    //public static final boolean SUPPORT = false;
    /**
     *
     */
    public static final String FREE = "Free";
    //public static final boolean UNLIMITED_DEVICES = false;

    /**
     *
     */
    public BaseMembership() {
        setMembershipCost(COST);
        setMembershipDescription(FREE_MEMBERSHIP);
        setBenefits();
    }

    /**
     *
     */
    @Override
    public final void setBenefits() {
        initArrayList();
        getAllBenefits().add(new Benefit((Integer) DOWNLOAD_CAPACITY,
                "Download Capacity"));
        getAllBenefits().add(new Benefit((Integer) SIMULTANEOUS_LOGINS,
                "Simultaneous logins"));
    }
}

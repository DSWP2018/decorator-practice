package com.iteso.decorator.decorators;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class Gold extends Benefits{



    public static final int DOWNLOAD_CAPACITY = 1000;
    /*
    * variable de GoldMembership
    * */
    public static final int COST = 599;
    /*
     * variable de GoldMembership
     * */
    public static final int CLOUD_STORAGE = 500;
    /*
     * variable de GoldMembership
     * */
    public static final int ALLOWED_DEVICES = 10;
    /*
     * variable de GoldMembership
     * */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /*
     * variable de GoldMembership
     * */
    public static final int SIMULTANEOUS_LOGINS = 3;
    /*
     * variable de GoldMembership
     * */
    public static final boolean SUPPORT = true;
    /*
     * variable de GoldMembership
     * */
    public static final String GOLD = "Gold";
    /*
     * variable de GoldMembership
     * */
    public static final boolean UNLIMITED_DEVICES = false;
    /*
     * variable de GoldMembership
     * */

    public Gold(Membership base) {
        super(base);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
       setCost(COST);
       setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(GOLD);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    public ArrayList getAllBenefits() {
        return null;
    }

}

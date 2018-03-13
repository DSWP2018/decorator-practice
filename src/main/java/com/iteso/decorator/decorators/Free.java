package com.iteso.decorator.decorators;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class Free extends Benefits{



    public static final int DOWNLOAD_CAPACITY = 150;
    /*
     *variable de FreeMembership
     * */
    public static final int COST = 0;
    /*
     * variable de FreeMembership
     * */
    public static final int CLOUD_STORAGE = 50;
    /*
     *variable de FreeMembership
      *  */
    public static final int ALLOWED_DEVICES = 1;
    /*
     * variable de FreeMembership
     * */
    public static final String FREE_MEMBERSHIP = "Free Membership";
    /*
     *variable de FreeMembership
      *  */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /*
     * variable de FreeMembership
     * */
    public static final boolean SUPPORT = false;
    /*
     *variable de FreeMembership
      *  */
    public static final String FREE = "Free";
    /*
     * variable de FreeMembership
     * */
    public static final boolean UNLIMITED_DEVICES = false;
    /*
     * variable de FreeMembership
     * */

    public Free(Membership base) {
        super(base);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
       setDescription(FREE_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(FREE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    public ArrayList getAllBenefits() {
        return null;
    }

}

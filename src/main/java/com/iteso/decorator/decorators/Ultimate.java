package com.iteso.decorator.decorators;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class Ultimate extends Benefits{



    public static final int DOWNLOAD_CAPACITY = 3000;
    /*
    * variable de UltimateMembership
    * */
    public static final int COST = 1299;
    /*
    * variable de UltimateMembership
    * */
    public static final int CLOUD_STORAGE = 1000;
    /*
    * variable de UltimateMembership
    * */
    public static final int ALLOWED_DEVICES = -1;
    /*
    * variable de UltimateMembership
    * */
    public static final String ULTIMATE_MEMBERSHIP = "Ultimate Membership";
    /*
    * variable de UltimateMembership
    * */
    public static final int SIMULTANEOUS_LOGINS = 20;
    /*
    * variable de UltimateMembership
    * */
    public static final boolean SUPPORT = true;
    /*
    * variable de UltimateMembership
    * */
    public static final String ULTIMATE = "Ultimate";
    /*
    *variable de UltimateMembership
     *  */
    public static final boolean UNLIMITED_DEVICES = true;
    /*
    *variable de UltimateMembership  */

    public Ultimate(Membership base) {
        super(base);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(ULTIMATE_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(ULTIMATE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    public ArrayList getAllBenefits() {
        return null;
    }

}

package com.iteso.decorator;

import java.util.ArrayList;

public class BaseMembership extends Membership{

    public static final int DOWNLOAD_CAPACITY = 150;
    public static final int COST = 0;
    public static final int CLOUD_STORAGE = 50;
    public static final int ALLOWED_DEVICES = 1;
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final int SIMULTANEOUS_LOGINS = 1;
    public static final boolean SUPPORT = false;
    public static final String FREE = "Free";
    public static final boolean UNLIMITED_DEVICES = false;

    public BaseMembership() {
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
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

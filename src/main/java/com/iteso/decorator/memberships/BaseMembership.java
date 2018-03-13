package com.iteso.decorator.memberships;
/**
 * */
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership extends Membership {
    /**
     * */
    public static final int DOWNLOAD_CAPACITY = 150;
    /**
     * */
    public static final int COST = 0;
    /**
     * */
    public static final int CLOUD_STORAGE = 50;
    /**
     * */
    public static final int ALLOWED_DEVICES = 1;
    /**
     * */
    public static final String GOLD_MEMBERSHIP = "Base Membership";
    /**
     * */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /**
     * */
    public static final boolean SUPPORT = false;
    /**
     * */
    public static final String FREE = "Base";
    /**
     * */
    public static final boolean UNLIMITED_DEVICES = false;
    /**
     * */
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
    /**
     * */
    public ArrayList getAllBenefits() {
        features.add("Allowed devices: "+getAllowedDevices());
        features.add("Cloud storage: "+getAllowedDevices());
        features.add("Cost: "+getCost());
        features.add("Description: "+getDescription());
        features.add("Download capacity: "+getDownloadCapacity());
        features.add("Simultaneous logins: "+getSimultaneousLogins());
        features.add("Support: "+getSupportCoverage());
        features.add("Unlimited devices: "+isUnlimitedDevices());
        return features;
    }
}

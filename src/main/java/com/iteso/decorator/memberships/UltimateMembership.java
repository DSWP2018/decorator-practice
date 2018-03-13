package com.iteso.decorator.memberships;
/**
 * */
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {

    /**
     * */
    public static final int DOWNLOAD_CAPACITY = 3000;
    /**
     * */
    public static final int COST = 1299;
    /**
     * */
    public static final int CLOUD_STORAGE = 1000;
    /**
     * */
    public static final int ALLOWED_DEVICES = -1;
    /**
     * */
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    /**
     * */
    public static final int SIMULTANEOUS_LOGINS = 20;
    /**
     * */
    public static final boolean SUPPORT = true;
    /**
     * */
    public static final String ULTIMATE = "Ultimate";
    /**
     * */
    public static final boolean UNLIMITED_DEVICES = true;
    /**
     * */
    public UltimateMembership(final Membership base) {
        super(base);

        base.setAllowedDevices(ALLOWED_DEVICES);
        base.setCloudStorage(CLOUD_STORAGE);
        base.setCost(COST);
        base.setDescription(GOLD_MEMBERSHIP);
        base.setDownloadCapacity(DOWNLOAD_CAPACITY);
        base.setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        base.setSupport(SUPPORT);
        base.setSupportCoverage(ULTIMATE);
        base.setUnlimitedDevices(UNLIMITED_DEVICES);
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

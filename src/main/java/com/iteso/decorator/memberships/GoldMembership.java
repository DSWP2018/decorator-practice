package com.iteso.decorator.memberships;
/**
 * */
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {

    /**
     * */
    public static final int DOWNLOAD_CAPACITY = 1000;
    /**
     * */
    public static final int COST = 599;
    /**
     * */
    public static final int CLOUD_STORAGE = 500;
    /**
     * */
    public static final int ALLOWED_DEVICES = 10;
    /**
     * */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /**
     * */
    public static final int SIMULTANEOUS_LOGINS = 3;
    /**
     * */
    public static final boolean SUPPORT = true;
    /**
     * */
    public static final String GOLD = "Gold";
    /**
     * */
    public static final boolean UNLIMITED_DEVICES = false;
    /**
     * */
    public GoldMembership(final Membership base) {
        super(base);

        base.setAllowedDevices(ALLOWED_DEVICES);
        base.setCloudStorage(CLOUD_STORAGE);
        base.setCost(COST);
        base.setDescription(GOLD_MEMBERSHIP);
        base.setDownloadCapacity(DOWNLOAD_CAPACITY);
        base.setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        base.setSupport(SUPPORT);
        base.setSupportCoverage(GOLD);
        base.setUnlimitedDevices(UNLIMITED_DEVICES);

    }
    /**
     * */
    @Override
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

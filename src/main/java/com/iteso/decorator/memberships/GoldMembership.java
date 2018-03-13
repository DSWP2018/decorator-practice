package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Benefits;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {
    public static final int DOWNLOAD_CAPACITY = 1000;
public static final int COST = 599;
public static final int CLOUD_STORAGE = 500;
public static final int ALLOWED_DEVICES = 10;
public static final String GOLD_MEMBERSHIP = "Gold Membership";
public static final int SIMULTANEOUS_LOGINS = 3;
public static final boolean SUPPORT = true;
public static final String GOLD = "Gold";
public static final boolean UNLIMITED_DEVICES = false;

    private Membership membership;

    public GoldMembership( final Membership mem ) {
        super(mem);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(GOLD);
        setUnlimitedDevices(UNLIMITED_DEVICES);
        setDescription("Membresía gold");
    }

    @Override public ArrayList<String> getAllBenefits() {
        allBenefits.add("Allowed devices: "+getAllowedDevices());
        allBenefits.add("Cloud storage: "+getAllowedDevices());
        allBenefits.add("Download capacity: "+getDownloadCapacity());
        allBenefits.add("Simultaneous logins: "+getSimultaneousLogins());
        allBenefits.add("Support: "+getSupportCoverage());
        allBenefits.add("Unlimited devices: "+isUnlimitedDevices());

        return allBenefits;
    }
}

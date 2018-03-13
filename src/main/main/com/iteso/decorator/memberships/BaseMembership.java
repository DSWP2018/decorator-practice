package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Benefits;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership extends Membership {
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
        setDescription("Membresía gratuita");
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

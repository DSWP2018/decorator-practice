package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {


    public static final int DOWNLOAD_CAPACITY = 3000;
    public static final int COST = 1299;
    public static final int CLOUD_STORAGE = 1000;
    public static final int ALLOWED_DEVICES = -1;
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    public static final int SIMULTANEOUS_LOGINS = 20;
    public static final boolean SUPPORT = true;
    public static final String ULTIMATE = "Ultimate";
    public static final boolean UNLIMITED_DEVICES = true;

    public UltimateMembership(Membership membership) {
        super(membership);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
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

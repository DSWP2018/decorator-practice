package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends BenefitsDecorator {

    /**
     * Variable de Gold.
     */
    public static final int DOWNLOAD_CAPACITY = 1000;
    /**
     * Variable de Gold.
     */
    public static final int COST = 599;
    /**
     * Variable de Gold.
     */
    public static final int CLOUD_STORAGE = 500;
    /**
     * Variable de Gold.
     */
    public static final int ALLOWED_DEVICES = 10;
    /**
     * Variable de Gold.
     */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /**
     * Variable de Gold.
     */
    public static final int SIMULTANEOUS_LOGINS = 3;
    /**
     * Variable de Gold.
     */
    public static final boolean SUPPORT = true;
    /**
     * Variable de Gold.
     */
    public static final String GOLD = "Gold";
    /**
     * Variable de Gold.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * Cosntructor.
     * @param m membership
     */
    public GoldMembership(final Membership m) {
        super(m);
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

    /**
     * Arraylist.
     * @return arraylist
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}

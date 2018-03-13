package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {

    /** Download capacity. */
    public static final int DOWNLOAD_CAPACITY = 1000;
    /** Cost. */
    public static final int COST = 599;
    /** Cloud storage. */
    public static final int CLOUD_STORAGE = 500;
    /** Allowed devices. */
    public static final int ALLOWED_DEVICES = 10;
    /** Gold membership. */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /** Simultaneous logins. */
    public static final int SIMULTANEOUS_LOGINS = 3;
    /** Support. */
    public static final boolean SUPPORT = true;
    /** Free. */
    public static final String GOLD = "Gold";
    /** Unlimited devices. */
    public static final boolean UNLIMITED_DEVICES = false;


    /** Constructor.
     * @param m .*/
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

    /** Get all benefits of membership.
     * @return ArrayList . */
    public final ArrayList getAllBenefits() {
        return null;
    }
}

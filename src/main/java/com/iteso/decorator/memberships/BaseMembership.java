package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/** Base membership. */
public class BaseMembership extends Membership {

    /** Download capacity. */
    public static final int DOWNLOAD_CAPACITY = 150;
    /** Cost. */
    public static final int COST = 0;
    /** Cloud storage. */
    public static final int CLOUD_STORAGE = 50;
    /** Allowed devices. */
    public static final int ALLOWED_DEVICES = 1;
    /** Gold membership. */
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    /** Simultaneous logins. */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /** Support. */
    public static final boolean SUPPORT = false;
    /** Free. */
    public static final String FREE = "Free";
    /** Unlimited devices. */
    public static final boolean UNLIMITED_DEVICES = false;

    /** Constructor. */
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

    /** Get all benefits of membership.
     * @return ArrayList . */
    public final ArrayList getAllBenefits() {
        return null;
    }

}

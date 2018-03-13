package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends BenefitsDecorator {

    /**
     * Variable de FreeMembership.
     */
    public static final int DOWNLOAD_CAPACITY = 150;
    /**
     * Variable de FreeMembership.
     */
    public static final int COST = 0;
    /**
     * Variable de FreeMembership.
     */
    public static final int CLOUD_STORAGE = 50;
    /**
     * Variable de FreeMembership.
     */
    public static final int ALLOWED_DEVICES = 1;
    /**
     * Variable de FreeMembership.
     */
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    /**
     * Variable de FreeMembership.
     */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /**
     * Variable de FreeMembership.
     */
    public static final boolean SUPPORT = false;
    /**
     * Variable de FreeMembership.
     */
    public static final String FREE = "Free";
    /**
     * Variable de FreeMembership.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * Metodo constructor.
     * @param m membership.
     */
    public FreeMembership(final Membership m) {
        super(m);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSupport(SUPPORT);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupportCoverage(FREE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    /**
     * Metodo de freemembership.
     * @return null
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}

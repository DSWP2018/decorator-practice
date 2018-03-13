package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends BenefitsDecorator {

    /**
     * Variable de ultimate.
     */
    public static final int DOWNLOAD_CAPACITY = 3000;
    /**
     * Variable de ultimate.
     */
    public static final int COST = 1299;
    /**
     * Variable de ultimate.
     */
    public static final int CLOUD_STORAGE = 1000;
    /**
     * Variable de ultimate.
     */
    public static final int ALLOWED_DEVICES = -1;
    /**
     * Variable de ultimate.
     */
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    /**
     * Variable de ultimate.
     */
    public static final int SIMULTANEOUS_LOGINS = 20;
    /**
     * Variable de ultimate.
     */
    public static final boolean SUPPORT = true;
    /**
     * Variable de ultimate.
     */
    public static final String ULTIMATE = "Ultimate";
    /**
     * Variable de ultimate.
     */
    public static final boolean UNLIMITED_DEVICES = true;

    /**
     * Constructor.
     * @param m membership.
     */
    public UltimateMembership(final Membership m) {
        super(m);
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

    /**
     * Arraylist.
     * @return arraylist
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}

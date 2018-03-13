package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership extends Membership {
    /**
     * I'm Jack's impending lungs.
     */
    public static final int DOWNLOAD_CAPACITY = 150;
    /**
     * I ate my wings.
     */
    public static final int COST = 0;
    /**
     * So that I could meme.
     */
    public static final int CLOUD_STORAGE = 50;
    /**
     * Gucci Gang, gucci gang.
     */
    public static final int ALLOWED_DEVICES = 1;
    /**
     * Comí unas galletas.
     */
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    /**
     * Y me destrozaron la garganta.
     */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /**
     * Por qué? .
     */
    public static final boolean SUPPORT = false;
    /**
     * Edgy is edgy.
     */
    public static final String FREE = "Free";
    /**
     * Yeah, heavily document everything.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * This is a constructor.
     */
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

    @Override
    public final ArrayList<String> getAllBenefits() {
        allBenefits.add("Allowed devices: " + getAllowedDevices());
        allBenefits.add("Cloud storage: " + getAllowedDevices());
        allBenefits.add("Download capacity: " + getDownloadCapacity());
        allBenefits.add("Simultaneous logins: " + getSimultaneousLogins());
        allBenefits.add("Support: " + getSupportCoverage());
        allBenefits.add("Unlimited devices: " + isUnlimitedDevices());

        return allBenefits;
    }
}

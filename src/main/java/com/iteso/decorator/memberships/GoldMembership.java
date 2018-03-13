package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Benefits;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {
    /**
     * I really don't know.
     */
    public static final int DOWNLOAD_CAPACITY = 1000;
    /**
     * What I'd be doing instead of this.
     */
    public static final int COST = 599;
    /**
     * Isn't that insane?.
     */
    public static final int CLOUD_STORAGE = 500;
    /**
     * Whatever, did you see the new.
     */
    public static final int ALLOWED_DEVICES = 10;
    /**
     * Blade Runner movie?.
     */
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /**
     * Do you want me to transcript some dialogues?.
     */
    public static final int SIMULTANEOUS_LOGINS = 3;
    /**
     * I'd write the laughing-crying emoji.
     */
    public static final boolean SUPPORT = true;
    /**
     * But there's none.
     */
    public static final String GOLD = "Gold";
    /**
     * Just like our hearts.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * "With lots of cells".
     * @param mem is us.
     */
    public GoldMembership(final Membership mem) {
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

    /**
     * Interlinked.
     * @return (Interlinked).
     */
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

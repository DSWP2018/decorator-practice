package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Benefits;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {
    /**
     * Me recuerda a otro maestro.
     */
    public static final int DOWNLOAD_CAPACITY = 3000;
    /**
     * Todos le decían Coco.
     */
    public static final int COST = 1299;
    /**
     * Quién hubiera dicho que.
     */
    public static final int CLOUD_STORAGE = 1000;
    /**
     * Escribir en líneas de menos de 80 c.
     */
    public static final int ALLOWED_DEVICES = -1;
    /**
     * Aracteres es tan doloroso.
     */
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    /**
     * En fin, Coco.
     */
    public static final int SIMULTANEOUS_LOGINS = 20;
    /**
     * Pues no sé, me recuerda a él.
     */
    public static final boolean SUPPORT = true;
    /**
     * Por suerte usted no es completamente.
     */
    public static final String ULTIMATE = "Ultimate";
    /**
     * Como Coco.
     */
    public static final boolean UNLIMITED_DEVICES = true;

    /**
     * Unavailable.
     * @param mem (the person reading this).
     */
    public UltimateMembership(final Membership mem) {
        super(mem);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(ULTIMATE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
        setDescription("Membresía ultimate");
    }

    /**
     * Or not.
     * @return some stuff.
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

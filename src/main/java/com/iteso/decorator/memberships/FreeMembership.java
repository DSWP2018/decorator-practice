package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Benefits.AllowedDevices;
import com.iteso.decorator.Benefits.CloudStorage;
import com.iteso.decorator.Benefits.DownloadCapacity;
import com.iteso.decorator.Benefits.SimultaneousLogins;
import com.iteso.decorator.Benefits.Support;
import com.iteso.decorator.Membership;
import java.util.Vector;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Membership {

    /**
     * BASE DOWNLOAD_CAPACITY.
     */
    public static final int DOWNLOAD_CAPACITY = 150;

    /**
     * BASE COST.
     */
    public static final int COST = 0;

    /**
     * BASE CLOUD STORAGE.
     */
    public static final int CLOUD_STORAGE = 50;

    /**
     * BASE ALLOWED DEVICES.
     */
    public static final int ALLOWED_DEVICES = 1;

    /**
     * BASE GOLD MEMBERSHIP.
     */
    public static final String GOLD_MEMBERSHIP = "Free Membership";

    /**
     * SIMULTANEOUS LOGIS.
     */
    public static final int SIMULTANEOUS_LOGINS = 1;

    /**
     * BASE SUPORT BOOLEAN.
     */
    public static final boolean SUPPORT = false;

    /**
     * BASE SUPORT.
     */
    public static final String FREE = "Free";

    /**
     * BASE UNLIMITED DEVICES LOCKED.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * SET ALL VARIABLES.
     */
    public FreeMembership() {
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        getBenefits().add(new AllowedDevices(ALLOWED_DEVICES, this));
        getBenefits().add(new CloudStorage(CLOUD_STORAGE, this));
        getBenefits().add(new DownloadCapacity(DOWNLOAD_CAPACITY, this));
        getBenefits().add(new SimultaneousLogins(SIMULTANEOUS_LOGINS, this));
        getBenefits().add(new Support(1,  this));
    }

    /**
     * @return null always.
     */
    public final Vector<BenefitDecorator> getAllBenefits() {
        return getBenefits();
    }
}

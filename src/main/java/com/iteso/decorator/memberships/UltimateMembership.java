package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {

    /**Variables. */
    public static final int
            DOWNLOAD_CAPACITY = 3000; /**Capacidad de descraga. */
    public static final int
            COST = 1299; /**Costo. */
    public static final int
            CLOUD_STORAGE = 1000; /**Storage cloud. */
    public static final int
            ALLOWED_DEVICES = -1; /**Dispositios permitidos. */
    //public static final String GOLD_MEMBERSHIP = "Ultimate Membership"; /
    public static final int
            SIMULTANEOUS_LOGINS = 20; /**Logs simulteanos. */
    public static final boolean
            SUPPORT = true; /**Soporte. */
    //public static final String ULTIMATE = "Ultimate";
    public static final boolean
            UNLIMITED_DEVICES = true; /**Dispositivos inlimitados. */
    /**Constructor.
     * @param membersh */
    public UltimateMembership(final Membership membersh) {
        setMembership(membersh);
        setBenefits();
        membersh.setCost(this.COST);
        membersh.setDescription(getDescription());
    }

    /*public ArrayList getAllBenefits() {
        return getMembership().getAllBenefits();
    }*/
    /**Setbenefits. */
    @Override
    public final void setBenefits() {
        getMembership().getAllBenefits().add(DOWNLOAD_CAPACITY);
        getMembership().getAllBenefits().add(CLOUD_STORAGE);
        getMembership().getAllBenefits().add(ALLOWED_DEVICES);
        getMembership().getAllBenefits().add(SIMULTANEOUS_LOGINS);
        getMembership().getAllBenefits().add(SUPPORT);
        getMembership().getAllBenefits().add(UNLIMITED_DEVICES);
    }
    /**getdescription. */
    @Override
    public final String getDescription() {
        return "Platinum";
    }
    /**@return int. */
    @Override
    public final int getCost() {
        return this.COST;
    }
}

package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {

    /**variables. */
    public static final Integer
            DOWNLOAD_CAPACITY = 1000; /**Capacidad de descarga. */
    public static final Integer
            COST = 599; /**Costo. */
    public static final Integer
            CLOUD_STORAGE = 500; /**Storage nube. */
    public static final Integer
            ALLOWED_DEVICES = 10; /**Dispositivos permitidos. */
    //public static final String GOLD_MEMBERSHIP = "Gold Membership"; /***/
    public static final Integer
            SIMULTANEOUS_LOGINS = 3; /**Logins. */
    public static final Boolean
            SUPPORT = true; /**Soporte. */
   // public static final String GOLD = "Gold";
    public static final boolean
            UNLIMITED_DEVICES = false; /**Inlimitados servicios. */

    /**Constructor.
     * @param membersh */
    public GoldMembership(final Membership membersh) {
        setMembership(membersh);
        setBenefits();
        membersh.setCost(this.COST);
        membersh.setDescription(getDescription());
    }

   /* public ArrayList getAllBenefits() {
        return getMembership().getAllBenefits();
    }
*/  /**Setbenefits. */
    @Override
    public final void setBenefits() {
        getMembership().getAllBenefits().add(DOWNLOAD_CAPACITY);
        getMembership().getAllBenefits().add(CLOUD_STORAGE);
        getMembership().getAllBenefits().add(ALLOWED_DEVICES);
        getMembership().getAllBenefits().add(SIMULTANEOUS_LOGINS);
        getMembership().getAllBenefits().add(SUPPORT);
        getMembership().getAllBenefits().add(UNLIMITED_DEVICES);
    }
    /**@return string. */
    @Override
    public final String getDescription() {
        return "Gold";
    }

    @Override
    public final int getCost() {
        return this.COST;
    }
}

package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Benefits {
    /**Variables/atributos. */
    public static final Integer
            DOWNLOAD_CAPACITY = 150; /**Cpacidad de descarga. */
    public static final Integer COST = 0; /**Coste. */
    public static final Integer
            CLOUD_STORAGE = 50; /**Storage cloud. */
    public static final Integer
            ALLOWED_DEVICES = 1; /**Dispositivos permitidos. */
   // public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final Integer
            SIMULTANEOUS_LOGINS = 1; /**Logs simulteanos. */
    public static final Boolean
            SUPPORT = false; /**Soporte. */
    //public static final String FREE = "Free";
    public static final Boolean
            UNLIMITED_DEVICES = false; /**servicio inlimitado. */

    /**@param membersh */
    public  FreeMembership(final Membership membersh) {
        setMembership(membersh);
        setBenefits();
        membersh.setDescription(getDescription());
        membersh.setCost(this.COST);
    }

   /* public ArrayList getAllBenefits() {
        return getMembership().getAllBenefits();
    }
*/
   /**Set benefits. */
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
        return "Free Membership";
    }
    /**@return int. */
    @Override
    public final int getCost() {
        return this.COST;
    }
}

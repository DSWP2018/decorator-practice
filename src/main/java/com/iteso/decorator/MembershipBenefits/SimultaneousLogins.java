package com.iteso.decorator.MembershipBenefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Atributo para decorar.
 */
public class SimultaneousLogins extends Benefits {
    /**
     * Costo nuevo.
     */
    public static final double NEW_COST = 30;

    /**
     * Manda membresía a decorar.
     * @param membership ^.
     */
    public SimultaneousLogins(final Membership membership) {
        Membership memb = membership;
        memb.setBenefits("Allows simultaneous logins.");
        memb.setCost(memb.getCost() + NEW_COST);
    }
}


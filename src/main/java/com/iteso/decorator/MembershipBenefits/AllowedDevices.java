package com.iteso.decorator.MembershipBenefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Decorador 1.
 */
public class AllowedDevices extends Benefits {

    /**
     * Costo nuevo.
     */
    public static final double NEW_COST = 70;

    /**
     * XConstructor con membresía a decorar.
     * Agrega un beneficio al arrayLIst y modifica el costo.
     * @param membership membresía.
     */
    public AllowedDevices(final Membership membership) {
        Membership memb = membership;
        memb.setBenefits("Allows 10 devices");
        memb.setCost(memb.getCost() + NEW_COST);
    }
}


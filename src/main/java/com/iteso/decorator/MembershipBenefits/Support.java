package com.iteso.decorator.MembershipBenefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Decorador 5.
 */
public class Support extends Benefits {
    /**
     * Costo nuevo.
     */
    public static final double NEW_COST = 50;

    /**
     * Constructor con membresía externa.
     * Agrega un beneficio y aumenta el costo.
     * @param membership membresía.
     */
    public Support(final Membership membership) {
        Membership memb = membership;
        memb.setBenefits("Continuous support");
        memb.setCost(memb.getCost() + NEW_COST);
    }
}


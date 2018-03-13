package com.iteso.decorator.MembershipBenefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Decorador 2.
 */
public class CloudStorage extends Benefits {
    /**
     * Costo nuevo.
     */
    public static final double NEW_COST = 55;

    /**
     * Constructor con membresía externa.
     * Agrega un beneficio y aumenta el costo.
     * @param membership membresía.
     */
    public CloudStorage(final Membership membership) {
        Membership memb = membership;
        memb.setBenefits("Has 5 TB of cloud storage.");
        memb.setCost(memb.getCost() + NEW_COST);
    }
}


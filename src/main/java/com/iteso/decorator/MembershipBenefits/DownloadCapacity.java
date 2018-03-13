package com.iteso.decorator.MembershipBenefits;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

/**
 * Decorador 3.
 */
public class DownloadCapacity extends Benefits {
    /**
     * Costo nuevo.
     */
    public static final double NEW_COST = 100;

    /**
     * Constructor con membresía externa.
     * Agrega un beneficio y aumenta el costo.
     * @param membership membresía.
     */
    public DownloadCapacity(final Membership membership) {
        Membership memb = membership;
        memb.setBenefits("50 MBps download speed");
        memb.setCost(memb.getCost() + NEW_COST);
    }
}


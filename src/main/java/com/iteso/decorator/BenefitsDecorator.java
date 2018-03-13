package com.iteso.decorator;

/**
 * Clase decoradora.
 */
public abstract class BenefitsDecorator extends Membership {

    /**
     * Variable de Membresía.
     */
    private Membership mem;

    /**
     * Constructor para el objeto a decorar.
     * @param m objeto a decorar.
     */
    public BenefitsDecorator(final Membership m) {
        mem = m;
    }

    /**
     * Getter del membership.
     * @return membership.
     */
    public final Membership getMem() {
        return mem;
    }

    /**
     * Setter de membership.
     * @param m membership.
     */
    public final void setMem(final Membership m) {
        mem = m;
    }
}

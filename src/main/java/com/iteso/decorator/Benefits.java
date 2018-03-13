package com.iteso.decorator;

/**
 * Clase abstracta para  hacer las decoraciones con un método común.
 */
public abstract class Benefits extends Membership {

    /**
     * Membresía que se manda a los beneficios.
     * Es a la que se agregan los beneficios en su arrayList.
     */
    private Membership membership;

    /**
     * Fija membresía.
     * @param mem externa
     */
    public final void setMembership(final Membership mem) {
        this.membership = mem;
    }

    /**
     * devuelve membresía.
     * @return interna.
     */
    public final Membership getMembership() {
        return this.membership;
    }

}

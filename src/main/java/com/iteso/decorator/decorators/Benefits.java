package com.iteso.decorator.decorators;

import com.iteso.decorator.Membership;

public abstract class Benefits extends Membership{

    /**
     * Variable de Membership.
     */
    private Membership membership;

    /**
     * Constructor para el objeto a decorar.
     * @param m objeto a decorar.
     */
    public Benefits(Membership m) {
        membership = m;
    }

    /**
     * Getter del membership.
     * @return membership.
     */
    public final Membership getMem() {
        return membership;
    }

    /**
     * Setter de membership.
     * @param m membership.
     */
    public final void setMembership(Membership m) {
        membership = m;
    }

}

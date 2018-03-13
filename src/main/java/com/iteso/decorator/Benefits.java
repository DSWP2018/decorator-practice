package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Clase abstracta Benefits.
 * extiende de Membership.
 */
public abstract class Benefits extends Membership {
    /**
     * Variable privada de tipo Membership.
     */
    private Membership membership;

    /**
     * Constructor de Benefits.
     * @param mem recibe una variable tipo Membership.
     */
    public Benefits(final Membership mem) {
        this.membership = mem;
    }

    /**
     *  ArrayList de beneficios de membresía.
     * @return Benefits
     */
    public abstract ArrayList getAllBenefits();
}

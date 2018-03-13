package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/**
 * Pues sí que falta el comentario.
 */
public abstract class Benefits extends Membership {
    /**
     * Que me aspen.
     */
    private Membership membership;

    /**
     * It makes you upset.
     * @param mem you (you).
     */
    public Benefits(final Membership mem) {
        membership = mem;
    }
}

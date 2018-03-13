package com.iteso.decorator;

/**
 * Clase decoradora que extiende Membership.
 */
public abstract class Benefits extends Membership {

    /**Atributo tipo Membership.*/
    private Membership membership;

    /**
     * Constructor de la clase que recibe un objeto tipo Membership.
     * Al cual se le pasarán los beneficios establecidos.
     * @param newmembership para pasar el objeto tipo Membership.
     */
    public Benefits(final Membership newmembership) {
        this.membership = newmembership;
    }

}

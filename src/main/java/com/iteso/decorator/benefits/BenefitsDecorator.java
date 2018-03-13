package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Benefits Decorator.
 */
public abstract class BenefitsDecorator extends Membership {
    /**
     * Instance.
     */
    private final Membership membership;

    /**
     * asfdaf.
     * @return asdfaf
     */
    public final Membership getMembership() {
        return membership;
    }

    /**
     * asdfadf.
     * @return asdf
     */
    public abstract ArrayList getAllBenefits();

    /**
     * obtener el costo.
     * @return asdfafsd
     */
    public abstract double getCost();

    /**
     * constructor.
     * @param mm membership
     */
    public BenefitsDecorator(final Membership mm) {
        this.membership = mm;
    }


}

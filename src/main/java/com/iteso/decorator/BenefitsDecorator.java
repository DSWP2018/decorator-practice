package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Benefits Decorator
 */
public abstract class BenefitsDecorator extends Membership {
    /**
     * Instance
     */
    Membership membership;

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public abstract ArrayList getAllBenefits();

    /**
     * obtener el costo
     */
    public abstract double getCost();

    /**
     * constructor
     * @param mm membership
     */
    public BenefitsDecorator(Membership mm){
        this.membership = mm;
    }


}

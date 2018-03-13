package com.iteso.decorator;

/**
 * Decorator benefits.
 */
public abstract class Benefits extends Membership {
    /**
     * Membership to be decorated.
     */
    private final Membership membership;

    /**
     * Benefit to be added.
     */
    public abstract void addBenefit();

    /**
     * Constructor.
     * @param membershipToDerate Membership to be decorated
     */
    public Benefits(final Membership membershipToDerate) {
        this.membership = membershipToDerate;
    }

    /**
     *
     * @return Returns membership to be decorated
     */
    public final Membership getMembership() {
        return membership;
    }
}

package com.iteso.decorator;


/** This is the Decorator. */
public abstract class Benefits extends Membership {

    /** This is de membership that will get the custom benefits. */
    private final Membership theMembership;

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public Benefits(final Membership membership) {
        this.theMembership = membership;
    }


}

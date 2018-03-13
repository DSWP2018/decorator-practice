package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/** */
public abstract class MembershipDecorator implements Membership {
    /** */
    private Membership membership;

    /**
     * @param mem mem
     */
    public MembershipDecorator(final Membership mem) {
        this.membership = mem;
    }

    /**
     * @return the membership
     */
    public final Membership getMembership() {
        return membership;
    }

}

package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/** Benefits. */
public abstract class Benefits extends Membership {

    /** Membership object. */
    private Membership membership;

    /** Constructor.
     * @param  m .*/
    public Benefits(final Membership m) {
        membership = m;
    }

    /** Get memberships benefits.
     * @return ArrayList .*/
    public abstract ArrayList getAllBenefits();

}

package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public abstract class Benefits extends Membership {

    /**Membership. */
    Membership membership; /**Membership. */

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public abstract String getBenefitDescription();
}

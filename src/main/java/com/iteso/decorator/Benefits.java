package com.iteso.decorator;

import java.util.ArrayList;

/**
 *
 */
public abstract class Benefits extends Membership {

    /**
     *
     * @param cost the cost of the membership
     * @param description the description of the membership
     * @param baseBenefit base benefits
     */
    public  final void initMembership(final int cost,
                               final String description,
                               final ArrayList<Benefit>
                                       baseBenefit) {
        setMembershipCost(cost);
        setMembershipDescription(description);
        initArrayList();
        for (Benefit benefit: baseBenefit) {
            getAllBenefits().add(benefit);
        }
    }
}

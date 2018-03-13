package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;


/**
 * Created by marianasrvg on 4/14/16.
 */
public class GoldMembership extends Benefits {


    /**Information of the benefit. */
    private final String goldMembershipName = "Type: GOLD"; /**Name. */

    /**Constructor GoldMembership. /*
     *
     * @param membership victim of decoration object.
     */
    public GoldMembership(Membership membership) {
        membership = new CloudStorage(membership);
        membership = new Support(membership);

        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setDescription(getBenefitDescription());
        setBenefits(goldMembershipName);


    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + goldMembershipName;
    }
}

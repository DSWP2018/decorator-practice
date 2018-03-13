package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.Benefits;


/**
 * Created by marianasrvg on 4/14/16.
 */
public class GoldMembership extends Benefits {


    /**Information of the benefit. */
    private final String GOLD_MEMBERSHIP_NAME = "Type: GOLD"; /**Name. */

    /**Constructor GoldMembership. /*
     *
     * @param membership
     */
    public GoldMembership(Membership membership){
        membership = new CloudStorage(membership);
        membership = new Support(membership);

        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setDescription(getBenefitDescription());
        setBenefits(GOLD_MEMBERSHIP_NAME);


    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + GOLD_MEMBERSHIP_NAME;
    }
}

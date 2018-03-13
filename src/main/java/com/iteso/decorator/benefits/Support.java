package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

public class Support extends Benefits {

    /**Information of the benefit. */
    private final String SUPPORT_NAME = "Support"; /**Name. */
    private final double SUPPORT_COST = 100.00; /** Cost. */



    /**Constructor CloudStorage. /*
     *
     * @param membership
     */
    public Support(Membership membership){
        this.membership = membership;
        this.membership.setCost(SUPPORT_COST);
        this.membership.setDescription(getBenefitDescription());
        this.membership.setBenefits(SUPPORT_NAME);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + SUPPORT_NAME;
    }


}

package com.iteso.decorator;

/**Class BaseMembership. /*
 *
 */
public class BaseMembership extends Membership {

    /**Atributes of the BaseMemebership. */
    //private final String BASE_MEMBERSHIP_NAME = "TYPE = BASE"; /** Name. */
    private final double baseMembershipCost = 0; /** Cost. */


    public BaseMembership() {
        //this.setDescription(BASE_MEMBERSHIP_NAME);
        this.setCost(baseMembershipCost);
    }
}

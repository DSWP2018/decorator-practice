package com.iteso.decorator;


public class BaseMembership extends Membership {

    /**Atributes of the BaseMemebership*/
    private final String BASE_MEMBERSHIP_NAME = "TYPE = BASE"; /** Name. */
    private final double BASE_MEMBERSHIP_COST = 0; /** Cost. */


    public BaseMembership(){
        this.setDescription(BASE_MEMBERSHIP_NAME);
        this.setCost(BASE_MEMBERSHIP_COST);
    }
}

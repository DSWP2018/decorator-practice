package com.iteso.decorator;

/**
 * Base membership.
 */
public class BaseMembership extends Membership {
    /**
     * Account DESCRIPTION.
     */
    public static final String DESCRIPTION = "Account with: ";

    /**
     * Account Cost.
     */
    public static final double COST = 0.0;


    /**
     *
     * @return Account DESCRIPTION.
     */
    @Override
    public final String getDescription() {
        return DESCRIPTION;
    }


    /**
     *
     * @return Account getCost
     */
    @Override
    public final double getCost() {
        return COST;
    }
}

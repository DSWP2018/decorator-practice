package com.iteso.decorator;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Membership {
    /**
     * Benefits of membership.
     */
    private HashMap<String, String> benefits = new HashMap<>();

    /**
     *
     * @return Benefits
     */
    public final HashMap getAllBenefits() {
        return benefits;
    }

    /**
     *
     * @return Description of all benefits
     */
    public abstract String getDescription();

    /**
     *
     * @return Account getCost
     */
    public abstract double getCost();
}

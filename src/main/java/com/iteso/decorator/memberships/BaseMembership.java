package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class BaseMembership implements Membership {
    /** */
    private double cost;
    /** */
    private Map<String, String> benefits;

    /** */
    public BaseMembership() {
        benefits = new HashMap<String, String>();
    }

    /**
     * @return Map<String,String>
     */
    public final Map<String, String> getAllBenefits() {
        return benefits;
    }

    /**
     * @return double
     */
    public final double getCost() {
        return cost;
    }
}

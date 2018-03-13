package com.iteso.decorator;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Membership {
    /**
     * @return Map<String, String>
     */
    Map<String, String> getAllBenefits();

    /**
     * @return double
     */
    double getCost();
}

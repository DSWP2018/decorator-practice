package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class SimultaneousLogins extends BenefitDecorator {

    /**
     * How much Storage costs.
     */
    private static final double MUL = 0.3;

    /**
     * @param newLogins new Logins.
     * @param mem base membership.
     */
    public SimultaneousLogins(final int newLogins, final Membership mem) {
        setMembership(mem);
        mem.setCost(mem.getCost() + newLogins * MUL);
        setDesc("Simultaneous Logins: " + newLogins);
    }


}

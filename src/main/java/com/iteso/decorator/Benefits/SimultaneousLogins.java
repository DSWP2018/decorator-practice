package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class SimultaneousLogins extends BenefitDecorator {
    /**
     * Multiplicador del costo.
     */
    private static final double MULT = 0.8;

    /**
     * base membership that is been decorated.
     */
    private Membership membership;

    /**
     * @param newLogins new logins.
     * @param mem base memnership.
     */
    public SimultaneousLogins(final int newLogins, final Membership mem) {
        membership = mem;
        mem.setSimultaneousLogins(mem.getSimultaneousLogins() + newLogins);
        mem.setCost(mem.getCost() + (newLogins * MULT));
        mem.setDescription(mem.getDescription()
                           + " plus " + mem.getSimultaneousLogins()
                           + " of Simultaneous Logins");
    }

    @Override
    public final String getDescription() {
        return membership.getDescription();
    }

}

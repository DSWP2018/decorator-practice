package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * simultaneous logins.
 */
public class SimultaneousLogins3 extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Simultaneous Logins 3";

    /**
     * Valor.
     */
    private static final double COST = 100;

    /**
     * Constructor.
     * @param mm membership
     */
    public SimultaneousLogins3(final Membership mm) {
        super(mm);
        mm.getBenefits().add(DATA);
        setBenefits(mm.getBenefits());
    }

    @Override
    public final ArrayList getAllBenefits() {
        return getBenefits();
    }

    @Override
    public final double getCost() {
        return getMembership().getCost() + COST;

    }
    /**
     * asfasd.
     * @return dfg
     */
    public static String getData() {
        return DATA;
    }

}

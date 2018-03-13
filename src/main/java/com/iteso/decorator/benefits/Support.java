package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * support.
 */
public class Support extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Support: true";

    /**
     * Valor.
     */
    private static final double COST = 200;

    /**
     * Constructor.
     * @param mm membership
     */
    public Support(final Membership mm) {
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
     * @return asdfa
     */
    public static String getData() {
        return DATA;
    }
}

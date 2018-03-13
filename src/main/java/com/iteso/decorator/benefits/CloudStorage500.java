package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * cloud storage.
 */
public class CloudStorage500 extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Cloud Storage 500";

    /**
     * Valor.
     */
    private static final double COST = 100;

    /**
     * Constructor.
     * @param mm membership
     */
    public CloudStorage500(final Membership mm) {
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
     * @return asdfas
     */
    public static String getData() {
        return DATA;
    }

}

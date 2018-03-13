package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * devices allowed.
 */
public class AllowedDevices10 extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Allowed Devices 10";

    /**
     * Valor.
     */
    private static final double COST = 100;

    /**
     * Constructor.
     * @param mm membership
     */
    public AllowedDevices10(final Membership mm) {
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
     * @return asdf
     */
    public static String getDATA() {
        return DATA;
    }

}

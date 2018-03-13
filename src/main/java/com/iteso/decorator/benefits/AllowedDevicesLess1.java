package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * devices allowed.
 */
public class AllowedDevicesLess1 extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Allowed Devices -1";

    /**
     * Valor.
     */
    private static final double COST = 215;

    /**
     * Constructor.
     * @param mm membership
     */
    public AllowedDevicesLess1(final Membership mm) {
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
     * @return asfd
     */
    public static String getDATA() {
        return DATA;
    }

}

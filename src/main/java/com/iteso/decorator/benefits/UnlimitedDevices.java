package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * unlimitedDevices.
 */
public class UnlimitedDevices extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Unlimited Devices: true";

    /**
     * Valor.
     */
    private static final double COST = 200;

    /**
     * Constructor.
     * @param mm membership
     */
    public UnlimitedDevices(final Membership mm) {
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

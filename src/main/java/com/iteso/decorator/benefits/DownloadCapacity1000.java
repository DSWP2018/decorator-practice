package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * download capacity.
 */
public class DownloadCapacity1000 extends BenefitsDecorator {
    /**
     * Información.
     */
    private static final String DATA = "Download Capacity 1000";

    /**
     * Valor.
     */
    private static final double COST = 100;

    /**
     * Constructor.
     * @param mm membership
     */
    public DownloadCapacity1000(final Membership mm) {
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
     * @return asdfadsf
     */
    public static String getData() {
        return DATA;
    }

}

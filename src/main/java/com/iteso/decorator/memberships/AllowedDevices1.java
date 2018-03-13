package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * devices allowed
 */
public class AllowedDevices1 extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Allowed Devices 1";

    /**
     * Valor
     */
    static double costBenefit = 0;

    /**
     * Constructor
     * @param mm membership
     */
    public AllowedDevices1(Membership mm) {
        super(mm);
        mm.getBenefits().add(data);
        setBenefits(mm.getBenefits());
    }

    @Override
    public ArrayList getAllBenefits() {
        return getBenefits();
    }

    @Override
    public double getCost() {
        return getMembership().getCost() + costBenefit;

    }

}

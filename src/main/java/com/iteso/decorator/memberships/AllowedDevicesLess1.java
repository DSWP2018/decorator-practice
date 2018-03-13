package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * devices allowed
 */
public class AllowedDevicesLess1 extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Allowed Devices -1";

    /**
     * Valor
     */
    static double costBenefit = 215;

    /**
     * Constructor
     * @param mm membership
     */
    public AllowedDevicesLess1(Membership mm) {
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

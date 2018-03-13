package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * devices allowed
 */
public class AllowedDevices10 extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Allowed Devices 10";

    /**
     * Valor
     */
    static double costBenefit = 100;

    /**
     * Constructor
     * @param mm membership
     */
    public AllowedDevices10(Membership mm) {
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

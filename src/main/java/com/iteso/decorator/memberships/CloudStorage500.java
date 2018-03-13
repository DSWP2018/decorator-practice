package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * cloud storage
 */
public class CloudStorage500 extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Cloud Storage 500";

    /**
     * Valor
     */
    static double costBenefit = 100;

    /**
     * Constructor
     * @param mm membership
     */
    public CloudStorage500(Membership mm) {
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

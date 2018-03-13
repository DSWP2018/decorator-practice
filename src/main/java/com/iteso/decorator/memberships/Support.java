package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * support
 */
public class Support extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Support: true";

    /**
     * Valor
     */
    static double costBenefit = 200;

    /**
     * Constructor
     * @param mm membership
     */
    public Support(Membership mm) {
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

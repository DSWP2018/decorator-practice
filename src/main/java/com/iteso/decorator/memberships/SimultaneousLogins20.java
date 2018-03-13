package com.iteso.decorator.memberships;

import com.iteso.decorator.BenefitsDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * simultaneous logins
 */
public class SimultaneousLogins20 extends BenefitsDecorator {
    /**
     * Información
     */
    static String data = "Simultaneous Logins 20";

    /**
     * Valor
     */
    static double costBenefit = 232;

    /**
     * Constructor
     * @param mm membership
     */
    public SimultaneousLogins20(Membership mm) {
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

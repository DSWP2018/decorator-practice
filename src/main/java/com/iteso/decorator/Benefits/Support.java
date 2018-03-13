package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class Support extends BenefitDecorator {

    /**
     * Basic support.
     */
    private static final double BAS = 300;

    /**
     * Golden support.
     */
    private static final double GLD = 900;


    /**
     * Support.
     */
    private boolean support;

    /**
     * @param supportType new amount of storage.
     * @param mem base membership.
     */
    public Support(final int supportType, final Membership mem) {
        setMembership(mem);

        if (supportType == 0) {
            support = false;
            setDesc("No support");
        } else if (supportType == 1) {
            support = true;
            mem.setCost(mem.getCost() + BAS);
            setDesc("Basic support");
        } else if (supportType == 2) {
            support = true;
            mem.setCost(mem.getCost() + GLD);
            setDesc("Golden Support support");
        }


    }
}

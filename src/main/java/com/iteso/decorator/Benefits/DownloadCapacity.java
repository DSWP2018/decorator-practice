package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class DownloadCapacity extends BenefitDecorator {

    /**
     * How much Download Capacity.
     */
    private static final double MUL = 0.8;


    /**
     * @param newCapacity new amount of storage.
     * @param mem base membership.
     */
    public DownloadCapacity(final int newCapacity, final Membership mem) {
        setMembership(mem);
        mem.setCost(mem.getCost() + newCapacity * MUL);
        setDesc("Devices Allowed: " + newCapacity);
    }


}

package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class AllowedDevices extends BenefitDecorator {

    /**
     * Multiplicador del costo.
     */
    private static final double MULT = 0.2;

    /**
     * base membership that is been decorated.
     */
    private Membership membership;

    /**
     * @param newDevices new amount of devices.
     * @param mem base membership.
     */
    public AllowedDevices(final int newDevices, final Membership mem) {
        membership = mem;
        mem.setDownloadCapacity(mem.getAllowedDevices() + newDevices);
        mem.setCost(mem.getCost() + (newDevices * MULT));
        mem.setDescription(mem.getDescription() + " of Allowed devices");
    }

    @Override
    public final String getDescription() {
        return membership.getDescription();
    }

}

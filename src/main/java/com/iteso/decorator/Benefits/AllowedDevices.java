package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class AllowedDevices extends BenefitDecorator {

    /**
     * How much Storage costs.
     */
    private static final double MUL = 0.2;

    /**
     * Unlimited devices price.
     */
    private static final int UNLP = 1000;

    /**
     * If the the allowed devices are unlimited then this is true.
     */
    private boolean unlimitedState;

    /**
     * @param newDevices new amount of storage.
     * @param mem base membership.
     */
    public AllowedDevices(final int newDevices, final Membership mem) {
        setMembership(mem);

        if (newDevices == -1) {
            mem.setCost(mem.getCost() + UNLP);
            setDesc("Unlimited Devices Allowed");
            unlimitedState = true;
        } else {
            mem.setCost(mem.getCost() + newDevices * MUL);
            setDesc("Devices Allowed: " + newDevices);
            unlimitedState = false;
        }

    }


}

package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

/**
 * Created by Federico Ibarra.
 */
public class CloudStorage extends BenefitDecorator {

    /**
     * How much Storage costs.
     */
    private static final double MUL = 0.4;

    /**
     * @param newStorage new amount of storage.
     * @param mem base membership.
     */
    public CloudStorage(final int newStorage, final Membership mem) {
        setMembership(mem);
        mem.setCost(mem.getCost() + newStorage * MUL);
        setDesc("Cloud Storage: " + newStorage);
    }


}

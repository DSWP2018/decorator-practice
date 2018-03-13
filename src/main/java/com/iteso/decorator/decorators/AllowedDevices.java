package com.iteso.decorator.decorators;
import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

public class AllowedDevices extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public AllowedDevices(final Membership membership) {
        super(membership);
        super.setDescription("Allowed devices: 30");
        super.setAllowedDevices(30);
        super.setCost(90);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Allowed devices: 30";
    }

    /**
     * Get the Cost of this benefit.
     * @return the cost.
     */
    @Override
    public double getCost() {
        return super.getCost();
    }
}

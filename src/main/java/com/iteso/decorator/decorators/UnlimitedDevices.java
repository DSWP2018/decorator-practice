package com.iteso.decorator.decorators;
import com.iteso.decorator.Membership;
import com.iteso.decorator.Benefits;

public class UnlimitedDevices extends Benefits {

    public UnlimitedDevices(Membership membership) {
        super(membership);
        super.setDescription("Unlimited devices");
        super.setCost(110);
        super.setUnlimitedDevices(true);
    }


    public String getTheBenefit() {
        return "Unlimited devices";
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}

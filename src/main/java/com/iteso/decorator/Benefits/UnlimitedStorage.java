package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

public class UnlimitedStorage extends BenefitDecorator{

    Membership membership;

    public UnlimitedStorage(int newStorage, Membership mem){
        membership = mem;
        mem.setUnlimitedDevices(true);
        mem.setCost(mem.getCost()+100);
        mem.setDescription(mem.getDescription()+
                           " plus "+mem.getCloudStorage()+
                           " of Unlimited Deevices");
    }

    @Override
    public String getDescription() {
        return membership.getDescription();
    }

}

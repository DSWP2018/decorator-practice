package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class DownloadCapacity extends BenefitDecorator{

    Membership membership;

    public DownloadCapacity(int newCapacity, Membership mem){
        membership = mem;
        mem.setDownloadCapacity(mem.getDownloadCapacity()+newCapacity);
        mem.setCost(mem.getCost()+(newCapacity * 0.6));
        mem.setDescription(mem.getDescription()+
                           " plus "+mem.getDownloadCapacity()+
                           " of Download Capacity");
    }

    @Override
    public String getDescription() {
        return membership.getDescription();
    }

}

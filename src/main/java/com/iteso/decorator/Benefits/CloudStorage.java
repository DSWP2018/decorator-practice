package com.iteso.decorator.Benefits;

import com.iteso.decorator.BenefitDecorator;
import com.iteso.decorator.Membership;

public class CloudStorage extends BenefitDecorator{

    Membership membership;

    public CloudStorage(int newStorage, Membership mem){
        membership = mem;
        mem.setDownloadCapacity(mem.getCloudStorage()+newStorage);
        mem.setCost(mem.getCost()+(newStorage * 0.2));
        mem.setDescription(mem.getDescription()+
                           " plus "+mem.getCloudStorage()+
                           " of Cloud Storage");
    }

    @Override
    public String getDescription() {
        return membership.getDescription();
    }

}

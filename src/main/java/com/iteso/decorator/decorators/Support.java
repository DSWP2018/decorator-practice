package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

public class Support extends Benefits {

    private boolean support = false;
    private final double cost = 10;

    public Support (final Membership membership){
        membership.setCost(cost);
        membership.setBenefit(this);
    }

    public boolean isSupport() {
        return support;
    }
    public void setSupport(boolean support) {
        this.support = support;
    }
}

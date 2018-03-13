package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

public class SimultaneousLogins extends Benefits {
    private final double cost=10;

    private int simultaneousLogins = 0;

    public SimultaneousLogins(Membership membership){
        membership.setBenefit(this);
        membership.setCost(cost);
    }

    public int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    public void setSimultaneousLogins(int simultaneousLogins) {
        this.simultaneousLogins = simultaneousLogins;
    }

}

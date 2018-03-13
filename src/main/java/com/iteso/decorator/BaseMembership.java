package com.iteso.decorator;

import com.iteso.decorator.Membership;

public class BaseMembership extends Membership {
    private static Integer OP = 1;

    public BaseMembership(){
        setBenefits();
        //System.out.print("hi");
    }

    @Override
    public void setBenefits() {
        getAllBenefits().add(OP);
    }


}

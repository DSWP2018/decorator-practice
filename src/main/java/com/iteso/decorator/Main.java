package com.iteso.decorator;

import com.iteso.decorator.memberships.FreeMembership;
import com.iteso.decorator.memberships.GoldMembership;
import com.iteso.decorator.memberships.UltimateMembership;

public class Main {
    public static  void main(String args[]) {
        Membership base = new BaseMembership();
        //System.out.println(base.getAllBenefits().toString());
        base = new GoldMembership(base);
        System.out.println(base.getAllBenefits().toString() + "\n Membership: " + base.getDescription());
        Membership base2 = new BaseMembership();
        base2 = new FreeMembership(base2);
        System.out.println(base2.getAllBenefits().toString() + "\n Membership: " + base2.getDescription());
        Membership base3 = new BaseMembership();
        base3 = new UltimateMembership(base3);
        System.out.println(base3.getAllBenefits().toString() + "\n Membership: " + base3.getDescription());



    }
}

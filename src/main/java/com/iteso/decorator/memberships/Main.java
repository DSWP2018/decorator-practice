package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;


public class Main {

    public static void main(String args[]){
        Membership base = new BaseMembership();
        System.out.println(base.getAllBenefits());
        System.out.println("=======================================");
        base = new GoldMembership(base);
        System.out.println(base.getAllBenefits());
        System.out.println("=======================================");
        base = new UltimateMembership(base);
        System.out.println(base.getAllBenefits());

    }
}

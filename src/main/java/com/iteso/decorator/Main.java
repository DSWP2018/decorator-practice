package com.iteso.decorator;

import com.iteso.decorator.memberships.BaseMembership;
import com.iteso.decorator.memberships.GoldMembership;
import com.iteso.decorator.memberships.UltimateMembership;

import java.lang.reflect.Member;

public class Main {
    public static void main(String []args) {
        Membership membresia = new BaseMembership();
        System.out.println(membresia.getAllBenefits());

        membresia = new GoldMembership(membresia);
        System.out.println(membresia.getAllBenefits());

        membresia = new UltimateMembership(membresia);
        System.out.println(membresia.getAllBenefits());
    }
}

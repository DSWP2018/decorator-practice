package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;
import  com.iteso.decorator.memberships.Cloud;

public class Implementacion {
    public static void main(String[] args) {
        Membership m = new BaseMembership();
        System.out.println(m.getDescription());
        System.out.println("$" + m.getCost() + " MXN");
        m = new Cloud(m, 5);
        m = new Download(m, 75);
        m = new Devices(m, 5, 5, true);
        m = new Support(m, true, "Mexico");
        System.out.println(m.getDescription());
        System.out.println("$" + m.getCost() + " MXN");
    }
}

package com.iteso.decorator;

import com.iteso.decorator.benefits.DownloadCapacityBenefit;
import com.iteso.decorator.benefits.SimultaneousLoginsBenefit;
import com.iteso.decorator.benefits.UnlimitedDevicesBenefit;
import com.iteso.decorator.memberships.BaseMembership;

/** */
public final class Main {
    /** */
    private Main() {

    }

    /**
     * @param args args
     */
    public static void main(final String[] args) {
        Membership m = new SimultaneousLoginsBenefit(
                new DownloadCapacityBenefit(
                    new UnlimitedDevicesBenefit(new BaseMembership())));

        System.out.println("Cost" + m.getCost());

        m.getAllBenefits().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}

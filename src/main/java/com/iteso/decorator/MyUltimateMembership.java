package com.iteso.decorator;


import com.iteso.decorator.benefits.AllowedDevicesLess1;
import com.iteso.decorator.benefits.CloudStorage1000;
import com.iteso.decorator.benefits.DownloadCapacity3000;
import com.iteso.decorator.benefits.SimultaneousLogins20;
import com.iteso.decorator.benefits.Support;
import com.iteso.decorator.benefits.UnlimitedDevices;

/**
 * ultimate.
 */
public class MyUltimateMembership {
    /**
     * type.
     */
    private static final String TYPE = "Ultimate Membership";

    /**
     * constructor.
     */
    public MyUltimateMembership() {
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity3000(membership);
        membership = new CloudStorage1000(membership);
        membership = new AllowedDevicesLess1(membership);
        membership = new SimultaneousLogins20(membership);
        membership = new Support(membership);
        membership = new UnlimitedDevices(membership);

        System.out.println(TYPE);


        for (int i = 0; i < membership.getAllBenefits().size(); i++) {
            System.out.println(membership.getAllBenefits().get(i));
        }
        System.out.println(membership.getCost());
        System.out.println();
        System.out.println();
    }

    /**
     * asfdaf.
     * @return asdf
     */
    public static String getType() {
        return TYPE;
    }
    /**
     * metodo tonto para checkstyle.
     */
    public void something() {

    }
}

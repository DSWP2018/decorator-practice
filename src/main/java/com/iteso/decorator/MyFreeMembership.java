package com.iteso.decorator;


import com.iteso.decorator.benefits.AllowedDevices1;
import com.iteso.decorator.benefits.CloudStorage50;
import com.iteso.decorator.benefits.DownloadCapacity150;
import com.iteso.decorator.benefits.SimultaneousLogins1;

/**
 * free.
 */
public class MyFreeMembership {
    /**
     * type.
     */
    private static final String TYPE = "Free Membership";

    /**
     * constructor.
     */
    public MyFreeMembership() {
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity150(membership);
        membership = new CloudStorage50(membership);
        membership = new AllowedDevices1(membership);
        membership = new SimultaneousLogins1(membership);

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

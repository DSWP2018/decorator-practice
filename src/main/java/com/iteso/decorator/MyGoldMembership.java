package com.iteso.decorator;

import com.iteso.decorator.benefits.AllowedDevices10;
import com.iteso.decorator.benefits.CloudStorage500;
import com.iteso.decorator.benefits.DownloadCapacity1000;
import com.iteso.decorator.benefits.SimultaneousLogins3;
import com.iteso.decorator.benefits.Support;

/**
 * gold.
 */
public class MyGoldMembership {
    /**
     * type.
     */
    private  static final String TYPE = "Gold Membership";

    /**
     *
     */
    public MyGoldMembership() {
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity1000(membership);
        membership = new CloudStorage500(membership);
        membership = new AllowedDevices10(membership);
        membership = new SimultaneousLogins3(membership);
        membership = new Support(membership);

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

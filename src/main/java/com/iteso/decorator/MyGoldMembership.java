package com.iteso.decorator;

import com.iteso.decorator.memberships.*;

public class MyGoldMembership {
    /**
     * type
     */
    public static String typeMembership = "Gold Membership";

    public MyGoldMembership(){
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity1000(membership);
        membership = new CloudStorage500(membership);
        membership = new AllowedDevices10(membership);
        membership = new SimultaneousLogins3(membership);
        membership = new Support(membership);

        System.out.println(typeMembership);

        for(int i = 0; i < membership.getAllBenefits().size(); i++) {
            System.out.println(membership.getAllBenefits().get(i));
        }
        System.out.println(membership.getCost());
        System.out.println();
        System.out.println();
    }
}

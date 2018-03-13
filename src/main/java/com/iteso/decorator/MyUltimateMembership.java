package com.iteso.decorator;

import com.iteso.decorator.memberships.*;

public class MyUltimateMembership {
    /**
     * type
     */
    public static String typeMembership = "Ultimate Membership";


    public MyUltimateMembership(){
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity3000(membership);
        membership = new CloudStorage1000(membership);
        membership = new AllowedDevicesLess1(membership);
        membership = new SimultaneousLogins20(membership);
        membership = new Support(membership);
        membership = new UnlimitedDevices(membership);

        System.out.println(typeMembership);


        for(int i = 0; i < membership.getAllBenefits().size(); i++){
            System.out.println(membership.getAllBenefits().get(i));
        }
        System.out.println(membership.getCost());
        System.out.println();
        System.out.println();
    }
}

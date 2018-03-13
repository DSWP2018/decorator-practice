package com.iteso.decorator;

import com.iteso.decorator.memberships.*;

public class MyFreeMembership {
    /**
     * type
     */
    public static String typeMembership = "Free Membership";


    public static final int DOWNLOAD_CAPACITY = 150;
    public static final int COST = 0;
    public static final int CLOUD_STORAGE = 50;
    public static final int ALLOWED_DEVICES = 1;
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final int SIMULTANEOUS_LOGINS = 1;
    public static final boolean SUPPORT = false;
    public static final String FREE = "Free";
    public static final boolean UNLIMITED_DEVICES = false;

    public MyFreeMembership(){
        Membership membership = new MembershipBase();
        membership = new DownloadCapacity150(membership);
        membership = new CloudStorage50(membership);
        membership = new AllowedDevices1(membership);
        membership = new SimultaneousLogins1(membership);

        System.out.println(typeMembership);

        for(int i = 0; i < membership.getAllBenefits().size(); i++) {
            System.out.println(membership.getAllBenefits().get(i));
        }
        System.out.println(membership.getCost());
        System.out.println();
        System.out.println();
    }
}

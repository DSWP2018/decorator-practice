package com.iteso.decorator.memberships.memberships;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Membership {

    /*public static final int DOWNLOAD_CAPACITY = 1000;
    public static final int COST = 599;
    public static final int CLOUD_STORAGE = 500;
    public static final int ALLOWED_DEVICES = 10;
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    public static final int SIMULTANEOUS_LOGINS = 3;
    public static final boolean SUPPORT = true;
    public static final String GOLD = "Gold";
    public static final boolean UNLIMITED_DEVICES = false;*/

    public FreeMembership() { description = "Free"; }

    public int DOWNLOAD_CAPACITY(){ return 150;}
    public int COST(){ return 0;}
    public int CLOUD_STORAGE(){ return 50; }
    public int ALLOWED_DEVICES(){return 1; }
    public int SIMULTANEOUS_LOGINS(){return 1; }
    public boolean SUPPORT(){return false;}
    public boolean UNLIMITED_DEVICES() {return false;}
}


/*    public static final int DOWNLOAD_CAPACITY = 150;
    public static final int COST = 0;
    public static final int CLOUD_STORAGE = 50;
    public static final int ALLOWED_DEVICES = 1;
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final int SIMULTANEOUS_LOGINS = 1;
    public static final boolean SUPPORT = false;
    public static final String FREE = "Free";
    public static final boolean UNLIMITED_DEVICES = false;*/
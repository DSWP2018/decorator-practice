package com.iteso.decorator.memberships.memberships;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Membership {

    /*public static final int DOWNLOAD_CAPACITY = 1000;
    public static final int COST = 599;
    public static final int CLOUD_STORAGE = 500;
    public static final int ALLOWED_DEVICES = 10;
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    public static final int SIMULTANEOUS_LOGINS = 3;
    public static final boolean SUPPORT = true;
    public static final String GOLD = "Gold";
    public static final boolean UNLIMITED_DEVICES = false;*/

    public UltimateMembership() { description = "Ultimate"; }

    public int DOWNLOAD_CAPACITY(){ return 3000;}
    public int COST(){ return 1299;}
    public int CLOUD_STORAGE(){ return 1000; }
    public int ALLOWED_DEVICES(){return -1; }
    public int SIMULTANEOUS_LOGINS(){return 20; }
    public boolean SUPPORT(){return true;}
    public boolean UNLIMITED_DEVICES() {return true;}

        /*setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(GOLD);
        setUnlimitedDevices(UNLIMITED_DEVICES);*/

}


/*  public static final int DOWNLOAD_CAPACITY = 3000;
    public static final int COST = 1299;
    public static final int CLOUD_STORAGE = 1000;
    public static final int ALLOWED_DEVICES = -1;
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    public static final int SIMULTANEOUS_LOGINS = 20;
    public static final boolean SUPPORT = true;
    public static final String ULTIMATE = "Ultimate";
    public static final boolean UNLIMITED_DEVICES = true;*/
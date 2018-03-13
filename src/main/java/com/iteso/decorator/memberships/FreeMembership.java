package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Benefits {


    public static final Integer DOWNLOAD_CAPACITY = 150;
    public static final Integer COST = 0;
    public static final Integer CLOUD_STORAGE = 50;
    public static final Integer ALLOWED_DEVICES = 1;
   // public static final String GOLD_MEMBERSHIP = "Free Membership";
    public static final Integer SIMULTANEOUS_LOGINS = 1;
    public static final Boolean SUPPORT = false;
    //public static final String FREE = "Free";
    public static final Boolean UNLIMITED_DEVICES = false;

    public  FreeMembership(Membership membersh){
        setMembership(membersh);
        setBenefits();
        membersh.setDescription(getDescription());
        membersh.setCost(this.COST);
    }

    public ArrayList getAllBenefits() {
        return getMembership().getAllBenefits();
    }

    @Override
    public void setBenefits() {
        getMembership().getAllBenefits().add(DOWNLOAD_CAPACITY);
        getMembership().getAllBenefits().add(CLOUD_STORAGE);
        getMembership().getAllBenefits().add(ALLOWED_DEVICES);
        getMembership().getAllBenefits().add(SIMULTANEOUS_LOGINS);
        getMembership().getAllBenefits().add(SUPPORT);
        getMembership().getAllBenefits().add(UNLIMITED_DEVICES);
    }

    @Override
    public String getDescription() {
        return "Free Membership";
    }

    @Override
    public int getCost() {
        return this.COST;
    }
}

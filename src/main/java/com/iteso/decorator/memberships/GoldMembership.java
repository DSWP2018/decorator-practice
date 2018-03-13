package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {


    public static final Integer DOWNLOAD_CAPACITY = 1000;
    public static final Integer COST = 599;
    public static final Integer CLOUD_STORAGE = 500;
    public static final Integer ALLOWED_DEVICES = 10;
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    public static final Integer SIMULTANEOUS_LOGINS = 3;
    public static final Boolean SUPPORT = true;
    public static final String GOLD = "Gold";
    public static final boolean UNLIMITED_DEVICES = false;

    public GoldMembership(Membership membersh) {
        setMembership(membersh);
        setBenefits();
        membersh.setCost(this.COST);
        membersh.setDescription(getDescription());
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
        return "Gold";
    }

    @Override
    public int getCost() {
        return this.COST;
    }
}

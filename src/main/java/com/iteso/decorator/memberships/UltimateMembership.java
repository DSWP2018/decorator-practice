package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.lang.reflect.Member;
import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Benefits {


    public static final int DOWNLOAD_CAPACITY = 3000;
    public static final int COST = 1299;
    public static final int CLOUD_STORAGE = 1000;
    public static final int ALLOWED_DEVICES = -1;
    public static final String GOLD_MEMBERSHIP = "Ultimate Membership";
    public static final int SIMULTANEOUS_LOGINS = 20;
    public static final boolean SUPPORT = true;
    public static final String ULTIMATE = "Ultimate";
    public static final boolean UNLIMITED_DEVICES = true;

    public UltimateMembership(Membership membersh) {
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
        return "Platinum";
    }

    @Override
    public int getCost() {
        return this.COST;
    }
}

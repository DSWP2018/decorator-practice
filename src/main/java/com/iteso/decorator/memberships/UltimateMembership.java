package com.iteso.decorator.memberships;
import com.iteso.decorator.AllowDevices;
import com.iteso.decorator.CloudStorage;
import com.iteso.decorator.DowloadCapacity;
import com.iteso.decorator.Membership;
import com.iteso.decorator.SimultaneousLogins;
import com.iteso.decorator.Support;
import com.iteso.decorator.SupportCoverage;
import com.iteso.decorator.UnlimitedDevices;
/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Membership {
/***VAR.**/
public static final int I = 6;
/***VAR.**/
public static final int A = 6;
/***VAR.**/
public static final int C = 6;
/***VAR.**/
public static final int D = 6;
/***VAR.**/
private Membership membership = new BaseMembership();
/***VAR.**//*
public static final String GOLD_MEMBERSHIP = "Ultimate Membership";*/
/***Constructor.**/
public UltimateMembership() {
membership = new AllowDevices(I);
membership = new CloudStorage(A);
membership = new DowloadCapacity(D);
membership = new SimultaneousLogins(C);
membership = new SupportCoverage("Unlimite");
membership = new Support(true);
membership = new UnlimitedDevices(true);
}
/***@return double.**/
@Override
public final double getCost() {
return membership.getCost();
}
}

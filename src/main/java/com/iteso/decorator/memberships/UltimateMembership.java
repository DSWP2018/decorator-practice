package com.iteso.decorator.memberships;

import com.iteso.decorator.Allow_devices;
import com.iteso.decorator.Cloud_storage;
import com.iteso.decorator.Dowload_Capacity;
import com.iteso.decorator.Membership;
import com.iteso.decorator.Simultaneous_logins;
import com.iteso.decorator.Support;
import com.iteso.decorator.Support_coverage;
import com.iteso.decorator.Unlimited_devices;

import java.util.ArrayList;
/**
 * Created by rvillalobos on 4/14/16.
 */
public class UltimateMembership extends Membership {
/***VAR**/
Membership membership = new BaseMembership();
/***VAR**//*
public static final String GOLD_MEMBERSHIP = "Ultimate Membership";*/
/***Constructor**/
public UltimateMembership() {
membership=new Allow_devices(6);
membership=new Cloud_storage(5);
membership=new Dowload_Capacity(4);
membership=new Simultaneous_logins(3);
membership=new Support_coverage("Unlimite");
membership=new Support(true);
membership=new Unlimited_devices(true);
}
/***@return double**/
@Override
public double getCost() {
return membership.getCost();
}
}

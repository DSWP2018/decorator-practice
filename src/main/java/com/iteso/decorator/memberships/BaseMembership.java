package com.iteso.decorator.memberships;


import com.iteso.decorator.Membership;
/*****/
public class BaseMembership extends Membership {
/***var.**/
public static final double COST = 8;
/***var.**/
public static final String DESCRIPTIONBM = "Membership";
/***constructor.**/
public BaseMembership() {
setDescription(DESCRIPTIONBM);
}
/***@return double.**/
@Override
public final double getCost() {
return COST;
}
}

package com.iteso.decorator;

import com.iteso.decorator.memberships.BenefitsDecorator;

/***CLASS**/
public class  Unlimited_devices extends BenefitsDecorator{
/***VAT=R**/
public static final double cost=.5;
/***VATR**/
private static boolean hasUnlimited;
/***Constructor**/
public Unlimited_devices(final boolean unli) {
hasUnlimited=unli;
}
/***VAR**/
public static final String des=" with simultaneous logins";
/***Membership**/
Membership m;
/***@return String**/
public String getDescription() {
if(hasUnlimited)
return m.getDescription() + des;
else
return m.getDescription();
}
/***@return double**/
public double getCost() {
if(hasUnlimited)
return  cost+ m.getCost();
else
return m.getCost();
}
}

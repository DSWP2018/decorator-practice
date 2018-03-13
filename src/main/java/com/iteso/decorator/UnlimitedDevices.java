package com.iteso.decorator;

import com.iteso.decorator.memberships.BenefitsDecorator;

/***CLASS.**/
public class  UnlimitedDevices extends BenefitsDecorator {
/***VAT=R.**/
public static final double COST = .5;
/***VATR.**/
private static boolean hasUnlimited;
/***@param unli boolean.**/
public UnlimitedDevices(final boolean unli) {
hasUnlimited = unli;
}
/***VAR.**/
public static final String DES = " with simultaneous logins";
/***Membership.**/
private Membership m;
/***@return String.**/
public final String getDescription() {
if (hasUnlimited) {
return m.getDescription() + DES;
} else {
return m.getDescription();
}
}
/***@return double.**/
public final double getCost() {
if (hasUnlimited) {
return  COST + m.getCost();
} else {
return m.getCost();
}
}
}

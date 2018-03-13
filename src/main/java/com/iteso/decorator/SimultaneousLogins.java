package com.iteso.decorator;

import com.iteso.decorator.memberships.BenefitsDecorator;
/***CLASS.**/
public class SimultaneousLogins extends BenefitsDecorator {
/***VAT=R.**/
public static final double COST =.5;
/***VATR.**/
private static double amount;
/***VAR.**/
public static final String DES =" with simultaneous logins";
/***Membership.**/
Membership m;
/***Constructor.**/
public SimultaneousLogins (final double am){
amount = am;
}
/***@return String.**/
public final String getDescription() {
return m.getDescription() + DES;
}
/***@return double.**/
public final double getCost() {
return COST + m.getCost();
}
}

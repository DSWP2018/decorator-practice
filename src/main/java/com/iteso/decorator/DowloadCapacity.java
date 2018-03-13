package com.iteso.decorator;
import com.iteso.decorator.memberships.BenefitsDecorator;
/***CLASS.**/
public class  DowloadCapacity extends BenefitsDecorator {
/***VATR.**/
public static final double COST = .5;
/***VATR.**/
private static double amount;
/***@param ramount.**/
public DowloadCapacity(final int ramount) {
amount = ramount;
}
/***VAR.**/
public static final String DES =" with";
/***Membership.**/
private Membership m;
/***@return String.**/
public final String getDescription() {
return m.getDescription() + DES;
}
/***@return double.**/
public final double getCost() {
return (COST * amount) + m.getCost();
}
}

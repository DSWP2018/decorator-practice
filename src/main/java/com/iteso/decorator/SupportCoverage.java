package com.iteso.decorator;
import com.iteso.decorator.memberships.BenefitsDecorator;

/***CLASS.**/
public class SupportCoverage extends BenefitsDecorator {
/***VAT=R.**/
public static final double COST = .5;
/***VATR.**/
private static String coverage;
/***@param cove.**/
public SupportCoverage(final String cove) {
coverage=cove;
}
/***Membership.**/
Membership m;
/***@return String.**/
public String getDescription() {
return m.getDescription() + " " + coverage;
}
/***@return double.**/
public double getCost() {
return  COST + m.getCost();
}
}

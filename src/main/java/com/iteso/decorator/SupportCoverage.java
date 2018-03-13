package com.iteso.decorator;
import com.iteso.decorator.memberships.BenefitsDecorator;

/***CLASS.**/
public class SupportCoverage extends BenefitsDecorator {
/***VAT=R.**/
public static final double COST = .5;
/***VATR.**/
private static String coverage;
/***@param cove String.**/
public SupportCoverage(final String cove) {
coverage = cove;
}
/***Membership.**/
private Membership m;
/***@return String.**/
public final String getDescription() {
return m.getDescription() + " " + coverage;
}
/***@return double.**/
public final double getCost() {
return  COST + m.getCost();
}
}

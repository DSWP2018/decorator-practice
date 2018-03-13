package com.iteso.decorator;

import com.iteso.decorator.memberships.BenefitsDecorator;
/***CLASS.**/
public class  Support extends BenefitsDecorator {
/***VAT=R.**/
public static final double COST = .5;
/***VATR.**/
private boolean hasSupport;
/***@param support boolean.**/
public Support(final boolean support) {
hasSupport = support;
}
/***VAR.**/
public static final String DES = " with support";
/***Membership.**/
private Membership m;
/***@return String.**/
public final String getDescription() {
if (hasSupport) {
return m.getDescription() + DES;
} else {
return m.getDescription();
}
}
/***@return double.**/
public final double getCost() {
if (hasSupport) {
return  COST + m.getCost();
} else {
return m.getCost();
}
}
}

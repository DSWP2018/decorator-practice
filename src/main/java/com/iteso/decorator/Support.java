package com.iteso.decorator;

import com.iteso.decorator.memberships.BenefitsDecorator;
/***CLASS**/
public class  Support extends BenefitsDecorator{
/***VAT=R**/
public static final double cost=.5;
/***VATR**/
private boolean hasSupport;
/***Constructor**/
public Support(final boolean support) {
hasSupport=support;
}
/***VAR**/
public static final String des=" with support";
/***Membership**/
Membership m;
/***@return String**/
public String getDescription() {
if(hasSupport)
return m.getDescription() + des;
else
return m.getDescription();
}
/***@return double**/
public double getCost() {
if(hasSupport)
return  cost+ m.getCost();
else
return m.getCost();
}
}

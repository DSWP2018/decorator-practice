package com.iteso.decorator;

/**
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public abstract class Membership {
/***var.**/
private static String description;
/**@param a String***/
public final void setDescription(final String a) {
description = a;
}
/***@return double.**/
public abstract double getCost();
/***@return String.**/
public final String getDescription() {
return description;
}
}

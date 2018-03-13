package com.iteso.decorator;

/**
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public abstract class Membership {
/***var.**/
protected String description;
public void setDescription() {
	this.description = "Any Membership";
}
/***@return description.**/
public final String getDescription() {
return description;
}
/***@return double.**/
public abstract double getCost();
}

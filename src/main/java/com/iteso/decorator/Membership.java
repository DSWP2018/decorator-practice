package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Membership {
    private static ArrayList ADDBENEFITS = new ArrayList<Object>();
    private String description = "";
    private int cost = 5;


    public ArrayList getAllBenefits() {
        return this.ADDBENEFITS;
    }

    public void setDescription(String des){
        this.description = des;
    }

    public String getDescription(){
        return this.description;
    }

    public void setCost(int co){
        this.cost += co;
    }

    public abstract void setBenefits();

}

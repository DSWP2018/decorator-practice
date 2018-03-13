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

    ArrayList benefits;

    public ArrayList getBenefits() {
        return benefits;
    }

    public void setBenefits(ArrayList benefits) {
        this.benefits = benefits;
    }

    public abstract ArrayList getAllBenefits();

    public abstract double getCost();


}

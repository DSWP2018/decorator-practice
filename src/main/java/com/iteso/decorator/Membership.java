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
    /**
     * Arreglo con los beneficios objeto
     */
    private ArrayList benefits;
    /**
     * Costo de la membresia
     */
    private double cost=0;

    /**
     *
     * @return todos los beneficios
     */
    public ArrayList getAllBenefits() {
        return benefits;
    }

    /**
     * Agrega un beneficio nuevo
     * @param newBenefit
     */
    public final void setBenefit(final Membership newBenefit) {
        benefits.add(newBenefit);
    }

    /**
     * Altera el costo de la membresia
     * @param cost
     */
    public void setCost(double cost) {
        this.cost += cost;
    }

    /**
     *
     * @return el costo
     */
    public double getCost() {
        return cost;
    }
  }

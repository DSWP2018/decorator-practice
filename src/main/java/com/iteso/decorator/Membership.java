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
     * Descripción.
     */
    private String description = "This is a Membership";
    /**
     * Costo.
     */
    private double cost = 0;
    /**
     * Lista de los beneficios.
     */
    private ArrayList benefits = new ArrayList();

    /**
     * Fija descripción.
     * @param desc descipcio´n externa.
     */
    public final void setDescription(final String desc) {
        this.description = desc;
    }

    /**
     * devuelve descripción.
     * @return desc.
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * setter de costo.
     * @param costs costo.
     */
    public final void setCost(final double costs) {
        this.cost = costs;
    }

    /**
     * getter de costo.
     * @return costo.
     */
    public final double getCost() {
        return this.cost;
    }

    /**
     * getter de los beneficios.
     * @return beneficios.
     */
    public final ArrayList getAllBenefits() {
        return this.benefits;
    }

    /**
     * agregar un beneficio a la lista.
     * @param benefit puede ser cualquiera de los decoradores.
     */
    public final void setBenefits(final String benefit) {
        this.benefits.add(benefit);
    }

}

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
     * Variable de tipo string con la descripción.
     */
    private String description = "Any Membership";
    /**
     * Variable de tipo int de almacenamiento nube.
     */
    private int cloudStorage = 0;
    /**
     *  Variable de tipo int de los logins simultaneos.
     */
    private int simultaneousLogins = 0;
    /**
     * Variable de tipo booleano para saber si una membresía.
     * tiene devices ilimitados.
     */
    private boolean unlimitedDevices = false;
    /**
     * Variable de tipo int que almacena el número de.
     * devices que se permiten.
     */
    private int allowedDevices = 0;
    /**
     * Variable de tipo double que almacena el costo de la membresía.
     */
    private double cost = 0;
    /**
     * Variable de tipo int que almacena la capacidad de descarga.
     */
    private int downloadCapacity = 0;
    /**
     * Variable de tipo boolean para saber si tiene soporte.
     */
    private boolean support = false;
    /**
     * Variable de tipo String que almacena la cobertura de soporte.
     */
    private String supportCoverage = null;

    /**
     * Método para obtener la descripción.
     * @return descripcion.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Método abstracto que regresa la lista de beneficios.
     * @return benefits.
     */
    public abstract ArrayList getAllBenefits();

    /**
     * Método para establecer la descripción de membresia.
     * @param des descripción.
     */
    public final void setDescription(final String des) {
        this.description = des;
    }

    /**
     * Metodo para obtener el almacenamiento nube.
     * @return cloudstorage.
     */
    public final int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * Método para establecer el almacenamiento nube.
     * @param clSt almacenamiento nube.
     */
    public final void setCloudStorage(final int clSt) {
        this.cloudStorage = clSt;
    }

    /**
     * Metodo para obtener el número de logins simultaneos.
     * @return logins simultaneos.
     */
    public final int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     * Metodo para establecer el número de logins simultaneos.
     * @param simLogIn logins simultaneos.
     */
    public final void setSimultaneousLogins(final int simLogIn) {
        this.simultaneousLogins = simLogIn;
    }

    /**
     * Metodo para conocer si tiene devices ilimitados.
     * @return boolean.
     */
    public final boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * Método para establecer si hay devices ilimitados.
     * @param unlim boolean.
     */
    public final void setUnlimitedDevices(final boolean unlim) {
        this.unlimitedDevices = unlim;
    }

    /**
     * Método para obtener el numero de devices permitidos.
     * @return devices permitidos.
     */
    public final int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * Método para establecer el numero de devices permitidos.
     * @param allowed devices permitidos.
     */
    public final void setAllowedDevices(final int allowed) {
        this.allowedDevices = allowed;
    }

    /**
     * Metodo para obtener el costo.
     * @return costo.
     */
    public final double getCost() {
        return cost;
    }

    /**
     * Metodo para establecer el costo.
     * @param costs double.
     */
    public final void setCost(final double costs) {
        this.cost = costs;
    }

    /**
     * Metodo para obtener la capacidad de descarga.
     * @return capacidad de descarga.
     */
    public final int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * Metodo para establecer la capacidad de descarga.
     * @param download int.
     */
    public final void setDownloadCapacity(final int download) {
        this.downloadCapacity = download;
    }

    /**
     * Metodo para conocer si es soporte o no.
     * @return soporte.
     */
    public final boolean isSupport() {
        return support;
    }

    /**
     * Metodo para establecer si la membresía soporta o no.
     * @param supp boolean.
     */
    public final void setSupport(final boolean supp) {
        this.support = supp;
    }

    /**
     * Metodo para obtener la cobertura de soporte.
     * @return cobertura de soporte.
     */
    public final String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * Metodo para establecer la cobertura de soporte.
     * @param coverage string.
     */
    public final void setSupportCoverage(final String coverage) {
        this.supportCoverage = coverage;
    }
}

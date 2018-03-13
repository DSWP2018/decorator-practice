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
    /**Atributo que sirve para describir el tipo de membresía.*/
    private String description = "Any Membership";
    /**Atributo que sirve para indicar el storage en la nube.*/
    private int cloudStorage = 0;
    /**Atributo que sirve para especificar el número de logins permitidos
     * simultaneamente.*/
    private int simultaneousLogins = 0;
    /**Atributo que sirve para describir si se permiten
     * dispositios ilimitados.*/
    private boolean unlimitedDevices = false;
    /**Atributo que sirve para indicar el numero de dispositivos permitidos.*/
    private int allowedDevices = 0;
    /**Atributo que sirve para señalar el costo de la membresía.*/
    private double cost = 0;
    /**Atributo que sirve para describir el tipo de membresía.*/
    private int downloadCapacity = 0;
    /**Atributo que sirve para indicar si incluye soporte.*/
    private boolean support = false;
    /**Atributo que sirve para señalar lo que cubre el soporte.*/
    private String supportCoverage = null;

    /**
     * Método para obtener la descripción de la membresía.
     * @return String con el resultado.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Método abstracto para obtener los beneficios.
     * @return ArrayList con la lista de beneficios.
     */
    public abstract ArrayList getAllBenefits();

    /**
     * Método para guardar la descripción.
     * @param setDescription con la descripción a establecer.
     */
    public final void setDescription(final String setDescription) {
        this.description = setDescription;
    }

    /**
     * Método para obtener el storage en la nube.
     * @return int con el storage.
     */
    public final int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * Método para guardar el storage en la nube.
     * @param setCloudStorage con lo que se deberá guardar.
     */
    public final void setCloudStorage(final int setCloudStorage) {
        this.cloudStorage = setCloudStorage;
    }

    /**
     * Método para obtener el número de logins simultáneos.
     * @return int con el número de logins simultáneos.
     */
    public final int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     * Método para guardar el número de logins simultáneos.
     * @param setSimultaneousLogins con el número de logins simultáneos.
     */
    public final void setSimultaneousLogins(final int setSimultaneousLogins) {
        this.simultaneousLogins = setSimultaneousLogins;
    }

    /**
     * Método para saber si la membresía cuenta con dispositivos ilimitados.
     * @return boolean verdadero o falso.
     */
    public final boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * Método para configurar si se cuenta con dispositivos ilimitados.
     * @param setUnlimitedDevices para determinar si la opción está
     * disponible o no.
     */
    public final void setUnlimitedDevices(final boolean setUnlimitedDevices) {
        this.unlimitedDevices = setUnlimitedDevices;
    }

    /**
     * Método para obtener el número de dispositivos permitidos.
     * @return int con los dispositivos permitidos.
     */
    public final int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * Método para señalar el numero de dispositivos permitidos.
     * @param setAllowedDevices la cantidad de dispositivos permitidos.
     */
    public final void setAllowedDevices(final int setAllowedDevices) {
        this.allowedDevices = setAllowedDevices;
    }

    /**
     * Método para obtener el costo.
     * @return double con el costo de la membresía.
     */
    public final double getCost() {
        return cost;
    }

    /**
     * Método para guardar el costo.
     * @param setCost para definir el costo.
     */
    public final void setCost(final double setCost) {
        this.cost = setCost;
    }

    /**
     * Método para señalar la capacidad de descarga.
     * @return int con la capacidad.
     */
    public final int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * Método para guardar la capacidad de descarga.
     * @param setDownloadCapacity con la capacidad de descarga determinada.
     */
    public final void setDownloadCapacity(final int setDownloadCapacity) {
        this.downloadCapacity = setDownloadCapacity;
    }

    /**Método para saber si cuenta con soporte.
     * @return boolean si cuenta o no.
     */
    public final boolean isSupport() {
        return support;
    }

    /**
     * Método para indicar si se cuenta o no con soporte.
     * @param setSupport para indicar si cuenta con soporte o no.
     */
    public final void setSupport(final boolean setSupport) {
        this.support = setSupport;
    }

    /**
     * Método para saber qué cubre el soporte.
     * @return String con la cobertura del soporte.
     */
    public final String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * Método para indicar qué cubre el soporte.
     * @param setSupportCoverage con lo que cubre.
     */
    public final void setSupportCoverage(final String setSupportCoverage) {
        this.supportCoverage = setSupportCoverage;
    }
}

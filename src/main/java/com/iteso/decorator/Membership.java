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
     * Variable de membership.
     */
    private String description = "Any Membership";
    /**
     * Variable de membership.
     */
    private int cloudStorage = 0;
    /**
     * Variable de membership.
     */
    private int simultaneousLogins = 0;
    /**
     * Variable de membership.
     */
    private boolean unlimitedDevices = false;
    /**
     * Variable de membership.
     */
    private int allowedDevices = 0;
    /**
     * Variable de membership.
     */
    private double cost = 0;
    /**
     * Variable de membership.
     */
    private int downloadCapacity = 0;
    /**
     * Variable de membership.
     */
    private boolean support = false;
    /**
     * Variable de membership.
     */
    private String supportCoverage = null;

    /**
     * metodo.
     * @return des
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Arraylist.
     * @return null
     */
    public abstract ArrayList getAllBenefits();

    /**
     * Método de membership.
     * @param myDescription description
     */
    public final void setDescription(final String myDescription) {
        this.description = myDescription;
    }

    /**
     * Método de membership.
     * @return storage
     */
    public final int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * Método de membership.
     * @param myCloudStorage storage
     */
    public final void setCloudStorage(final int myCloudStorage) {
        this.cloudStorage = myCloudStorage;
    }

    /**
     * Método de membership.
     * @return logins
     */
    public final int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     * Método de membership.
     * @param mySimultaneousLogins log
     */
    public final void setSimultaneousLogins(final int mySimultaneousLogins) {
        this.simultaneousLogins = mySimultaneousLogins;
    }

    /**
     * Método de membership.
     * @return devices
     */
    public final boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * Método de membership.
     * @param myUnlimitedDevices devices-
     */
    public final void setUnlimitedDevices(final boolean myUnlimitedDevices) {
        this.unlimitedDevices = myUnlimitedDevices;
    }

    /**
     * Método de membership.
     * @return devices
     */
    public final int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * Método de membership.
     * @param myAllowedDevices devices
     */
    public final void setAllowedDevices(final int myAllowedDevices) {
        this.allowedDevices = myAllowedDevices;
    }

    /**
     * Método de membership.
     * @return costo
     */
    public final double getCost() {
        return cost;
    }

    /**
     * Método de membership.
     * @param myCost costo
     */
    public final void setCost(final double myCost) {
        this.cost = myCost;
    }

    /**
     * Método de membership.
     * @return download
     */
    public final int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * Método de membership.
     * @param myDownloadCapacity download
     */
    public final void setDownloadCapacity(final int myDownloadCapacity) {
        this.downloadCapacity = myDownloadCapacity;
    }

    /**
     * Método de membership.
     * @return support
     */
    public final boolean isSupport() {
        return support;
    }

    /**
     * Método de membership.
     * @param mySupport support
     */
    public final void setSupport(final boolean mySupport) {
        this.support = mySupport;
    }

    /**
     * Método de membership.
     * @return support
     */
    public final String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * Método de membership.
     * @param mySupportCoverage coverage
     */
    public final void setSupportCoverage(final String mySupportCoverage) {
        this.supportCoverage = mySupportCoverage;
    }
}

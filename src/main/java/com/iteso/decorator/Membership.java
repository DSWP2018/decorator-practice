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

    /** Description. */
    private String description = "Any Membership";

    /** Cloud storage. */
    private int cloudStorage = 0;

    /** Simultaneous logins. */
    private int simultaneousLogins = 0;

    /** Unlimited devices. */
    private boolean unlimitedDevices = false;

    /** Allowed devices. */
    private int allowedDevices = 0;

    /** Cost. */
    private double cost = 0;

    /** Download capacity. */
    private int downloadCapacity = 0;

    /** Support. */
    private boolean support = false;

    /** Support coverage. */
    private String supportCoverage = null;

    /** arrayList of the benefits. */
    private ArrayList<String> benefitArray = new ArrayList<>();

    /**
     * Get the description.
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get all benefits.
     * @return benefit array.
     */
    public ArrayList getAllBenefits() {
        return benefitArray;
    }

    /**
     * Set the description.
     * @param description String value.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the cloud storage.
     * @return the cloud storage.
     */
    public int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * Set the cloud storage.
     * @param cloudStorage int value.
     */
    public void setCloudStorage(int cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    /**
     * Get simultaneous log ins.
     * @return the simultaneous log ins.
     */
    public int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     * Set simultaneous log ins.
     * @param simultaneousLogins int value.
     */
    public void setSimultaneousLogins(int simultaneousLogins) {
        this.simultaneousLogins = simultaneousLogins;
    }

    /**
     * Check if is unlimited devices.
     * @return boolean value.
     */
    public boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * Set unlimited devices.
     * @param unlimitedDevices boolean value.
     */
    public void setUnlimitedDevices(boolean unlimitedDevices) {
        this.unlimitedDevices = unlimitedDevices;
    }

    /**
     * Get the allowed devices.
     * @return allowed devices.
     */
    public int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * Set the allowed devices.
     * @param allowedDevices int value.
     */
    public void setAllowedDevices(int allowedDevices) {
        this.allowedDevices = allowedDevices;
    }

    /**
     * Get the cost.
     * @return the cost.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Set the cost.
     * @param cost double value.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Get the download capacity.
     * @return the download capacity.
     */
    public int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * Set the Download capacity.
     * @param downloadCapacity int value.
     */
    public void setDownloadCapacity(int downloadCapacity) {
        this.downloadCapacity = downloadCapacity;
    }

    /**
     * Check if is Support.
     * @return boolean value
     */
    public boolean isSupport() {
        return support;
    }

    /**
     * Set the support.
     * @param support boolean value.
     */
    public void setSupport(boolean support) {
        this.support = support;
    }

    /**
     * Get the support coverage.
     * @return the support coverage.
     */
    public String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * Set the support coverage.
     * @param supportCoverage String value.
     */
    public void setSupportCoverage(String supportCoverage) {
        this.supportCoverage = supportCoverage;
    }
}

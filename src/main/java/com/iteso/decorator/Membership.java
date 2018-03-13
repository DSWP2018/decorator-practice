package com.iteso.decorator;

import com.iteso.decorator.Benefits.AllowedDevices;
import com.iteso.decorator.Benefits.CloudStorage;
import com.iteso.decorator.Benefits.DownloadCapacity;
import com.iteso.decorator.Benefits.SimultaneousLogins;

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
     * just description.
     */
    private String description = "Any Membership";

    /**
     * just cloudStorage.
     */
    private int cloudStorage = 0;

    /**
     * just simultaneousLogins.
     */
    private int simultaneousLogins = 0;

    /**
     * just unlimitedDevices.
     */
    private boolean unlimitedDevices = false;

    /**
     * just allowedDevices.
     */
    private int allowedDevices = 0;

    /**
     * just cost.
     */
    private double cost = 0;

    /**
     * just downloadCapacity.
     */
    private int downloadCapacity = 0;

    /**
     * just support.
     */
    private boolean support = false;

    /**
     * just supportCoverage.
     */
    private String supportCoverage = null;

    /**
     * @return description.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @param description new description.
     */
    public final void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return total amount of cloud storage.
     */
    public final int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * @param cloudStorage new cloud storage.
     */
    public final  void setCloudStorage(final int cloudStorage) {
        CloudStorage cs = new CloudStorage(cloudStorage, this);
    }

    /**
     * @return total amount of simultaneous.
     */
    public final  int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     *
     * @param newLogins new logins.
     */
    public final  void setSimultaneousLogins(final int newLogins) {
        SimultaneousLogins s = new SimultaneousLogins(newLogins, this);
    }

    /**
     * @return true if unlimited devices is true.
     */
    public final  boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * @param unlimitedDevices boolean that unlocks unlimited devices.
     */
    public final  void setUnlimitedDevices(final boolean unlimitedDevices) {
        this.unlimitedDevices = unlimitedDevices;
    }

    /**
     * @return total amount of cloud storage.
     */
    public final  int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * @param allowedDevices new allowed devices.
     */
    public final  void setAllowedDevices(final int allowedDevices) {
        AllowedDevices ad = new AllowedDevices(allowedDevices, this);
    }

    /**
     * @return total cost.
     */
    public final  double getCost() {
        return cost;
    }

    /**
     * @param cost new cost.
     */
    public final  void setCost(final double cost) {
        this.cost = cost;
    }

    /**
     * @return total amount of dwonload capacity.
     */
    public final  int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * @param downloadCapacity new download capacity.
     */
    public final  void setDownloadCapacity(final int downloadCapacity) {

        DownloadCapacity newDc = new DownloadCapacity(downloadCapacity, this);
    }

    /**
     * @return true if there is support.
     */
    public final  boolean isSupport() {
        return support;
    }

    /**
     * @param support boolean that shows the state of support.
     */
    public final  void setSupport(final boolean support) {
        this.support = support;
    }


    /**
     * @return the type of coverage.
     */
    public final  String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * @param supportCoverage new support type.
     */
    public final  void setSupportCoverage(final String supportCoverage) {
        this.supportCoverage = supportCoverage;
    }
}

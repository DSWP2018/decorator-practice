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

    /** Membership description. */
    private String description = "Any Membership";
    /** CloudStorage of membership. */
private int cloudStorage = 0;
/** Logins. */
private int simultaneousLogins = 0;
/** Unlimited devices of membership. */
private boolean unlimitedDevices = false;
/** AllowDevices of membership. */
private int allowedDevices = 0;
/** Cost of membership. */
private double cost = 0;
/** DownloadCapacity of membership. */
private int downloadCapacity = 0;
/** Support. */
private boolean support = false;
/** Support coverage of membership. */
private String supportCoverage = null;

/** Get membership description.
 *  @return description.*/
    public final String getDescription() {
        return description;
    }
/** Get all benefits.
 * @return ArrayList. */
    public abstract ArrayList getAllBenefits();
/** Set membership description.
 * @param description1 .*/
    public final void setDescription(final String description1) {
        this.description = description1;
    }
/** Get membership cloud storage.
 * @return cloudStorage . */
    public final int getCloudStorage() {
        return cloudStorage;
    }
/** Set membership cloud storage.
 * @param cloudStorage1 . */
    public final void setCloudStorage(final int cloudStorage1) {
        this.cloudStorage = cloudStorage1;
    }
/** Get membership simultaneous login.
 * @return simultaneousLogins . */
    public final int getSimultaneousLogins() {
        return simultaneousLogins;
    }
/** Set simultaneous logins.
 * @param simultaneousLogins1 . */
    public final void setSimultaneousLogins(final int simultaneousLogins1) {
        this.simultaneousLogins = simultaneousLogins1;
    }
/** Is unlimited devices.
 * @return uniitedDevices . */
    public final boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }
/** Set unlimited devices.
 * @param unlimitedDevices1 . */
    public final void setUnlimitedDevices(final boolean unlimitedDevices1) {
        this.unlimitedDevices = unlimitedDevices1;
    }
/** Get allowed devices.
 * @return allowedDevices . */
    public final int getAllowedDevices() {
        return allowedDevices;
    }
/** Set allowed devices.
 * @param allowedDevices1 . */
    public final void setAllowedDevices(final int allowedDevices1) {
        this.allowedDevices = allowedDevices1;
    }
/** Get cost of membership.
 * @return cost . */
    public final double getCost() {
        return cost;
    }
/** Set cost of membership.
 * @param cost1 . */
    public final void setCost(final double cost1) {
        this.cost = cost1;
    }
/** Get membership download capacity.
 * @return downloadCapacity . */
    public final int getDownloadCapacity() {
        return downloadCapacity;
    }
/** Set membership download capacity.
 * @param downloadCapacity1 . */
    public final void setDownloadCapacity(final int downloadCapacity1) {
        this.downloadCapacity = downloadCapacity1;
    }
/** Is support.
 * @return support . */
    public final boolean isSupport() {
        return support;
    }
/** Set support.
 * @param support1 . */
    public final void setSupport(final boolean support1) {
        this.support = support1;
    }
/** Get support coverage.
 * @return  supportCoverage . */
    public final String getSupportCoverage() {
        return supportCoverage;
    }
/** Set support coverage.
 * @param supportCoverage1 . */
    public final void setSupportCoverage(final String supportCoverage1) {
        this.supportCoverage = supportCoverage1;
    }
}

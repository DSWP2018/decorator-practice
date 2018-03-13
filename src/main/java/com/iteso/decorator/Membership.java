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
    private String description = "Any Membership";
private int cloudStorage = 0;
private int simultaneousLogins = 0;
private boolean unlimitedDevices = false;
private int allowedDevices = 0;
private double cost = 0;
private int downloadCapacity = 0;
private boolean support = false;
private String supportCoverage = null;


    private ArrayList<String> benefitArray = new ArrayList<>();
    public ArrayList getAllBenefits() {return benefitArray;}
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(int cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    public int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    public void setSimultaneousLogins(int simultaneousLogins) {
        this.simultaneousLogins = simultaneousLogins;
    }

    public boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    public void setUnlimitedDevices(boolean unlimitedDevices) {
        this.unlimitedDevices = unlimitedDevices;
    }

    public int getAllowedDevices() {
        return allowedDevices;
    }

    public void setAllowedDevices(int allowedDevices) {
        this.allowedDevices = allowedDevices;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDownloadCapacity() {
        return downloadCapacity;
    }

    public void setDownloadCapacity(int downloadCapacity) {
        this.downloadCapacity = downloadCapacity;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public String getSupportCoverage() {
        return supportCoverage;
    }

    public void setSupportCoverage(String supportCoverage) {
        this.supportCoverage = supportCoverage;
    }
}

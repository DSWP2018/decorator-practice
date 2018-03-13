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
     * Clase para morir.
     */
    private String description = "Any Membership";
    /**
     * Comentario.
     */
    private int cloudStorage = 0;
    /**
     * Otro comentario.
     */
    private int simultaneousLogins = 0;
    /**
     * Más comentarios.
     */
    private boolean unlimitedDevices = false;
    /**
     * IGWS.
     */
    private int allowedDevices = 0;
    /**
     * It goes without saying.
     */
    private double cost = 0;
    /**
     * No recuerdo por qué había.
     */
    private int downloadCapacity = 0;
    /**
     * Que poner estos.
     */
    private boolean support = false;
    /**
     * Comentarios.
     */
    private String supportCoverage = null;
    /**
     * Aunque estos no son para.
     */
    protected ArrayList<String> allBenefits = new ArrayList<>();

    /**
     *
     * @return la descripción, obvio.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Hace que preguntes.
     * @return lo que estabas preguntando.
     */
    public abstract ArrayList<String> getAllBenefits();

    /**
     * That thingy.
     * @param desc is String.
     */
    public final void setDescription(final String desc) {
        this.description = desc;
    }

    /**
     * Does some things.
     * @return a int.
     */
    public final int getCloudStorage() {
        return cloudStorage;
    }

    /**
     * Wanna hear a joke?.
     * @param cloudStorageU
     */
    public final void setCloudStorage(final int cloudStorageU) {
        this.cloudStorage = cloudStorageU;
    }

    /**
     * It's this.
     * @return a int.
     */
    public final int getSimultaneousLogins() {
        return simultaneousLogins;
    }

    /**
     * Documentation, get it?.
     * @param simultaneousLogs hahaha
     */
    public final void setSimultaneousLogins(final int simultaneousLogs) {
        this.simultaneousLogins = simultaneousLogs;
    }

    /**
     * Wanna hear another joke?.
     * @return some booly stuffy.
     */
    public final boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    /**
     * I just skipped two major words upthere.
     * @param uDevices wellp.
     */
    public final void setUnlimitedDevices(final boolean uDevices) {
        this.unlimitedDevices = uDevices;
    }

    /**
     * And you didn't even notice.
     * @return HAHAHAHAHAHA!
     */
    public final int getAllowedDevices() {
        return allowedDevices;
    }

    /**
     * If you read this, you went back.
     * @param aDevices and read it again.
     */
    public final void setAllowedDevices(final int aDevices) {
        this.allowedDevices = aDevices;
    }

    /**
     * And you didn't, you certanly.
     * @return won't look back.
     */
    public final double getCost() {
        return cost;
    }

    /**
     * Even if I did skipped some words.
     * @param c or not... we'll never k.
     */
    public final void setCost(final double c) {
        this.cost = c;
    }

    /**
     * Do you actually read these things?.
     * @return that's sad.
     */
    public final int getDownloadCapacity() {
        return downloadCapacity;
    }

    /**
     * But not as sad as the other things.
     * @param theDownloadCapacity that I'm thinking.
     */
    public final void setDownloadCapacity(final int theDownloadCapacity) {
        this.downloadCapacity = theDownloadCapacity;
    }

    /**
     * While doing this.
     * @return a boolean.
     */
    public final boolean isSupport() {
        return support;
    }

    /**
     * Isn't that funny?.
     * @param supp something.
     */
    public final void setSupport(final boolean supp) {
        this.support = supp;
    }

    /**
     * This society makes you allienate.
     * @return in different worlds.
     */
    public final String getSupportCoverage() {
        return supportCoverage;
    }

    /**
     * Makes you die.
     * @param supportCoverageF yeah, it's exactly that.
     */
    public final void setSupportCoverage(final String supportCoverageF) {
        this.supportCoverage = supportCoverageF;
    }
}

package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Benefits {

    /**
     * CAPACIDAD DE DESCARGA DE FREE MEMBERSHIP.
     */
    public static final int DOWNLOAD_CAPACITY = 150;
    /**
     * costo de free membership.
     */
    public static final int COST = 0;
    /**
     * almacenamiento nube de free membership.
     */
    public static final int CLOUD_STORAGE = 50;
    /**
     * devices permitidos de free membership.
     */
    public static final int ALLOWED_DEVICES = 1;
    /**
     * Tipo de la membresia.
     */
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    /**
     * Logins simultaneos.
     */
    public static final int SIMULTANEOUS_LOGINS = 1;
    /**
     * Soporte de free membership.
     */
    public static final boolean SUPPORT = false;
    /**
     * Definición.
     */
    public static final String FREE = "Free";
    /**
     * Devices ilimitados definicion.
     */
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * Constructor de Gold membership.
     * @param membership membresía.
     */
    public FreeMembership(final Membership membership) {
        super(membership);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(FREE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    /**
     * Metodo para obtener todos los beneficios.
     * @return benefits.
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}
